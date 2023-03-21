package day0125.forex;

public class Game369 {

	public static void main(String[] args) {
		// 1부터 100까지 하나씩 증가하면서
		// 3,6,9가 들어있는 숫자인 경우 "짝"이라고 출력
		// 그 외 나머지 숫자는 숫자 그대로 출력

		for (int i = 1; i <= 100; i++) {
			// 10보다 작을 때 -> 3의 배수
			// 10~100 사이 -> 십의 자리가 3의 배수 || 일의 자리가 3의 배수
			if (i < 10) {// 10보다 작을 때
				if (i % 3 == 0) {
					System.out.println("짝");
				} else {
					System.out.println(i);
				}
			} else { // 10 ~ 100 사이
				int t = i / 10; // 십의 자리
				int o = i % 10; // 일의 자리
				int x = t % 3;
				int y = o % 3;

				/*
				 * 강사님 코드 if( t & 3 == 0 && o % 3 == 0 && o != 0){~
				 */

				if (x == 0 && y == 0 && o != 0) {
					System.out.println("짝짝");
				} else if (t % 3 == 0) {
					System.out.println("짝");
				} else if (o % 3 == 0 && o != 0) { // 일의 자리가 0인 경우는 반드시 제외해야 한다!
					System.out.println("짝");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
