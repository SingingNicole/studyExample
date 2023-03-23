package day0206.oop.method;

public class StaticInstance {
	
	static int cv;
	int iv;
	
	int iv2 = cv;
	int iv3 = iv;
	// 인스턴스 변수는 static 변수와 인스턴스 변수를 모두 사용할 수 있다.
	void instaneMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static int cv2 = cv;
	static void staticMethod() {
		StaticInstance si = new StaticInstance();
		System.out.println(si.iv);
		// 인스턴스 변수를 쓰고 싶으면 객체를 다시 지정.
		
		System.out.println(cv);
	}
	
	// static 멤버에는 인스턴트 변수를 직접적으로 넣을 수 없다.
	// 같은 시점에 올라가는 static 멤버는 올라갈 수 있다.

}
