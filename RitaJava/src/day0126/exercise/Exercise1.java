package day0126.exercise;

public class Exercise1 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
		// 출력 결과 : 73

		int sum = 0;

		for (int i = 0; i <= 20; i++) {
			if (i % 3 != 0 && i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("출력 결과 : " + sum);
	}
}
