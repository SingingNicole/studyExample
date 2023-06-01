package com.test0215;

public class Employee {

	private String no;
	private String name;
	private String dept;
	private String job;
	private int sal;

	public Employee(String no, String name, String dept, String job, int sal) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.sal = sal;
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public String getJob() {
		return job;
	}

	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return no + ": " + dept + " " + name + " " + job;
	}

}
