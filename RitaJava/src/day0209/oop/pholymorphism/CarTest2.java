package day0209.oop.pholymorphism;

public class CarTest2 {

	public static void main(String[] args) {

		Car car = new Car();
		FireEngine fe = null;

		fe = (FireEngine) car; // 에러 발생
		// 문법에는 맞으나 실행 중 예외 발생(ClassCastException)
		// => 자손이 super의 클래스를 다루고 있어 문제
		fe.drive();
		fe.water();

	}

}
