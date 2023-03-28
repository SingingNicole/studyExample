package day0221.lambda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;

		operator = (x, y) -> Calculator.staticMethod(x, y); // int applyAsInt(int, int) 오버라이딩
		System.out.println("결과1: " + operator.applyAsInt(1, 2)); // 1과 2를 더한 값 출력

		operator = Calculator::staticMethod; // applyAsInt, :: => 람다식 표현
		// 람다식에서 참조만 하는 메서드를 호출할 경우 변수를 선언할 필요 없이 호출한다.
		System.out.println("결과2: " + operator.applyAsInt(3, 4)); // 3과 4를 더한 값 출력

		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y); // int applyAsInt(int, int)
		System.out.println("결과3: " + operator.applyAsInt(5, 6));

		operator = obj::instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
		// 인스턴스 메서드에서도 스태틱 메서드와 같은 결과로 적용된다.
	}

}