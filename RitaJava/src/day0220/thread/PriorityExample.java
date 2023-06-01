package day0220.thread;

public class PriorityExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			Thread thread = new CalcThread("thread" + i); // 10개의 스레드를 생성, 대기

			if (i != 10) {

				thread.setPriority(Thread.MIN_PRIORITY); // i가 가지고 있는 값이 10이 아니라면 우선순위를 최소로 둠

			} else {

				thread.setPriority(Thread.MAX_PRIORITY); // i가 가지고 있는 값이 10이라면 우선순위가 최대임

			}

			thread.start(); // 10번 스레드가 가장 먼저 수행되어야 한다.

		}

	}

}
