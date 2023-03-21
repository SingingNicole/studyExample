package day0125.forex;

import java.util.Scanner;

public class GugudanEx {

	public static void main(String[] args) {
		// 1~9 사이의 값을 입력받아 구구단을 출력한다.

		System.out.println("1~9 사이의 정수 입력 > ");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, (dan * i));
		} // 코드 공백 정렬 : ctrl+shift+f

		System.out.println("1~19 사이의 정수 입력 > ");
		int dan2 = scanner.nextInt();
		for (int i2 = 1; i2 <= 19; i2++) {
			System.out.printf("%d * %d = %d \n", dan2, i2, (dan2 * i2));

			scanner.close();
		}
	}

}
