package baek.fxex;

import java.util.Scanner;

public class Test15596 {

	static long sum(int[] a) {
		long summary = 0;

		for (int i = 0; i < a.length; i++) {
			summary += a[i];
		}
		return summary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(sum(A));

		sc.close();
	}
}
