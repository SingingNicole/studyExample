package day0220.thread;

public class SingleThreadEx extends Thread { // 1.스레드 상속

	private int[] temp;

	public SingleThreadEx(String threadname) {
		super(threadname); // 2.스레드 생성자를 이용해 스레드 생성
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}

	@Override
	public void run() { // run 메서드 오버라이드, 수행할 작업 진행
		for (int start : temp) {
			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드  : %s ,", currentThread().getName());
			System.out.printf("temp value  : %d %n", start);
		}
	}

	public static void main(String[] args) {
		SingleThreadEx st = new SingleThreadEx("first"); // 스레드를 객체로 만든다.
		st.start(); // 3. first에서 실행, 다른 스레드에서 동작 가능
		st.run(); // main에서 실행
		
	}
}
