package day0216.lang;

public class AutoboxingEx {

	public static void main(String[] args) {
		// Autoboxing : 기본형 -> wrapper타입에 저장
		// 객체를 넣어야 하는 공간에 기본형을 넣어주면 자동으로 wrapper객체 생성해 저장한다.
		Integer intg = 10;
		// Integer intg = new Integer(10); 실제 코드

		// Unboxing : wrapper -> 기본형타입에 저장
		int i = new Integer(100);
		// int i = new Integer(100).intValue();

		Object o = 10;
		// Object o = new Integer(10);

		// wrapper 참조형간의 연산 가능 (Unboxing)
		int i2 = intg + 20; // int i2 = intg.intValue() + 20;
		long l = intg + 2L; // long l= intg.intValue() + 2L;
		long l2 = 10;
		// Long l3 = intg;
		// Long l3 = new Integer(10);
		// Long l4 = 10;
		// Long l4 = new Integer(10);

	}
}
