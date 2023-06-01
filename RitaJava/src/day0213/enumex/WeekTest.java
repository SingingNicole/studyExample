package day0213.enumex;

public class WeekTest {

	public static void main(String[] args) {
		Week today = null;
		today = Week.MON;

		System.out.println(today);
		System.out.println(today.name());
		
		today = Week.valueOf("TUE");
		System.out.println(today);
		
		// today = Week."월요일", 없는 값 저장 불가
	}

}
