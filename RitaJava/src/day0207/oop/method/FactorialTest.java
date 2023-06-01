package day0207.oop.method;

public class FactorialTest {

	static long factorial(int n) {
		long result = 0;

		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1); // 내 안에서 나를 다시 호출 -> 반복
			// 재귀호출
		}
		return result;
	}

	public static void main(String[] args) {
		long r = factorial(7);
		System.out.println(r);
	}

}
