package day0215.lang;

class Student {
	int studentId;
	String name;

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s2 = (Student) obj;
			if (studentId == s2.studentId) {
				return name.equals(s2.name);
			}
		}
		return false; // 객체의 타입이 다르면 다른 객체
	}

	@Override
	public int hashCode() {
		return studentId + name.hashCode(); // 문자열의 경우 문자열 자체의 hashcode값을 꺼내 옴
	}

}

public class EqualsTest2 {

	public static void main(String[] args) {

		Student s1 = new Student(123, "kim");
		Student s2 = new Student(123, "kim");
		
		System.out.println(s1.hashCode() == s2.hashCode());

		if (s1 == s2) {
			System.out.println("s1과 s2는 같은 학생입니다.");
		} else {
			System.out.println("s1과 s2는 다른 학생입니다.");
		}
		if (s1.equals(s2)) {
			System.out.println("s1과 s2는 같은 학생입니다.");
		} else {
			System.out.println("s1과 s2는 다른 학생입니다.");
		}
	}

}
