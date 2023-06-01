package day0209.oop.example;

public class StudentScoreTest {

	public static void main(String[] args) {

		StudentScore person1 = new StudentScore("홍길동", 1, 1, 100, 70, 70);

		System.out.println("이름: " + person1.name);
		System.out.println("총점: " + person1.getTotal());
		System.out.println("평균: " + person1.getAverage());

	}

}
