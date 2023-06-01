package baek.arrayex;

import java.util.Scanner;

public class Main4344 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for (int i = 0; i < C; i++) {
			int N = Integer.parseInt(sc.next());
			int sum = 0;
			double avg = 0;
			int count = 0;
			double percent = 0;

			int[] score = new int[N];

			for (int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(sc.next());
				sum += score[j];
				avg = (double) sum / N;
			}

			for (int j = 0; j < score.length; j++) {
				if (score[j] > avg) {
					count++;
				}

				percent = (double) count / N * 100;

			}

			System.out.println(String.format("%.3f", percent) + "%");

		}

		sc.close();

	}

}
