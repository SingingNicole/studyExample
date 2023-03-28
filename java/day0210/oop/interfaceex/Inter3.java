package day0210.oop.interfaceex;

public interface Inter3 extends Inter1, Inter2 {
	int getData();
	// int getA(); - 똑같은 추상메서드 상속 시 하나로 인식된다.
	// 호출할 때는 리턴 타입, 매개 변수가 중요
	int add(int i, int j); // 인터페이스만 보고도 기능을 알 수 있도록 만든다.
	// 인터페이스 -> 메뉴판과 유사한 역할
	default int add(int i) {
		return A + i;
	}
}
