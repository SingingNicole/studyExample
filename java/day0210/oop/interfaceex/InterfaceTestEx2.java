package day0210.oop.interfaceex;

class A1 {

	void autoPlay(I i) { // i를 구현하고 있는 자손의 객체를 받아 온다
		i.play();
	}

}

interface I {
	public abstract void play();
}

class B1 implements I {

	@Override
	public void play() {
		System.out.println("play in B class");
	} // 오버라이딩 된 플레이 메소드 호출

}

class C1 implements I {
	@Override
	public void play() {
		System.out.println("play in C class");
	}

}

class InterfaceTestEx2 {

	public static void main(String[] args) {
		A1 a = new A1(); // 객체의 인스턴스화
		a.autoPlay(new B1()); // B클래스에 오버라이딩된 메소드 호출
		a.autoPlay(new C1()); // C클래스에 오버라이딩된 메소드 호출
		// 인터페이스 타입은 항상 오버라이딩된 메소드를 호출한다.
	}

}