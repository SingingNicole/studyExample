package day0206.oop.method;

public class MethodEx {
	// int, long 타입의 값을 받아 더하고 리턴하는 add 메서드
	long add(int i, long l) {
		return i + l;
	}

	// int, int 값을 받아 빼고 결과를 리턴하는 subtract
	int subtract(int i, int j) {
		return i - j;
	}

	// int, int 값을 받아 곱하고 결과를 리턴하는 multiply
	int multiply(int i, int j) {
		return i * j;
		// return 이후 있는 모든 실행문은 무시한다.
	}

	// double, double 값을 받아 나누고 결과를 리턴하는 divide
	double divide(double d, double d2) {
		return d / d2;
	}
	
	// 두 개의 문자열을 받아 더해 출력 후 결과를 리턴하지 않는 addString 메서드
	void addString(String s, String s2) {
		System.out.println(s + s2);
		// return 값이 없다.
	}

	public static void main(String[] args) {
		// 10, 20을 받아 add 메소드를 활용하기.
		MethodEx me = new MethodEx();
		long result = me.add(10, 20);
		System.out.println(result);
		
		System.out.println(me.subtract(10, 5));
		// 결과를 호출하지 않고 바로 출력도 가능.
		
		me.addString("hello", "java");
		// return값이 없어 그냥 호출하면 됨.
		

	}

}
