package day0214.exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int i = 100;
			int n = Integer.parseInt(args[0]); // ArrayIndexOutOfBoundsException
			// Integer.parseInt => 숫자만 입력받으므로 int n에 문자를 넣으면 NumberFormatException 발생
			// n의 값이 0이라면 ArithmeticException 발생
			System.out.println(i / n);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ne) { // 다른 오류를 한 번에 처리 가능
			System.out.println("값을 입력해야 합니다.");
		} /*
			 * catch (NumberFormatException ne) { System.out.println("숫자만 입력하세요"); }
			 */catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		// 멀티플 캐치 : 발생 가능한 여러 개의 오류를 처리해야 할 때 사용한다.
	}

}
