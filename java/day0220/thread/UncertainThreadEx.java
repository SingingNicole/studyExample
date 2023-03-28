package day0220.thread;

class MyRunnableOne implements Runnable {

	@Override
	public void run() {

		System.out.println("run");
		first(); // first 호출

	}

	public void first() {

		System.out.println("first");
		second(); // second 호출

	}

	public void second() {

		System.out.println("second");

	}

}

public class UncertainThreadEx {

	public static void main(String[] args) {

		System.out.println("main start");

		Runnable r = new MyRunnableOne();
		Thread myThread = new Thread(r); // 스레드 생성
		myThread.start(); // 스레드 시작

		System.out.println("main end"); // main 스레드에 존재하고 있기 때문에 myThread보다 먼저 수행된다.

	}

}