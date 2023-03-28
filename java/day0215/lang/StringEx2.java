package day0215.lang;

public class StringEx2 {

	public static void main(String[] args) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = new String("AAA");
		String s4 = "BBB";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		// String -> 저장된 문자열을 int로 바꿔 계산
		// String의 hashcode값은 문자열을 int로 바꾼 값이지 주소값이 아님.

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		// 실제 문자열의 hashcode값이다.

	}

}
