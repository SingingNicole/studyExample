package day0216.lang;

public class RandomTest {

	public static void main(String[] args) {
		// 1~100 사이의 정수 랜덤값
		// Math.random() * 범위 + 시작값

		int r1 = (int) (Math.random() * 100) + 1;
		System.out.println(r1);

	}

}
