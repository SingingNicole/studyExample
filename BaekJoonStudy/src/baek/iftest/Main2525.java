package baek.iftest;

import java.util.Scanner;

public class Main2525 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int CT = sc.nextInt();
		int FM = M + CT;
		int H2 = FM / 60;

		if (FM < 60) {
			System.out.println(H + " " + FM);
		} else {
			if ((H + H2) > 23) {
				System.out.println((H + H2 - 24) + " " + (FM % 60));
			} else {
				System.out.println((H + H2) + " " + (FM % 60));
			}
		}

		sc.close();

	}

}
