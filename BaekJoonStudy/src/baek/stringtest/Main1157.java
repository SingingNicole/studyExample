package baek.stringtest;

import java.util.Arrays;
import java.util.Scanner;

public class Main1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String target = sc.next();
		sc.close();

		int alphabets[] = new int[26]; // 알파벳 길이만큼 배열 생성

		for (int i = 0; i < target.length(); i++) {
			if ((int) target.charAt(i) < 97) {
				alphabets[(int) target.charAt(i) - 65]++; // 대문자인 경우 아스키코드 'A'의 값을 빼 배열 위치에 저장
			} else {
				alphabets[(int) target.charAt(i) - 97]++; // 소문자인 경우 아스키코드 'a'의; 값을 빼 배열 위치에 저장
			}
		}

		int max = Arrays.stream(alphabets).max().getAsInt(); // 가장 많이 사용된 문자의 사용 횟수

		int count = 0;
		for (int i = 0; i < alphabets.length; i++) {
			if (alphabets[i] == max) {
				count++;
			}
		} // 중복 사용된 단어가 있는지 확인하는 반복문

		int answer = 0;

		if (count > 1) {
			System.out.println("?"); // 같은 횟수로 사용된 단어가 여러 개라면 "?" 출력
		} else {
			for (int i = 0; i < alphabets.length; i++) {
				if (max == alphabets[i]) {
					answer = i + 65;
					System.out.println((char) answer);
				} // 가장 많이 사용된 문자의 위치에 아스키코드 값 'A' 더함
			}
		}

	}

}
