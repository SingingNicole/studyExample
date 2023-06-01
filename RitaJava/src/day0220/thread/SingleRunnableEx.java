package day0220.thread;

public class SingleRunnableEx implements Runnable {

	private int temp[];

	public SingleRunnableEx() {

		temp = new int[10];

		for (int start = 0; start < 10; start++) {
			temp[start] = start;
		}

	}

	@Override
	public void run() {

		for (int start : temp) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.printf("현재 스레드: %s, ", Thread.currentThread().getName());
			System.out.printf("temp value: %d %n", start);

		}

	}

	public static void main(String[] args) {

		SingleRunnableEx srt = new SingleRunnableEx();
		Thread t = new Thread(srt, "first");
		t.start();

		SingleRunnableEx srt1 = new SingleRunnableEx();
		Thread t1 = new Thread(srt1, "second");
		t1.start(); // 멀티스레드
		// 대기하고 있는 스레드 중 아무거나 랜덤으로 수행되기 때문에 항상 똑같이 번갈아가면서 수행되는 것은 아니다.

	}

}
