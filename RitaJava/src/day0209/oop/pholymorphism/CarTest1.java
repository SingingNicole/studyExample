package day0209.oop.pholymorphism;

class Car extends Object {

	String color;
	int speed;

	Car() {
		super();
	}

	public void drive() {
		System.out.println("drive~~~");
	}

	public void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	public void water() {
		System.out.println("water~~~~");
	}
}

public class CarTest1 {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		car = fe; // 상속 관계에 있으므로 fe를 car 타입으로 바꾸어 저장한다(명시 안 해도 가능)
		// sub 클래스가 super 클래스로 업캐스팅되고있어 명시 불필요.
		// car = (Car)fe;로 명시해도 가능
		car.drive();
		// car.water(); => car 타입의 참조변수가 FireEngine 타입에만 있는 water 메서드를 다룰 수 없음
		// water은 car 타입이 사용할 수 있는 멤버가 아니다(객체 안에는 있지만 Car 타입의 변수가 사용 불가능)

		fe2 = (FireEngine) car; // super 클래스가 sub 클래스로 다운캐스팅되었으므로 명시해야함

		fe2.drive();
		fe2.water();

	}

}
