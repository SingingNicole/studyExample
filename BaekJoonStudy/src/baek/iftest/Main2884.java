package baek.iftest;

import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		if (H >= 0 && M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else if (H > 0 && M < 45) {
			System.out.println((H - 1) + " " + (M + 60 - 45));
		} else if (H == 0 && M < 45) {
			System.out.println("23 " + (M + 60 - 45));
		}

		sc.close();
	}
}
