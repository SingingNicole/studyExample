package day0221.lambda;

import java.util.function.*;

public class LambdaEx5 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // apply()
		// 문자열 s를 정수로 받아 16진수로 나타낸다.
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i); // apply()
		// i를 2진수로 나타낸다.
		Function<String, String> h = f.andThen(g); // f 다음 g 실행
		Function<Integer, Integer> h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF"를 255, 255를 문자열 "11111111"로 변환
		System.out.println(h2.apply(2)); // 2를 이진수 문자열 "10", 10을 숫자 16으로 변환

		Function<String, String> f2 = x -> x; // 항등 함수(identity function)
		System.out.println(f2.apply("AAA")); // AAA가 그대로 출력됨

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100
		// i >= 100 && (i < 200 || i % 2 == 0);
		Predicate<Integer> all = notP.and(q.or(r)); // 100보다 작지 않으면서 200보다 작고 짝수인 정수인지 참, 거짓 판단

		System.out.println(all.test(150));

		String str1 = "abc";
		String str2 = "abc";
		Predicate<String> p2 = Predicate.isEqual(str1); // str1과 str2가 같은지 비교한 결과를 반환
		boolean result = p2.test(str2);
		System.out.println(result);

	}

}
