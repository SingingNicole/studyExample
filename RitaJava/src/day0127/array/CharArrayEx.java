package day0127.array;

public class CharArrayEx {

	public static void main(String[] args) {
		// char : 문자
		// String : 문자 여러 개(문자열)
		// char[] : 문자 여러 개(문자열)
		// -> String과 char[]은 비슷한 역할.
		
		char[] carr = {'A', 'B', 'C'};
		System.out.println(carr);
		
		// String 배열은 이미 안에 저장된 값이 주소값이기 때문에 문자열 출력이 불가능하다.
		
		int[] iarr = {1, 2, 3, 4};
		System.out.println(iarr); // 배열 주소 출력 (타입@주소)
	}

}
