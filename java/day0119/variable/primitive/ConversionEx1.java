package day0119.variable.primitive;

public class ConversionEx1 {
	public static void main(String[] args) {
	int num1 = 2100000000;
	int num2 = 2100000000;
	System.out.println(num1 + num2);//오버플로우 처리된 음수값이 출력됨.
	
	System.out.println((long)num1 + num2);//42억->long타입은 8경까지 출력 가능하므로 자연스럽게 출력된다.

	
		/*값 처리 원칙
		 * 같은 타입끼리만 대입이 가능하다.
		 * 같은 타입끼리만 계산 가능
		 * 계산의 결과도 같은 타입이 나와야 한다.
		 * int + int = int여야 함.
		 * => 오버플로우
		 * 이럴 경우 데이터 타입을 바꾸어 주어야 함. Conversion(Casting)
         */
		
	}
}
