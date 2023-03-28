package day0215.lang;

public class StringBuilderTest {

	public static void main(String[] args) {

		String javastr = new String("java");
		System.out.println("문자열의 주소 :" + System.identityHashCode(javastr));

		StringBuilder buffer = new StringBuilder(javastr);
		System.out.println("연산 전 주소 :" + System.identityHashCode(buffer));

		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");

		System.out.println("연산 후 주소 :" + System.identityHashCode(buffer));

		javastr = buffer.toString();
		System.out.println(javastr);
		System.out.println("문자열의 주소 :" + System.identityHashCode(javastr));

	}
}