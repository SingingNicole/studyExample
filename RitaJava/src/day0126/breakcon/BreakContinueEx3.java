package day0126.breakcon;

public class BreakContinueEx3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			} // i가 3의 배수일 때만 continue 문 수행.

			System.out.println(i);
		}
	}
}
