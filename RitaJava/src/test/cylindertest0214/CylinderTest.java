package test.cylindertest0214;

public class CylinderTest {

	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Cylinder C = new Cylinder(c, 5.6);
		// Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);

		System.out.println(C.getVolume());
		// System.out.printf("원통의 부피 : %3f", cylinder.getVolume());
		// %nf => 소수점 n의 자리까지 출력
	}

}
