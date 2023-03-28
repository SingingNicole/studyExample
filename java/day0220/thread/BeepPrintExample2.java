package day0220.thread;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask(); // 소리를 내는 스레드
		Thread thread = new Thread(beepTask);

		thread.start();

		for (int i = 0; i < 5; i++) {

			System.out.println("삡");

			try {

				Thread.sleep(500); // 0.5초 정지

			} catch (Exception e) {

			}
		} // 소리와 출력이 번갈아 진행되도록 순위 지정
			// 두 개의 작업이 번갈아 수행되어야 한다면 멀티 스레드를 사용한다.

	}

}
