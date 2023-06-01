package day0120.test.variable;

public class Example1 {
	public static void main(String[] args) {
		// 변수 x에는 3, 변수 y에는 7이 저장되어 있는데
		int x = 3;
		int y = 7;
		// x의 값을 y에, y의 값을 x에 바꿔 저장하고 x, y에 저장된 값을 출력하세요.
		int temp = x; // 임시로 저장.
		x = y;
		y = temp; // 각각의 값 교환(변수 선언 불필요)
		System.out.printf("x = %d, y = %d", x, y);
	}
}
