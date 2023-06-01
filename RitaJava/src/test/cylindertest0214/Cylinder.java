package test.cylindertest0214;

public class Cylinder {

	private double height;
	private Circle circle;

	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}

}
