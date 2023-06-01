package baek.arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class Main1564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];

		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		Arrays.sort(score);

		int M = score[N - 1];
		double sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += (double) score[i] / M * 100;
		}

		System.out.println(sum / N);

	}

}
