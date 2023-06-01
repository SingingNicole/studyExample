package day0127.oop;

public class TvTest {

	public static void main(String[] args) {
		Tv t; // Tv 타입의 변수 t 선언. Tv 클래스로 생성한 객체의 주소값 저장.
		t = new Tv(); // new - 1. 메모리상에 새로운 주소를 할당받고 공간을 만든다.
						//   - 2. 클래스에 선언된 멤버들을 인스턴스로 만든다.
		
		t.channel = 10;
		t.chUp(); // 하나 증가했으므로 channel의 값은 11이 된다.
		// 메소드를 호출하면 실행 후 다시 돌아온다.
		t.chUp(); // 메소드가 한 번 더 실행되어 channel의 값은 12가 된다.
		
		System.out.println("현재 채널은 : " + t.channel);
		

	}

}
