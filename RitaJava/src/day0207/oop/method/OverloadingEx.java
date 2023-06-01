package day0207.oop.method;

public class OverloadingEx {

	// int, int 받아서 더한 값을 리턴하는 add
	int add(int x, int y) {
		int result = 0;
		result = x + y;
		return result;
	}

	// int, long 받아서 더한 값을 리턴하는 add
	long add(int x, long y) {
		long result = 0;
		result = x + y;
		return result;
	}

	// long, int 받아서 더한 값을 리턴하는 add
	long add(long x, int y) {
		long result = 0;
		result = x + y;
		return result;
	}

	// int[] 받아서 배열의 모든 값을 더하고 출력하는 add(리턴 없음)
	void add(int[] x) {

		int sum = 0;

		for (int i : x) {
			sum += i;
		}

		System.out.println("배열의 합 : " + sum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		OverloadingEx oe = new OverloadingEx();
		int r1 = oe.add(10, 20);
		System.out.println("r1 : " + r1);
		// 나와 제일 가까운 타입으로 가서 실행된다.
		oe.add(arr);

	}

}
