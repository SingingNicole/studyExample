package day0126.breakcon;

public class BreakContinueEx4 {

	public static void main(String[] args) {
		label: // 반복되는 식의 이름
		for (int i = 0; i < 3; i++) { // i의 값이 3보다 작다면 반복한다.
			for (int j = 0; j < 3; j++) {
				if (j == 2) { // continue : j가 가지고 있는 값이 2라면 수행한다.
					// break label; // 탈출 명령. j가 가지고 있는 값이 2라면 탈출한다.
					continue label; // label이 붙어 있는 for문을 수행한다.
					// 프린팅 x, 증감식 수행. -> outer for문 수행.
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
