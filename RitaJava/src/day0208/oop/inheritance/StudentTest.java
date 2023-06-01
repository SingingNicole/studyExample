package day0208.oop.inheritance;

public class StudentTest {

	public static void main(String[] args) {
		// 학번 - 1, 이름 - 김자바, 국어 - 100점 객체 생성

		Score s = new Score("국어", 100);
		Student stu1 = new Student(1, "김자바", s);

		System.out.printf("%d번 %s 학생의 %s성적은 %d점입니다.\n", stu1.sid, stu1.name, stu1.score.subject, stu1.score.point);

		Student stu2 = new Student(2, "이자바", new Score("국어", 90));

		System.out.printf("%d번 %s 학생의 %s성적은 %d점입니다.", stu2.sid, stu2.name, stu2.score.subject, stu2.score.point);
	}

}
