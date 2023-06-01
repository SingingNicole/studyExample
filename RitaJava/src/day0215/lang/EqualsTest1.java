package day0215.lang;

class Value{
	int value;

	public Value(int value) {
		this.value = value;
	}
	// value에 저장된 값이 같으면 같은 객체 -> overriding

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value v = (Value)obj;
			return value == v.value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return value; // value가 가지고 있는 값을 그대로 return
	}

}

public class EqualsTest1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		// object가 저장된 hashcode를 int형으로 return
		// hashcode 메서드를 override했기 때문에 각 hashcode에 저장된 객체의 값을 return한다
		
		if(v1 == v2) {
			// 기본형을 비교할 때는 == 사용
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		if(v1.equals(v2)) { // v1이 가리키고 있는 객체와 v2가 가리키는 객체의 값을 비교
			// Object의 equals()는 가리키고 있는 객체가 같은지 다른지 비교한다.
			// 결과적으로 주소값 비교와 같은 역할.
			System.out.println("v1과 v2는 같습니다.");
		} else { 
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		System.out.println(v1); // toString을 override 하지 않았기 때문에 hashcode의 값이 출력된다.
	}

}
