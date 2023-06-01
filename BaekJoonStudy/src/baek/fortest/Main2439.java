package baek.fortest;

import java.util.Scanner;

public class Main2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 1; i <= x; i++) {

			for (int j = x; j >= 1; j--) {

				if (i < j) {

					System.out.print(" ");

				} else {

					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
