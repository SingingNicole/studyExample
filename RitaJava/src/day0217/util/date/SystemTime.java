package day0217.util.date;

public class SystemTime {

	public static void main(String[] args) {

		System.out.println("시스템상의 현재 시간 출력");
		long t1 = System.currentTimeMillis();
		long t2 = System.nanoTime();
		// 시스템이 동작하는 시간을 구할 때 사용한다.

		System.out.println("ms: " + t1);
		System.out.println("nano: " + t2);

	}

}
