package ncs.test0213;

public class Customer {

	private int money = 10000;
	private int point;

	public void order(Food f) {
		if (f.getPrice() < money) {
			money -= f.getPrice();
			point += f.getPoint();
		}
	}

	@Override
	public String toString() {
		return "현재 남은 돈은 " + money + "원 입니다.\n" + "현재 보너스 점수는 " + point + "점 입니다.";
	}

}
