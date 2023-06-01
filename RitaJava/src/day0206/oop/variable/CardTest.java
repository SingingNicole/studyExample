package day0206.oop.variable;

public class CardTest {

	public static void main(String[] args) {

		Card.width = 100;
		Card.height = 250;

		Card c1 = new Card();
		c1.number = 7;
		c1.kind = "HEART";

		Card c2 = new Card();
		c2.number = 9;
		c2.kind = "CLOVER";

		c1.prinCard();
		c2.prinCard();

	}

}
