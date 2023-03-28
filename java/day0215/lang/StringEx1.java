package day0215.lang;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		// 문자열을 만드는 리터럴 방식

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		if (str1 == str2) {
			System.out.println("str == str2 ? true");
		} else {
			System.out.println("str == str2 ? false");
		}

		if (str1.equals(str2)) {
			System.out.println("str1.equals(str2) ? true");
		} else {
			System.out.println("str1.equals(str2) ? false");
		}
		System.out.println();

		String str3 = new String("abc"); // 생성자
		String str4 = new String("abc");
		// \"는 문자열 "를 의미함. \' -> '
		// 역할이 있는 특수기호 앞에 \를 붙이면 문자열이 됨.
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		if (str3 == str4) { // 변수에 저장된 객체의 주소를 비교한다.
			System.out.println("str3 == str4 ? true");
		} else {
			System.out.println("str3 == str4 ? false");
		}

		if (str3.equals(str4)) { // 객체에 저장된 문자열을 비교한다.
			System.out.println("str3.equals(str4) ? true");
		} else {
			System.out.println("str3.equals(str4) ? false");
		}
	}

}
