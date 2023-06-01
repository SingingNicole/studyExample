package day0208.oop.inheritance;

public class Student {
	
	int sid;
	String name;
	Score score; // 포함관계
	
	public Student(int sid, String name, Score s) {
		this.sid = sid;
		this.name = name;
		this.score = s;
	}

}
