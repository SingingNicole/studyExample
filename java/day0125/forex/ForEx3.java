package day0125.forex;

public class ForEx3 {

	public static void main(String[] args) {
		// 0~9까지의 합
		int summary = 0;
		for (int i = 0; i <= 9; i++) {
			summary = summary + i; // summary += i;
		}
		System.out.println("0 ~ 9까지의 합 : " + summary);

		// 1~20까지 홀수의 합
		int sumodd = 0;
		for (int i = 1; i <= 20; i += 2) {
			sumodd = sumodd + i; // sumodd += i;
		}
		System.out.println("1 ~ 20까지 홀수의 합(1) : " + sumodd);

		// 1~20까지 홀수의 합(if 활용)
		int sumodd2 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				sumodd2 += i;
			}
		}
		System.out.println("1 ~ 20까지 홀수의 합(2) : " + sumodd2);

		// 1~20까지 4의 배수의 합
		int sum4 = 0;
		for (int i = 4; i <= 20; i += 4) {
			sum4 = sum4 + i;
		}
		System.out.println("1~20까지 4의 배수의 합(1) : " + sum4);

		// 1~20까지 4의 배수의 합(if)활용
		int sum4_ = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 4 == 0) {
				sum4_ += i;
			}
		}
		System.out.println("1~20까지 4의 배수의 합(2) : " + sum4_);
	}
}

// 변수명은 같지만 값이 삭제되기에 int i의 값을 for문마다 계속 다른 값으로 선언 가능.
// main 영역에서 같은 이름의 변수를 중복으로 선언하는 것은 불가능하다.
