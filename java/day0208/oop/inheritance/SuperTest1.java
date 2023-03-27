package day0208.oop.inheritance;

class Parent {
	int x = 10;
}

class Child extends Parent {
	// int x = 10;
	int x = 20; // 변수 재정의
	void method() {
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x); // x == this.x
		System.out.println("super.x : " + super.x); // super 클래스의 멤버를 찾아간다.
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}
