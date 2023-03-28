package day0221.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaEx2 {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println(s + " world!!"); // String 타입의 변수 s 선언
		c1.accept("hello"); // Consumer의 accept 메서드 오버라이딩, accept한 값을 s에 대입

		IntConsumer c2 = value -> System.out.println(Math.pow(value, 2)); // int 타입의 변수 value 선언
		c2.accept(2); // int값을 받아서 제곱을 출력하는 메서드, value에 2를 저장 후 value의 2제곱을 출력

	}

}
