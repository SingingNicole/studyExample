package day0209.oop.modify;

class Card {

	static int width = 100;
	static int height = 250;
	final int NUMBER;
	final String KIND;
	// final 필드의 객체는 생성과 동시에 초기화를 진행해야 한다.
	// final 필드의 객체는 한 번 생성되면 변경할 수 없다.
	// final이 되면 super 클래스가 될 수 없다.
	// 오버라이딩은 불가능하다.

	public Card(int nUMBER, String kIND) {
		NUMBER = nUMBER;
		KIND = kIND;
		// final 상수를 초기화한다.
	}

	@Override
	public String toString() { // 객체의 값을 문자열로 바꿔 준다
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}

}

public class FinalCard {

	public static void main(String[] args) {
		Card c1 = new Card(7, "HEART");
		System.out.println(c1);
		// 참조변수 출력시 println(Object x) 실행
		// println(Object x) => 주소값을 출력하는 것이 아니라 가리키고 있는 객체의 toString() 호출, 리턴값 출력
		// Object 타입의 매개변수로 모든 참조형 타입을 출력할 수 있다.

		// c1.NUMBER = 100; -> 이미 한 번 초기화되었기에 다시 초기화할 수 없다.
		// final 상수는 값을 변경할 수 없다.
		Card c2 = new Card(10, "SPADE");
		System.out.println(c2.toString());
		// c2는 새로운 공간이어서 새로 고정되는 값을 저장할 수 있다.

	}

}
