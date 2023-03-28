package day0213.example;

public class Student {

	private String name;
	private int grade;
	private int money;
	
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take();
		money -= bus.getCharge();
		System.out.println(getName() + "이(가) " + bus.getBusNumber() + "번 버스에 탑승");
	}
	
	public void takeSubway(Subway subway) {
		subway.take();
		money -= subway.getCharge();
		System.out.println(getName() + "이(가) " + subway.getLineNumber() + "호선 지하철 탑승");
	}
	
	public void showMoney() {
		System.out.println(getName() + "의 용돈이 " + getMoney() + "만큼 남았습니다.");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getMoney() {
		return money;
	}

}
