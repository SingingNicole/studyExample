package day0210.oop.interfaceex;

interface Inter1 {
	public static final int A = 100;// 굳이 쓰지 않아도 항상 public static final(생략 가능)

	int getA(); // public abstarct가 앞에 붙어 있으나 생략 가능
	// 표준 지정
}

public class InterfaceTest implements Inter1 { // 메소드를 구현하거나 오버라이딩

	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		// Inter1이 InterfaceTest의 super(오버라이딩)
		// Inter1 it = new InterfaceTest();도 가능하다.
		// interface 타입의 객체는 직접 객체를 생성할 수 없으나 오버라이딩을 진행하여 객체를 만들 수 있다
		System.out.println(it.getA());
	}

	@Override
	public int getA() { // 오버라이딩 시 좁은 범위로 진행할 수 없어 public을 붙여 주어야 함
		return A; // 상수 A에 저장된 값을 출력하는 메소드
		// 추상 클래스 getA를 완성, 구현한다
	}

}
