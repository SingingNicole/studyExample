package day0125.forex;

public class MultiForEx1 {

	public static void main(String[] args) {
		// 1~4까지 3번 반복

		for (int i = 0; i <= 2; i++) { // 3번 반복하는 for문 형성
			for (int j = 1; j <= 4; j++) {
				System.out.println(i + " " + j);
			} // inner -> 처음(초기식)부터 다시 실행된다
			System.out.println("---------");
		} // outer
		System.out.println("프로그램 종료");

	}

}

// 2중 이상도 가능하나 그 이상은 처리 속도가 느려져 잘 사용하지 않는다.