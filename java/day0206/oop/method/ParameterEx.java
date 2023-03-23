package day0206.oop.method;

public class ParameterEx {

	static void change(int x) { // primitive => 데이터 값을 직접 저장.
		x = 1000;
		System.out.println("x : " + x);
	}
	
	static void change2(Data d) { // 참조형 - Data 클래스로 생성한 객체의 주소값을 저장함.
		d.x = 1000;
		System.out.println("x : " + d.x);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		change(d.x);

		System.out.println("d.x : " + d.x);
		
		change2(d);
		System.out.println("d.x : " + d.x);

	}

}
