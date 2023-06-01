package day0207.oop.constructor;

public class CarTest1 {

	public static void main(String[] args) {

		Car c1 = new Car(); // 매개변수 없이 공간만 생성, 주소값 할당.
		// c1에 주소값을 저장한다.
		// 기본 생성자에 인스턴스 메소드만 추가
		c1.color = "white"; // 별도의 초기화 과정이 필요하다.
		c1.gearType = "auto";
		c1.door = 4;
		// c1 주소값에 저장(할당)된 공간에 추가된 데이터를 저장한다.
		System.out.println(c1.toString());

		Car c2 = new Car("red", "manual", 2);
		// 공간(주소값), 인스턴스 데이터를 함께 생성하여 저장.
		System.out.println(c2.toString());
		
		Car c3 = new Car(c2);
		System.out.println(c3.toString());

	}

}
