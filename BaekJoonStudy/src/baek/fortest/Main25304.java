package baek.fortest;

import java.util.Scanner;

public class Main25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {
				int a = Integer.parseInt(sc.next());
				int b = Integer.parseInt(sc.next());
				sum += (a * b);
			}

			if (X == sum) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}
		sc.close();
	}
}
