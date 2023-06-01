package day0210.oop.polymorphism;

public class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 날개로 날아다닙니다.");
	}

}
