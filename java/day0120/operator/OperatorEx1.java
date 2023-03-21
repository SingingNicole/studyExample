package day0120.operator;

public class OperatorEx1 {
	// 부호 연산자 +/- 변수
	public static void main(String[] args) {
		int num = -10; // 대입 연산자 : 값을 지정, 변경.
		
		System.out.println(+num); // 기존의 값이 변하지 않고 그대로 출력.
		System.out.println(-num); // 기존의 값에서 부호가 변경되어 출력.
		System.out.println(num); // num의 값을 그대로 출력. 원본 데이터는 변하지 않음.
		
		num = - num; // 저장된 데이터를 바꾸려면 항상 저장(=)까지 해야 한다.
		System.out.println(num); // num 값의 부호가 변경되어 저장됨.
	}
}
