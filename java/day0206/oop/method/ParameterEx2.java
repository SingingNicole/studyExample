package day0206.oop.method;

public class ParameterEx2 {
	
	static void change(int[] x) { // 참조형 데이터 타입(배열)
		// reference : int 배열의 주소값을 저장하고 있다.
		x[0] = 1000;
		System.out.println("x[0] : " + x[0]);
	}

	public static void main(String[] args) {

		int[] x = {10};
		System.out.println("x[0] : " + x[0]);
		
		change(x);
		System.out.println("x[0] : " + x[0]);

	}

}
