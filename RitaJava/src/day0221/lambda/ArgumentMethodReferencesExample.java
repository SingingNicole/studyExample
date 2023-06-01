package day0221.lambda;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;

		function = (a, b) -> a.compareToIgnoreCase(b); // int applyAsInt(String,String)
		// 두 문자열을 int로 바꾸고 연산하여 같으면 일치, 다르면 불일치
		//compareToIgnoreCase: 대소문자는 무시하고 비교
		print(function.applyAsInt("Java8", "JAVA8"));

		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("사전 순으로 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("사전 순으로 나중에 옵니다.");
		}

	}

}