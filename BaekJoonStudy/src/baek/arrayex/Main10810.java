package baek.arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class Main10810 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] basket = new int[n + 1];

		for (int i = 0; i < m; i++) {

			int ib = Integer.parseInt(sc.next());
			int jb = Integer.parseInt(sc.next());
			int kb = Integer.parseInt(sc.next());

			for (int j = ib; j < jb + 1; j++) {
				basket[j] = kb;
			}
		}

		int[] basket2 = Arrays.copyOfRange(basket, 1, basket.length);
		for (int a : basket2) {
			System.out.print(a + " ");
		}
		sc.close();

	}

}
