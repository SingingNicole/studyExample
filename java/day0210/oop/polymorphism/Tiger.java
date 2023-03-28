package day0210.oop.polymorphism;

public class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 앞발로 사냥을 합니다.");
	}
}
