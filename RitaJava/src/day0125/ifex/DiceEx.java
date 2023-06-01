package day0125.ifex;

public class DiceEx {

	public static void main(String[] args) {
		
		/*주사위 놀이(1~6) 랜덤으로 값 추출(난수)
		*Math.random()//Math 클래스 안의 random 기능 : 0.0 ~ 1.0 범위에서 랜덤값 발생
		*(int)(0.0~6.0) => 0 ~ 5 사이의 랜덤 값.
		*(int)(0.0~6.0) +1 => 1 ~ 6 사이의 랜덤 값.
		*(int)(Math.random() * 범위) + 시작값
		*/
		/*
		 * int x = (int)(Math.random() * 100); int y = (int)(Math.random() * 100) + 1;
		 * 
		 * System.out.println(x); System.out.println(y);
		 */
		
		int a = (int)(Math.random() * 6) + 1;
		int b = (int)(Math.random() * 6) + 1;
		//a의 값이 b보다 크다면 A가 이겼습니다.
		//b의 값이 a보다 더 크다면 B가 이겼습니다.
		//같은 값이라면 A와 B가 비겼습니다.
		
		System.out.printf("A : %d, B : %d\n", a, b);
		
		if ( a > b ) {
			System.out.println("A가 이겼습니다.");
		} else {
			if ( a == b ) {
				System.out.println("A와 B가 비겼습니다.");
			}
		}
		
		if ( a < b) {
			System.out.println("B가 이겼습니다.");
		}
		
	}

}

/*  강사님 코드
 *  if(a > b){
 *  System.out.println("A승");
 *  }else if (b > a) {
 *  System.out.println("B승");
 *  }else if (a==b) {
 *  System.out.println("비김")
 *  }
 */
