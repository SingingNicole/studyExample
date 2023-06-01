package day0207.oop.constructor;

class Data1 {
	int value; // 인스턴스 변수

	Data1() {} // 기본 생성자 추가
}

class Data2 {
	int value; // 인스턴스 변수

	Data2(int v) { // 생성자. 기본 생성자 추가 X
		value = v;
	}
	Data2() {} // 기본 생성자 추가
}

public class ConstructorTest {
	ConstructorTest() {} // 기본 생성자 추가

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(0); // Data 2에는 int 값이 필요함.
		
		Data2 d3 = new Data2(); // 기본 생성자를 추가하여 int 값이 없어도 가능.

	}

}
