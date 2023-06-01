package day0126.whilex;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		// 키보드로 입력된 데이터로 예금, 출금, 조회, 종료의 기능을 제공하는 프로그램
		// 1. 예금 2.출금 3. 조회 4.종료 *.다시보기

		int balance = 0; // 잔액
		Scanner sc = new Scanner(System.in);
		boolean run = true; // true : 반복, false : 반복 종료
		// true로 유지하고 break 활용도 ok.

		while (run) {

			System.out.println("--------------------------------------- ");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료 | *.다시보기");
			System.out.println("----------------------------------------");
			System.out.println("선택> ");

			char in = sc.next().charAt(0);

			if (in == '1') {
				System.out.println("입금할 금액을 입력하세요> ");
				int money = sc.nextInt();
				balance += money;
				System.out.println("입금이 완료되었습니다.");
			} else if (in == '2') {
				System.out.println("출금할 금액을 입력하세요> ");
				int money = sc.nextInt();
				if (balance <= 0 || balance - money < 0) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= money;
					System.out.println("출금이 완료되었습니다.");
				}
			} else if (in == '3') {
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			} else if (in == '*') {

			} else if (in == '4') {
				run = false;
			} else {
				System.out.println("올바른 메뉴를 골라 주세요.");
			}
		}
		sc.close();
		System.out.println("서비스가 종료되었습니다.");
	}
}
