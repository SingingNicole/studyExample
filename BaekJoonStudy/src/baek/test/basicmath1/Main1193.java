package baek.test.basicmath1;

import java.util.Scanner;

public class Main1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = 1;
		int numer = 0;
		int deno = 0;

		while (y * (y + 1) / 2 < x) {
			y++;
		}

		if (y % 2 != 0) {
			numer = y - (x - (y * (y - 1) / 2) - 1);
			deno = x - y * (y - 1) / 2;
		} else {
			numer = x - y * (y - 1) / 2;
			deno = y - (x - (y * (y - 1) / 2) - 1);
		}

		System.out.println(numer + "/" + deno);
		sc.close();

	}

}
