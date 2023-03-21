package day0125.exercise;
/**
 * @author 나유림
 * 2023.01.25 작성
 * 클래스 설명....Exercise1입니다
 */
import java.util.Scanner;

public class Exercise1 {
	/**
	 * 
	 * @param args : 클래스 메소드의 설명. 매개 변수 등...
	 * 각 자리수를 출력합니다.
	 */

	//주어진 숫자의 백의 자리, 십의 자리, 일의 자리를 출력하세요.
	//int num = 365;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		int x1 = x % 10;
		int x2 = (x % 100 - x1)/10;
		int x3 = x / 100;
		
		scanner.close();
		
		System.out.println("백의 자리 : " + x3);
		System.out.println("십의 자리 : " + x2);
		System.out.println("일의 자리 : " + x1);
		
		/*강사님 예제
		 * int num = 365;
		 * 
		 * int h = num / 100; // 백의 자리
		 * 
		 * num % = 100; // 백의 자리를 제외한 십의 자리까지의 숫자
		 * 
		 * int t = num / 10; // 십의 자리
		 * 
		 * int o = num % 10; // 일의 자리
		 * 
		 * System.out.println("백의 자리 : " + h);		
		 * System.out.println("십의 자리 : " + t);
		 * System.out.println("일의 자리 : " + o);
		 */
		
	}

}
