package day0206.oop.variable;

public class Card {

	static int width;
	static int height;

	int number;
	String kind;

	Card() {
		number = 1;
		kind = "SPADE";
	} // 매개변수 없는 생성자

	Card(int n, String k) { // 매개변수가 있는 생성자
		number = n;
		kind = k;
	}

	public void prinCard() {
		System.out.printf("width : %d, height : %d, number : %d, kind : %s\n", width, height, number, kind);
	}

}
