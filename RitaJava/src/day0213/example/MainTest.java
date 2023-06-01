package day0213.example;

public class MainTest {

	public static void main(String[] args) {

		Subway sub = new Subway("2",1250);
		Bus bus100 = new Bus(100, 1000);
		Bus bus200 = new Bus(200, 2000);
		Student jerry = new Student("Jerry", 1, 10000);
		Student tom = new Student("Tom", 2, 15000);

		jerry.takeSubway(sub);
		jerry.takeBus(bus100);
		jerry.showMoney();
		
		tom.takeBus(bus200);
		tom.showMoney();

	}

}
