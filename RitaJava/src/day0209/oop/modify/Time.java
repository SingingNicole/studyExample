package day0209.oop.modify;

public class Time { // public => 다른 패키지에서도 해당 클래스를 활용하여 객체를 만들 수 있다.

	private int hour;
	private int minute;

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	// getter : 값을 리턴
	public int getHour() { // 값을 가져오는 것이라 매개변수는 필요 없음
		return hour;
	}

	// setter : 변수에 값을 저장(write), 리턴 값이 없어 void 사용
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) { // 시간의 범위가 넘어가는 값은 저장하지 않는다
			return;
		}
		this.hour = hour;
		// 지역 변수 hour에게 매개 변수 hour의 값 저장
	}
	// getter와 setter의 변수명은 일치시켜야 한다

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		}
	}

}
