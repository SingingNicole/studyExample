package day0221.lambda;

import java.util.function.IntSupplier;

public class LambdaEx3 {

	public static void main(String[] args) {

		IntSupplier dice = () -> (int) (Math.random() * 6) + 1; // 주사위의 수(1 ~ 6 리턴)

		System.out.println("주사위: " + dice.getAsInt());

	}

}