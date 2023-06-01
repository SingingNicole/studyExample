package day0208.oop.inheritance;

public class Point3D extends Point { // Object를 상속받은 Point 클래스를 상속받은 Point3D
	int z;
	
	Point3D(int x, int y, int z) {
		//super(); // Point(); -> 기본 생성자가 없어 사용 불가.
		super(x, y); // 호출할 수 있도록 매개변수를 맞추어 주어야 함.
		// super의 멤버가 초기화되어야 하기 때문에 무조건 super()가 호출
		this.z = z; // sub 멤버는 sub에서 초기화
	}
	
	String getLocation() {
		return super.getLocation();
	}
}
