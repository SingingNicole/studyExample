package day0208.oop.inheritance;

public class Person extends Animal {
	// Person 클래스는 Animal 클래스의 서브 클래스이다.
	// Animal 클래스는 Person 클래스의 익스탠드 클래스이다.

	void speak() {
		System.out.println("말한다");
	} // Animal 클래스 외에 Person 클래스만 할 수 있는 것을 따로 추가한다.

	@Override // 어노테이션. 현재 메서드가 오버라이딩된 메서드라고 알려줌
	void move() {
		System.out.println("걸어서 이동한다");
	} // 오버라이딩
}
