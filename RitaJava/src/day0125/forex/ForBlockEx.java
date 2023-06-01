package day0125.forex;

public class ForBlockEx {

	public static void main(String[] args) {
		/*
		 * if&for문의 영역 - 특정 영역 내 선언된 변수는 영역이 끝나면 소멸된다.
		 * 영역을 벗어나면 사용할 수 없다.
		 */
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		} // 이 위치에서 선언된 변수는 가비지 콜렉터(GC)에 의해 삭제됨.
		System.out.println(); // 해당 위치에서는 i 변수를 출력할 수 없음.

		/*
		 * for문 밖에서 i 출력하기 -> 메인 영역에서 int i 선언/이 경우 초기 식 삭제 가능
		 *  - 이 경우 다른 곳에서도 i 변수를 활용할 수 있다.
		 */		
	}

}
