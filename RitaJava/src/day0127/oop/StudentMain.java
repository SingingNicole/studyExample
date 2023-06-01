package day0127.oop;

public class StudentMain {

	public static void main(String[] args) {
		Student x = new Student(); // 새 주소 선언
		x.sID = 1;
		x.name = "김자바";
		x.grade = 3;
		x.address = "서울시 종로구";
		x.showInfo(); // 메소드 : 같은 개체 안의 변수를 불러 와 실행한다.

		Student y = new Student();
		y.sID = 2;
		y.name = "이자바";
		y.grade = 2;
		y.address = "서울시 중구";
		y.showInfo();

	}

}
