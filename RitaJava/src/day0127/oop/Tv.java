package day0127.oop;

public class Tv {
	int channel; // 값을 지정하지 않으면 기본값을 저장(0)
	boolean power; // (false)
	String color; // (null)
	
	public Tv() {}
	
	public Tv(int channel, boolean power, String color) {
		this.channel = channel;
		this.power = power;
		this.color = color;
	}
	
	void power() { power = !power; } // 기존의 값을 반대로 바꾼다.
	void chUp() { channel++; } // channel의 값을 1씩 증가시킨다.
	void chDown() { channel--; } // channel의 값을 1씩 감소시킨다.
	
	// main이 없어 다른 클래스에서 활용해야 한다.

}
