package day0215.lang;

public class StringEx10 {
	public static void main(String[] args) {
		//
		// 공백, 숫자 , 사전순서(대문자, 소문자)
		String s1 = "aba";
		String s2 = "abc";

		System.out.println(s1.compareTo(s2));

		if (s1.compareTo(s2) > 0) {
			System.out.println("양수가 나오면 첫번째 값이 더 크다.");
		} else if (s1.compareTo(s2) == 0) {
			System.out.println("0이 나오면 둘은 같은 값이다.");
		} else if (s1.compareTo(s2) < 0) {
			System.out.println("음수가 나오면 두번째 값이 더 크다.");
		}

	}

}
