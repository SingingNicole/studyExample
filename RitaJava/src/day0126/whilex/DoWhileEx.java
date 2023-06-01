package day0126.whilex;

public class DoWhileEx {

	public static void main(String[] args) {
		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 5);

		System.out.println("프로그램 종료.");

		// while의 조건이 false여도 무조건 i의 값을 출력한다.
	}

}
