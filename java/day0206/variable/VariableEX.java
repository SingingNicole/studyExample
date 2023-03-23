package day0206.variable;

public class VariableEX {

	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수
	// 클래스 변수는 시작할 때 단 한 번만 올린다.

	void method() { // (인스턴스)메서드
		int lv = 0; // 지역 변수
	}

	public static void main(String[] args) { // 스태틱 메서드 -> 처음부터 메소드에 올라가 있음.
		System.out.println(VariableEX.cv); // 클래스명, 클래스 변수명
		System.out.println(cv);// 같은 클래스 안이라면 클래스명은 생략 가능.
		// 인스턴스 멤버를 사용하려면 클래스를 객체로 생성.
		VariableEX ve = new VariableEX();
		System.out.println(ve.iv); // 참조변수, 인스턴스 변수명.
		VariableEX ve2 = new VariableEX();
		ve2.iv = 10;
		System.out.println(ve.iv); // 참조변수. 인스턴스 변수명
		System.out.println(ve2.iv); // 참조변수. 인스턴스 변수명
		
		ve.method();
	}

}
