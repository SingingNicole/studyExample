package day0209.oop.modify;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,6);
		//t.hour = 13; -> private 변수이기 때문에 직접 값을 가져올 수 없음
		t.setHour(13); // setter를 활용하여 값 저장

	}

}
