package day0220.thread;

public class SychronizedMethodEx implements Runnable {

	@Override
	public void run() {

		kitchen();
		bedroom();

	}

	public synchronized void kitchen() { // 동기화 => 락 풀에 한정

		System.out.println(Thread.currentThread().getName() + " is in kitchen"); // 락 풀에서 꺼내 온 스레드가 실행

		try {

			Thread.sleep(1000); // 1초 휴식

		} catch (Exception e) {

		}

		System.out.println(Thread.currentThread().getName() + " is leaving kitchen");

	}

	public synchronized void bedroom() { // 동기화 블럭에 갇힌 상태

		System.out.println(Thread.currentThread().getName() + " is in bedroom");

		try {

			Thread.sleep(1000);

		} catch (Exception e) {

		}

		System.out.println(Thread.currentThread().getName() + " is leaving bedroom");

	}

	public static void main(String[] args) {

		SychronizedMethodEx sm = new SychronizedMethodEx(); // 러너블 구현 객체 하나만 형성
		// 락 풀에 스레드를 가두고 순차적으로? 실행

		Thread t = new Thread(sm, "Tom");
		Thread t1 = new Thread(sm, "Jerry");

		t.start();
		t1.start();
		// 멀티 스레드: 누가 먼저 나오던지 상관 없게 작성 => 스케줄러 마음대로 스레드 실행

	}

}
