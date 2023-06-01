package day0208.oop.inheritance;

public class Point extends Object { // Object 내에서 컴파일을 거쳐야 함.
	int x;
	int y;

	public Point(int x, int y) {
		super(); // extends 뒤의 Object 생성자 중 매개변수 없는 Object();를 찾는다.
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x : " + x + " y : " + y;
	}

}
