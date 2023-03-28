package day0214.inner;

import java.awt.Button; // Button 생성
import java.awt.Frame; // Frame import => 창 생성
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // 이벤트를 처리하는 유틸

public class AnonymusTest {

	public static void main(String[] args) {
		Frame f = new Frame("프레임창");
		Button b = new Button("Press Button");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click!");
			} // 한 군데에서만 사용, 외부에서 사용하지 않으니 익명 inner 클래스로 만들 수 있다.
		});

		f.add(b);

		f.setBounds(100, 100, 300, 300);
		f.setVisible(true); // 프레임 창을 출력한다
	}

}

/*
 * class ClickEvent implements ActionListener { // 인터페이스 implements => 완성시켜야 함
 * // 연결된 객체에 이벤트가 발생하면 자동으로 호출됨
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * System.out.println("click!"); } 
 *  }
 */
