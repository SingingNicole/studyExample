package day0209.oop.modify;

abstract class Animal2 { // 추상 메서드를 가지고 있는 추상 클래스임을 명시한다.
	// 추상 메서드가 하나라도 있으면 클래스에 명시해두어야 한다.
	abstract void move(); // 추상 메서드 -> 객체를 만들 수 없다.
	// 공통으로 사용되는 추상 메서드에 오버라이딩을 활용하면 다양한 코드에 활용할 수 있다.

	void eat() {// 추상 클래스 안에 일반 메서드와 추상 메서드가 같이 존재할 수 있다.
		System.out.println("먹는다");
	} // 모든 sub에서 똑같이 사용되는 메서드는 일반 메서드로 작성하여 상속받는다.
}

class Person extends Animal2 { // 일반 클래스에서 추상 클래스를 상속받을 수 있다.
	@Override
	void move() {// 상속받은 추상 메서드를 오버라이딩하여 완성한다(필수)
		System.out.println("걸어간다");
	}
}

class Bird extends Animal2 {
	@Override
	void move() {
		System.out.println("날아다닌다");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		// Animal2 a = new Animal2(); -> 추상 클래스는 객체로 생성할 수 없다.
		Person p = new Person();
		p.move(); // 상속받은 추상 메소드를 사용할 수 있다.
	}

}
