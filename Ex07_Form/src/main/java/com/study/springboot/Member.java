package com.study.springboot;

// 커맨드 객체
// DTO 객체와 유사 => 파라미터와 관련되어 있을 때는 커맨드.
public class Member {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
