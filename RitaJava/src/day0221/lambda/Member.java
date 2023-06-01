package day0221.lambda;

public class Member {
	private String name;
	private String id;

	public Member() {
		System.out.println("Member() 생성자");
	}

	public Member(String id) {
		System.out.println("Member(String id) 생성자");
		this.id = id;
		// 매개변수가 String 하나인 생성자
	}

	public Member(String name, String id) {
		System.out.println("Member(String name, String id) 생성자");
		this.name = name;
		this.id = id;
		// 매개변수 2개인 생성자
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + "]";
	}

}