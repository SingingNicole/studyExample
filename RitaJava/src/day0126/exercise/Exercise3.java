package day0126.exercise;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// int num 타입의 변수 ? 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 작성하세요.
		// 예를 들어 int num = 12345;인 경우 1+2+3+4+5의 결과를 출력하면 됩니다.
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;// 다시 값 저장
		}
		System.out.println(sum);
		sc.close();
	}

}
