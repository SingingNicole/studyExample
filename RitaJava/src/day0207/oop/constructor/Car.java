package day0207.oop.constructor;

public class Car {

	String color; // 변수명은 무엇을 저장하고 있는 지 확실히 알 수 있도록 설정한다.
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4); // this 생성자(기본값 저장)는 항상 첫 번째 줄에 있어야 한다.
	} // 기존 생성자와 같은 일을 하고 있다면 코드를 재사용한다.

	Car(Car c) { // 생성자에게 현재 타입과 같은 객체를 받아 올 수 있도록 명령
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color, String gearType, int door) { // 인스턴스 변수의 값을 초기화
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		// 지역변수 : 생성자 안에서만 사용 가능
		// 지역변수 역시 어떤 값을 받아야 할 지 확실히 알 수 있도록 명칭을 정한다.

		/*
		 * 지역변수와 인스턴스 변수의 이름이 같을 경우 : 선언된 영역 내에서는 지역변수가 우선권을 가진다 => 지역변수만 계속 수행되며 데이터가
		 * 사라짐 객체에 있는 인스턴스 변수를 가리키기 위해서는 객체의 주소값이 필요 this 참조변수는 현재 객체의 주소값을 가지고 있다. =>
		 * this.변수명 : 변수의 주소값을 소환(현재 생성한 객체 안에 있는 인스턴스 변수)
		 */
	}

	// toString - 객체에 저장된 값(변수)들을 하나의 문자열로 만들어 리턴한다.
	public String toString() {
		return "Car - color : " + color + "\ngearType : " + gearType + "\ndoor : " + door;
	}

}
