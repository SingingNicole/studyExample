package day0206.oop.method;

public class CallStackEx {

	public static void first() {
		System.out.println("first");
	}

	public static void second() {
		System.out.println("second");
	}

	public static void main(String[] args) {
		System.out.println("main");
		first();
	}

}
