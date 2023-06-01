package day0216.lang;

public class WrapperEx2 {

	public static void main(String[] args) {

		int i = new Integer("100").intValue(); // 100
		int i2 = Integer.parseInt("100");// 100 => 10진수 표현은 생략 가능하다.
		Integer i3 = Integer.valueOf("100");// 100

		int i4 = Integer.parseInt("100", 2); // 숫자, 진수 => 100이지만 2진수
		// 100을 2진수로, 다시 10진수로 표현하면 100은 4가 된다.
		int i5 = Integer.parseInt("100", 8);
		int i6 = Integer.parseInt("100", 16);
		int i7 = Integer.parseInt("FF", 16);
		// FF라는 문자도 숫자로 변환하여 16진수로 출력할 수 있다.

		System.out.println("\"100\", 2: " + i4);
		System.out.println("\"100\", 8: " + i5);
		System.out.println("\"100\", 16: " + i6);
		System.out.println("\"FF\", 16: " + i7);

	}
}