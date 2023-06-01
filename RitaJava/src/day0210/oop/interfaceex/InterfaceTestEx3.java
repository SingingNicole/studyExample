package day0210.oop.interfaceex;

class InterfaceTestEx3 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}

}

class A3 extends Object {

	void methodA() {
		I3 i = InstanceManager.getInstance();
		i.methodB();
	}

}

interface I3 {
	void methodB();
}

class B3 implements I3 {

	@Override
	public void methodB() {
		System.out.println("methodB in B class");
	}

}

class InstanceManager {

	public static I3 getInstance() {
		return new B3(); // B3 타입 -> I3 타입(실제 객체는 B3타입)
		// 실제로도 I3 타입의 변수로 저장된다.
		// 단, B3로 오버라이딩된 I3 타입임
	}

}
