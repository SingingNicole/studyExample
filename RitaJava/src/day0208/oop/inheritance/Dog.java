package day0208.oop.inheritance;

public class Dog extends Animal {

	void bowwow() {
		System.out.println("멍멍");
	}

	@Override
	void move() { // 고쳐서 사용 - 재정의한다.
		System.out.println("네 발로 뛰어서 이동한다");
	}

}
