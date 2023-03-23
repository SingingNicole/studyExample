package day0207.oop.method;

public class Varargs {

	void addStr(int i, String... s) {
		// ... : 가변 인수. 메서드 하나 당 한 번만 제일 마지막 변수에 적용할 수 있다.
		String text = "";
		for (String str : s) { // String 데이터 여러 개 => 배열 처리
			text += str;
		}
		System.out.println(text);
	}

	public static void main(String[] args) {
		Varargs v = new Varargs();
		v.addStr(1, "hello", "java");
		v.addStr(2, "variable", "argument", "test");

	}

}
