package ncs.test0223;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {
			// 1에서 9사이의 난수 발생
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		// 컴퓨터 준비 완료

		// 사용자가 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("--1 ~ 9 사이의 수를 입력하세요--");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = scan.nextInt(); // 사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = scan.nextInt(); // 사용자가 준비한 수
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = scan.nextInt(); // 사용자가 준비한 수

			int strike = 0;
			int ball = 0;

			// 만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같으면 strike
			// 첫번째(user1) 숫자가 com2 또는 com3랑 숫자만 맞으면 ball
			if (user1 == com1) { // 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user1 == com2 || user1 == com3) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			// ---------------------------------------------
			if (user2 == com2) { // 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user2 == com1 || user2 == com3) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			// ------------------------------------------------
			if (user3 == com3) { // 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user3 == com1 || user3 == com2) {// 자리는 틀리고 숫자만 맞을 경우
				ball++;
			}
			// -----------------------------------------------------
			if (strike == 3) {
				System.out.println("정답!! - " + com1 + com2 + com3);
				break;
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + "Strike, " + ball + "Ball");
				} else {// 아무것도 일치하는 것이 없을 경우
					System.out.println("OUT!!");
					System.out.println("==========================");
				} // in if
			} // out if

		} // while

	}// main

}// class