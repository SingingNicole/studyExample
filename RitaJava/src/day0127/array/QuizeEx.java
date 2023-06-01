package day0127.array;

import java.util.Scanner;

public class QuizeEx {

	public static void main(String[] args) {
		String[][] word = { { "student", "학생" }, { "computer", "컴퓨터" }, { "Integer", "정수" } };

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < word.length; i++) { // word 안의 문자열의 개수만큼 반복시킨다.
			System.out.printf("Quize%d. %s의 뜻은?", i + 1, word[i][0]);
			String answer = scanner.next();

			if (answer.equals(word[i][1])) {
				// 출력한 첫 번째 값이 입력한 두 번째 값과 같은 문자열에 있을 경우
				// 문자열1 == 문자열2 : 문자열의 내용이 아닌 주소값으로 비교한다.
				// 문자열1.equals(문자열2) => 실제 문자열을 비교한다.
				// 따라서 문자열과 문자열의 비교는 equals를 사용해야 한다.
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 뜻은 " + word[i][1] + "입니다.");
			} // if
		} // for
		scanner.close();
	}

}
