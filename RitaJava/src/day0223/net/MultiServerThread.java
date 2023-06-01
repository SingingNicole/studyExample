package day0223.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MultiServerThread implements Runnable {
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public MultiServerThread(MultiServer ms) {
		this.ms = ms;
	} // 멀티서버 객체 저장

	@Override
	public synchronized void run() { // 동작 메서드
		boolean isStop = false;
		try {
			socket = ms.getSocket();
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			String message = null;
			while (!isStop) {
				message = (String) ois.readObject(); // 메세지 입력
				String[] str = message.split("#"); // 메시지를 # 기준으로 나눔
				// 멀티클라이언트에서 받은 id, exit의 값을 문자열로 받아온다.
				if (str[1].equals("exit")) { // 입력된 값이 exit일 경우
					broadCasting(message); // exit 메시지를 모든 사람들에게 전송
					isStop = true; // 스레드 객체 멈춤
				} else {
					broadCasting(message); // 서버가 접속한 모든 사람들에게 클라이언트의 메시지 전달.
					// 클라이언트가 다음 메시지를 보낼 때까지 대기
				}
			}
			ms.getList().remove(this); // exit 메시지를 보낸 사람은 리스트에서 제거
			System.out.println(socket.getInetAddress() + " 정상적으로 종료하셨습니다");
			// 종료한 사람의 ip주소와 종료 여부
			System.out.println("list size: " + ms.getList().size()); // 남아 있는 사람의 수를 리스트의 크기를 통해 알 수 있다.
		} catch (Exception e) {
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + " 비정상적으로 종료하셨습니다");
			System.out.println("list size: " + ms.getList().size());
		}
	}

	public void broadCasting(String message) throws IOException {
		for (MultiServerThread ct : ms.getList()) {
			ct.send(message); // 서버가 가지고 있는 클라이언트들의 메시지를 보낸다.
		}
	}

	public void send(String message) throws IOException {
		oos.writeObject(message);
	}
}
