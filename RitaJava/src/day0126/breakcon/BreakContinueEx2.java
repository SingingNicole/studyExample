package day0126.breakcon;

import java.util.Scanner;

public class BreakContinueEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int answer = (int) (Math.random() * 10) + 1; // 1부터 10 사이의 랜덤값 발생

		while (true) { //boolean 변수를 걸어 true 될 때까지 반복
			System.out.print("1~10 사이의 숫자를 맞춰보세요 > ");
			int input = scanner.nextInt();

			if (input == answer) {
				System.out.println("맞췄습니다!!");
				break; // 반복 끝
			} else {
				System.out.println("틀렸습니다. 다시!!");
			}
		}

		scanner.close();
	}

}

//중요!!
