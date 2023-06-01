package baek.fxex;

import java.util.Scanner;

public class Main1065 {

	public static int sequence(int N) {
		int count = 99;
		int hundred = 0;
		int ten = 0;
		int one = 0;
		int gap1 = 0;
		int gap2 = 0;
		int gap3 = 0;

		if (N < 100) {
			count = N;
		} else if (N < 1000) {

			for (int i = 100; i < N + 1; i++) {

				hundred = i / 100;
				one = i % 10;
				ten = (i / 10) % 10;

				gap1 = hundred - ten;
				gap2 = ten - one;
				gap3 = (hundred - one) / 2;

				if (gap1 == gap2 && gap2 == gap3) {
					count++;
				}
			}

		} else if (N == 1000) {
			count = 144;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println(sequence(N));

		sc.close();

	}

}
