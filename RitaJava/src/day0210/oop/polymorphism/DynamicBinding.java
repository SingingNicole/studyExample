package day0210.oop.polymorphism;

class Parent {
	int x = 100;

	public void method() {
		System.out.println("Parent 실행");
	}
}

class Child extends Parent {
	int x = 200; // 변수 재정의

	public void method() { // 오버라이딩
		System.out.println("Child 실행");
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		Child c = new Child(); // 정적 바인딩 -> compile 시점에 타입이 결정됨
		// : 참조변수의 타입을 따라간다.

		System.out.println(c.x); // 200
		c.method(); // Child 실행

		Parent p = new Child(); // 다형성을 이용하여 객체를 다룸
		System.out.println(p.x); // 100 => 정적 바인딩, 참조변수(Parent)의 타입을 따라감.
		p.method(); // Child 실행 -> 동적 바인딩 : 다형성으로 객체를 다룰 때(인스턴스 메서드 호출 시)
		// 실행 시점에 타입이 결정되며 실제 인스턴스 객체의 타입(Child)을 따라간다

		// Static 메소드, 변수는 무조건 정적 바인딩

	}

}
