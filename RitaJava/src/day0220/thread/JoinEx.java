package day0220.thread;

class MyRunnableTwo implements Runnable {

	@Override
	public void run() {

		System.out.println("run");
		first();

	}

	public void first() {

		System.out.println("first");
		second();

	}

	public void second() {

		System.out.println("second");

	}
}

public class JoinEx {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start"); // 현재 스레드에서 먼저 실행

		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		myThread.start();

		try {

			myThread.join(); // 지금 실행 중인 스레드를 잠시 중지시키고 현재 스레드를 먼저 실행시킨다.

		} catch (InterruptedException ie) {

			ie.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " end"); // 메인 스레드에 있어 이어서 실행되어야 하나 join 스레드로 인하여
																		// myThread가 먼저 실행
	}

}