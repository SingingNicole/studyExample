package baek.stringtest;

import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int R = 0;
		String S;
		String s;

		for (int i = 0; i < T; i++) {
			R = sc.nextInt();
			S = sc.next();

			for (int j = 0; j < S.length(); j++) {
				s = String.valueOf(S.charAt(j));
				System.out.print(s.repeat(R));
			}
			System.out.println();
		}
		sc.close();
	}

}
