package day0220.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {

			toolkit.beep();

			try {

				Thread.sleep(500); // 소리를 내고 0.5초 정지. 그 동안 다른 스레드 동작

			} catch (Exception e) {

			}
		}

	}

}
