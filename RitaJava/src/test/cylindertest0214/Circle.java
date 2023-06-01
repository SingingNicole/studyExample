package test.cylindertest0214;

public class Circle {

	private double radius;
	private static final double PI = 3.14; // 선언과 동시에 초기화 진행

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(radius, 2) * PI;
	}

}
