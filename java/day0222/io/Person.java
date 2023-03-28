package day0222.io;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L; // 버전 관리
	// 복원을 위한 버전 관리임. 같은 버전인 경우 복원하라는 의미, 비교 대상으로 상수 사용

	String name; // 저장하고 있는 인스턴스 변수를 직렬화한다.
	transient String job; // transient: 직렬화 대상에서 제외, 스트림을 통해 전송할 수 없음.
	// 저장되지 않아 복원(역직렬화)할 수 없다.

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

}
