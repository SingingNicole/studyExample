package day0208.oop.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();

		p1.eat(); // 물려받은 멤버
		p1.speak();// sub의 멤버
		p1.move();

	}

}
