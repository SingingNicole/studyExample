package day0120.test.variable;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		// 밑변이 4.3, 높이가 7.5인 삼각형의 크기를 구하세요
		/*
		 * double 밑변 = 4.3; double 높이 = 7.5;
		 * System.out.println("밑변이 4.3, 높이가 7.5인 삼각형의 넓이는 " + (밑변*높이/2)+"입니다.");
		 */

		// 매번 실행할 때마다 해당 밑변과 높이의 길이를 받아 계산하려면?
		/*
		 * 입력 = scanner : 화면에 입력한 값을 받아 옴 패키지문과 클래스 선언부 사이에 import java.util.Scanner;
		 */
		System.out.println("값을 입력하세요.");
		Scanner scanner = new Scanner(System.in);// console 창에 입력한 값을 읽어 오는 새로운 스캐너 형성
		/*
		 * // in : 파일 경로 지정 시 해당 경로의 파일을 읽어 올 수도 있음. String str = scanner.next();//값 입력
		 * 중에 enter키 입력 시 그 앞까지의 값을 읽어 옴.(공백이 있다면 그 앞까지. 공백 = 구분자) //자동주석 : ctrl + shift
		 * + /, 주석 해제 : ctrl + shift + \ System.out.println(str);
		 * 
		 * //공백 이후까지 읽어오는 기능은 nextLine. String str2 = scanner.nextLine();
		 * System.out.println(str2);
		 * 
		 * 
		 * int num = scanner.nextInt();// 필요한 값이 int값일 경우 // 입력한 숫자값을 int형으로 가져옴(숫자가 아닌
		 * 값이 있으면 error) System.out.println(num);
		 * 
		 * double dnum = scanner.nextDouble(); System.out.println(dnum);
		 * 
		 * 
		 * 단어 : Scanner.next 문장 : nextLine 정수 : nextInt 실수 : nextDouble
		 */
		
		System.out.println("밑변의 길이를 입력하세요. > ");
		double bottom = scanner.nextDouble();
		System.out.println("높이의 길이를 입력하세요. > ");
		double height = scanner.nextDouble();
		System.out.println("삼각형의 넓이는 " +(bottom*height/2)+"입니다.");

		scanner.close();
		
	}
}
