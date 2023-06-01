package day0220.thread;

public class CalcThread extends Thread {

	public CalcThread(String name) {

		setName(name);

	}

	@Override
	public void run() {

		for (int i = 0; i < 2000000000; i++) {
			// 아무것도 하지 않고 시간만 지나감
		}

		System.out.println(getName());
	}
}