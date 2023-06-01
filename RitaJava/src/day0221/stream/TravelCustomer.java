package day0221.stream;

public class TravelCustomer {
	String name;
	int age;
	int cost;

	public TravelCustomer(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "TravelCustomer [name=" + name + ", age=" + age + ", cost=" + cost + "]";
	}

}
