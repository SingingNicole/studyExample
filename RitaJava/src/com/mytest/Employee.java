package com.mytest;

public class Employee extends Person {

	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	@Override
	public void print() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 부서 : " + getDept());
	}

}
