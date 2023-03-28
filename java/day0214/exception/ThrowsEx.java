package day0214.exception;

import java.util.Scanner;

public class ThrowsEx {

	public void gugudan(String str) throws Exception {
		int num = Integer.parseInt(str); // 숫자만 들어가야!
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void getNumber(String str) throws Exception {
		String s = str.substring(0, 1);
		gugudan(s); // 예외가 발생 가능하므로 해당 메소드에서도 throws NumberFormatException을 붙여 주어야 함
		// 런타임예외는 예외처리를 하지 않아도 컴파일오류가 발생하지 않음
		// => 자동적으로 throws 처리를 한다.
	}

	public static void main(String[] args) {
		ThrowsEx te = new ThrowsEx();

		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 숫자 입력 > ");
		String s = scanner.next();
		scanner.close();
		try {
			te.getNumber(s);
			// throws가 RuntimeException 타입이 아닌 메서드 호출 시 반드시 예외 처리 해야 한다.
		} catch (Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}

}
