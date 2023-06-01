package spring.di;

public class Fooo {

	Bar bar;
	// look up 메서드 선언
	public Bar getBar() {
		return null;
	}

	public void doFooo() {
		System.out.println("Fooo.doFooo() 실행.");
		bar = getBar(); // container의 Bar 객체를 가져와 저장.
		bar.doBar();
	}
	
	public void start() {
		System.out.println("Fooo.start() 초기화 메서드");
	}
	
	public void stop() {
		System.out.println("Fooo.stop() 소멸 메서드");
	}

}
