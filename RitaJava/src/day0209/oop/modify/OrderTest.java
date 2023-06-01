package day0209.oop.modify;

public class OrderTest {

	public static void main(String[] args) {
		ValueObjectEx vo1 = new ValueObjectEx("국수집", "멸치국수", 1);
		System.out.println(vo1.getFood() + " " + vo1.getQuantity() + "개 주문");

		// vo1.quantity = 10; => setter가 없어 값을 변경하는 것이 불가능하다(데이터 보호)
		ValueObjectEx vo2 = new ValueObjectEx("국수집", "잔치국수", 2);
		System.out.println(vo2.getFood() + " " + vo2.getQuantity() + "개 주문");
		
		// value object : 저장만 목적으로 둠.
	}

}
