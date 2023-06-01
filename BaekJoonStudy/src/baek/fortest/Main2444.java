package baek.fortest;

import java.util.Scanner;

public class Main2444 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(" ".repeat(n - 1 - i));
			System.out.print("*".repeat(2 * i + 1));
			System.out.println();
		}

		int re = n - 1;

		for (int i = 0; i < re; i++) {
			System.out.print(" ".repeat(i + 1));
			System.out.print("*".repeat(2 * (re - i) - 1));
			System.out.println();
		}

	}

}
