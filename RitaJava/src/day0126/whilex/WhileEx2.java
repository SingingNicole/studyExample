package day0126.whilex;

import java.util.Scanner;
//1.증속 2.감속 3.중지

public class WhileEx2 {

	public static void main(String[] args) {

		int speed = 0;
		boolean run = true; // 차 : 달린다-true / 운행 중지 - false
		// -> 조건식 : false일 때 특정 상태 바꿈
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------");
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("-----------------");
			System.out.println("선택(1, 2 ,3) : ");

			int code = sc.nextInt();

			if (code == 1) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (code == 2) { // 음수가 나오면 속도를 0으로 바꿔주세요
				speed--;
				if(speed < 0) {
					speed = 0;
				}
				System.out.println("현재 속도 : " + speed);
			} else if (code == 3) { // 특정 경우가 되면 상태값을 false로 바꾸는 작업을 많이 함.
				run = false; // while문 종료
			}

		}

		sc.close();

	}

}
