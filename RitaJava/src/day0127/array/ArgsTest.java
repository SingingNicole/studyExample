package day0127.array;

public class ArgsTest {
		// main = 프로그램의 시작점.
	public static void main(String[] args) {
		/*
		 * String[] args 란? : 시작 시 필요한 값이 있다면 전달받는 공간.
		 *  -> 값이 몇 개 필요한지 확실하지 않아 배열을 사용한다.
		 *  -> 값을 입력하지 않으면 빈 배열이 생성된다.
		 *  -> 인수, 인자, argument, 파라미터(전달받는 값)
		 * args = 변수명(arguments) -> 바꿀 수 있으나 일반적으로 사용됨.
		 * 
		 */
		
		if(args.length == 0) {
			System.out.println("argument값이 없습니다.");
		} else {
			for(String s : args) {
				System.out.println(s);
			}
		}
	}
}
