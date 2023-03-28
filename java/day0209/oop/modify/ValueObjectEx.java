package day0209.oop.modify;

public class ValueObjectEx {

	/*
	 * VO : value object - 값을 표현(저장)하기 위한 객체. 캡슐화 패턴을 적용한다.
	 * 접근 제어자 변수 선언; 생성자;
	 * getter, [setter(생략 가능)]로 구성됨
	 */

	private String restaurant;
	private String food;
	private int quantity;
	// 변수명 꼭 소문자로 적기

	public ValueObjectEx(String restaurant, String food, int quantity) {
		this.restaurant = restaurant;
		this.food = food;
		this.quantity = quantity;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public String getFood() {
		return food;
	}

	public int getQuantity() {
		return quantity;
	}

}
