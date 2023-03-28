package day0209.oop.modify;

class Singleton {

	private static Singleton s = new Singleton(); // 객체 생성은 딱 한번만 진행한다

	private Singleton() {
	}

	public static Singleton getInstance() {
		return s;
	}

	int x;

}

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); => private 클래스기에 외부에서 객체 생성 불가
		Singleton s1 = Singleton.getInstance(); // 이미 생성된 객체의 주소를 받아 온다
		s1.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.x : " + s2.x); // 10
		System.out.println(s1 == s2); // s1과 s2는 같은 객체를 가리키고 있다
	}

}
