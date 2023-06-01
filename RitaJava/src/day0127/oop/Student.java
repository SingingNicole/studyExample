package day0127.oop;

// 학번, 이름, 학년, 주소
// 학생정보 보기 -> 메소드

public class Student {

	int sID; // 기본값 0
	String name; // 기본값 null
	int grade; // 기본값 0
	String address; // 기본값 null
	// 클래스에 존재하는 인스턴스

	void showInfo() {
		System.out.printf("%d학년 %s 학생의 주소는 %s입니다.\n", grade, name, address);
	}
	// 클래스에 존재하는 메소드

}
