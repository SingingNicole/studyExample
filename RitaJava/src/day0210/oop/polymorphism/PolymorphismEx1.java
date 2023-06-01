package day0210.oop.polymorphism;

class Product {
	int price;
	int bonus;

	public Product(int price, int bonus) {
		this.price = price;
		this.bonus = bonus;
	}
}

class Tv extends Product {
	Tv() {
		super(200, 20);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Com extends Product {
	public Com() {
		super(100, 10);
	}

	@Override
	public String toString() {
		return "Com";
	}
}

class Buyer {
	int money = 1000;
	int bonus = 0;

	public void buy(Product p) { // p => 자손 객체, 다형성
		if (p.price > money) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonus += p.bonus;
		System.out.println(p + "를 구입.");
		// toString메서드가 자동 호출되어 p의 값을 String으로 출력해 준다
		// 다형성의 경우 메서드를 호출할 때 오버라이딩 된 toString 메서드를 찾아간다
	}
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Com com = new Com();
		Buyer b = new Buyer();

		b.buy(com);
		// Product 타입의 변수를 받는 buy 메서드이지만 Com 타입으로 오버라이딩되어 Com 타입 값을 toString으로 호출한다
		b.buy(tv);
		// Product 타입의 변수를 받는 buy 메서드이지만 Tv 타입으로 오버라이딩되어 Tv 타입 값을 toString으로 호출한다
		// Product 타입이 Tv와 Com의 super 클래스기에 가능하다.
	}
}
