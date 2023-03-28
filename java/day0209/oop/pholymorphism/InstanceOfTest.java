package day0209.oop.pholymorphism;

public class InstanceOfTest {

	public static void method(Object obj) { // 모든 타입의 객체를 받아올 수 있다
		if (obj instanceof Car) {
			((Car) obj).drive(); // Car에 있는 모든 멤버를 사용하기 위해 Car 타입으로 변환
		}
		if (obj instanceof String) { // 원본 객체 타입
			char c = ((String) obj).charAt(0);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		method("test");
		method(car);

		if (fe instanceof Car) {
			Car c1 = (Car) fe;
			System.out.println("Car 타입 변환 가능");
		}

		if (car instanceof FireEngine) { // 변환 가능 여부를 true, false로 알려 줌
			FireEngine f1 = (FireEngine) car;
			System.out.println("FireEngine 타입 변환 가능");
		} else {
			System.out.println("FireEngine 타입 변환 불가능");
		}

	}

}
