package ncs.test0213;

public abstract class Food {

	private int price;
	private int point;

	public Food(int price) {
		this.price = price;
		point = price / 10;
	}

	public abstract String getName();

	public int getPrice() {
		return price;
	}

	public int getPoint() {
		return point;
	}

}
