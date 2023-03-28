package com.mytest;

public class School {

	public static void main(String[] args) {
		Person s = new Student("홍길동학생", 24, 25000);
		Person t = new Teacher("홍길동강사", 30, "자바");
		Person e = new Employee("김길동관리자", 40, "교무과");

		s.print();
		t.print();
		e.print();

	}

}
