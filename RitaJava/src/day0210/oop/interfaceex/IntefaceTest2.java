package day0210.oop.interfaceex;

public class IntefaceTest2 implements Inter3 {

	@Override
	public int getA() { // 다중 상속되어 중복된 메서드는 하나로 인식한다.
		return A;
	}

	@Override
	public int getData() {
		return A + 100;
	}

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {
		IntefaceTest2 it2 = new IntefaceTest2();
		Inter1 i1 = it2;
		Inter2 i2 = it2;
		Inter3 i3 = it2;

		System.out.println(i1.getA()); // 구현 클래스에 오버라이딩 된 getA 메서드를 활용한다
		System.out.println(i2.getA());
		// i2.getData(); => getData가 Inter2에 명시되어있지 않으므로 사용 불가능하다
		System.out.println(i3.getData());
	}

}
