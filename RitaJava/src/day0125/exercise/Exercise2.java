package day0125.exercise;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		
		//사다리꼴의 넓이를 구하는 코드를 작성, 소수자릿수까지 출력하세요.
		/* int top = 5;
		 * int bottom = 20;
		 * int height = 7;
		 */

		Scanner scanner = new Scanner(System.in);
		
		int top = scanner.nextInt();
		int bottom = scanner.nextInt();
		int height = scanner.nextInt();
		
		scanner.close();
		
		double area = ( (top + bottom)*height / 2 ); // 더블 캐스팅 다시 하기
		
		System.out.println("AREA : "+area);
		
		/* 강사님 예제
		 * int top = 5;
		 * int bottom = 20;
		 * int height = 7;
		 * double area = ( ((top + bottom)*height) / 2 );
		 * System.out.println("AREA : "+area);
		 * 
		 * +)더블로 결과 계산(중요!)
		 * 		- double 값을 top, bottom 캐스팅 -> 명시적 형변환
		 * 			double area = (double)(top+bottom)*height/2;
		 * 		- 나눌 때 2.0으로 계산
		 * 			double area = (top+bottom)*height/2.0;
		 */
		
		/* 캐스팅
		 * 원하는 타입으로 변경하기
		 * -> 계산할 때는 같은 타입으로만 계산, 결과 출력도 같은 타입으로만 가능.
		 * -> 강제로 변환할 때는 괄호 앞에 타입 명시(명시적 형변환).
		 */
		
	}

}
