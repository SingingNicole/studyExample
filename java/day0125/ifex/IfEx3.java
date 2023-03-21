package day0125.ifex;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//입력 값이 4의 배수라면 "4의 배수" 출력
		//아니면 "4의 배수 아님"출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int num = scanner.nextInt();
		scanner.close();
		
		if (num % 4 ==0 ) { // % 연산자는 n의 배수 등을 구할 때 자주 사용한다.
			System.out.println("4의 배수");
		}
		
		else {
			System.out.println("4의 배수 아님");
		}
	}
}
