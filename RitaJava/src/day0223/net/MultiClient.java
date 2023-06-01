package day0223.net;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame; // 창 생성, 판넬을 띄움
import javax.swing.JLabel; // 창에서 고정된 문자열을 출력
import javax.swing.JOptionPane;
import javax.swing.JPanel; // 화면에 객체를 붙일 수 있게 함
import javax.swing.JScrollPane;
import javax.swing.JTextArea; // 텍스트 여러 줄 입력
import javax.swing.JTextField; // 텍스트 한 줄 입력

public class MultiClient implements ActionListener {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	// 서버(스트림)에 객체 전달
	private JFrame jframe;
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;
	private String ip; // 접속 서버 ip
	private String id; // 접속 서버 id
	private JButton jbtn;

	public MultiClient(String argIp, String argId) {
		// 클라이언트 객체 생성
		ip = argIp;
		id = argId;
		// 클라이언트 정보 입력
		jframe = new JFrame("Multi Chatting");
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("Usage ID : [[ " + id + "]]");
		jlb2 = new JLabel("IP : " + ip);
		jbtn = new JButton("종료");
		jp1 = new JPanel();
		jp2 = new JPanel();
		// jlb1.setBackground(Color.yellow);
		// jlb2.setBackground(Color.green); // label은 색을 넣지 않음. 인식X
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout()); // 패널 1
		jp2.setLayout(new BorderLayout()); // 패널 2
		jp1.add(jbtn, BorderLayout.EAST); // 버튼 : 동쪽
		jp1.add(jtf, BorderLayout.CENTER); // 텍스트 입력 창 : 센터
		// 패널 1 끝
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		// 패널 2 끝 : 라벨 붙이기
		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);
		// 프레임에 패널 붙임
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		// 스크롤 처리: 항시 존재
		jframe.add(jsp, BorderLayout.CENTER);
		// 프레임 센터에 스크롤판넬 붙임
		jtf.addActionListener(this);
		// 입력창에 ActionPerformed 호출 처리
		jbtn.addActionListener(this);
		// 종료 버튼에 ActionPerformed 호출 처리

		jframe.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) { // 종료버튼 클릭 이벤트
				try {
					oos.writeObject(id + "#exit"); // 서버에게 exit 메시지 남김
				} catch (IOException ee) {
					System.out.println(id);
					ee.printStackTrace();
				}
				System.exit(0); // 시스템이 끝나도 이벤트 진행
			}

			@Override
			public void windowOpened(WindowEvent e) {
				jtf.requestFocus(); // 텍스트필드에 커서 형성
			}

		}); // 창 관련 생성자 끝

		jta.setEditable(false); // 텍스트 창에 직접 입력 금지
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		// 전체 화면의 사이즈 구하기
		jframe.pack(); // 창 안에 구성 요소 꽉 지정
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, (screenHeight - jframe.getHeight()) / 2); // 창의 가운데 위치
		// 프레임 창이 가운데에 올 수 있도록 명령
		jframe.setResizable(false); // 창 크기 변경 불가
		jframe.setVisible(true); // 프레임 창을 화면에 보이게 함
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 처리 메서드. 버튼에 ActionEvent가 발생하면 자동으로 실행된다.
		// 버튼을 클릭하거나 text field에서 enter 입력 시
		Object obj = e.getSource();
		String msg = jtf.getText();
		// 어느 위치에서 이벤트가 발생했는지 obj에 저장, 텍스트 필드에 입력된 문자열 가져옴

		if (obj == jtf) {
			if (msg == null || msg.length() == 0) {
				JOptionPane.showMessageDialog(jframe, "글을 쓰세요", "경고", JOptionPane.WARNING_MESSAGE);
				// 입력하지 않고 enter 누를 경우 현재 jframe 창에 경고창을 띄운다.
			} else {
				try {
					oos.writeObject(id + "#" + msg);
					// 글이 있을 경우 id, #, 메시지를 전송
				} catch (IOException ee) {
					ee.printStackTrace();
				}
				jtf.setText(""); // 빈 문자열로 바꿔서 입력이 끝났으면 텍스트 창을 비움.
				// null 값이면 안 됨!
			}
		} else if (obj == jbtn) { // 버튼에서 입력이 발생했다면
			try {
				oos.writeObject(id + "#exit");
				// 서버에게 아이디와 exit 메시지 전송
			} catch (IOException ee) {
				ee.printStackTrace();
			}
			System.exit(0);
		}
	}

	public void exit() {
		System.exit(0);
	}

	public void init() throws IOException {
		socket = new Socket(ip, 3333);
		System.out.println("connected...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		// 서버에 접속, input, output 접속
		MultiClientThread ct = new MultiClientThread(this); // 입출력하는 멀티스레드
		Thread t = new Thread(ct);
		t.start();
	}

	public static void main(String args[]) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true); // 설정한 그래픽의 윈도우 실행
		MultiClient cc = new MultiClient(args[0], args[1]); // 멀티클라이언트 객체 생성
		cc.init(); // init 메서드 동작 -> 서버 접속
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public JTextArea getJta() {
		return jta;
	}

	public String getId() {
		return id;
	}
}