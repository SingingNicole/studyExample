package day0126.whilex;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int seatSize = 5;

		while (seatSize != 0) { //특정 조건(조건식)

			System.out.print("기차표 구입(Y/N)");

			char yn = scanner.next().charAt(0);
			// String => char가 모여 있는 것.
			// scanner.next() : 입력한 문자열 꺼냄.
			// charAt(0) : 입력한 문자열에서 제일 첫번째 글자 하나(char) 꺼내기. -> yn이라는 char 변수에 저장.

			if (yn == 'Y' || yn == 'y') {
				System.out.println("판매되었습니다.");
				seatSize--;
			} else {
				System.out.println("판매되지 않았습니다.");
			}

		}

		scanner.close();
		System.out.println("판매 완료.");

	}

}
