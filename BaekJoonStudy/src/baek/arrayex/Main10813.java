package baek.arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class Main10813 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int[] basket = new int[n + 1];

		for (int i = 0; i < basket.length; i++) {
			basket[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int ib = Integer.parseInt(sc.next());
			int jb = Integer.parseInt(sc.next());

			basket[0] = basket[ib];
			basket[ib] = basket[jb];
			basket[jb] = basket[0];
		}

		int[] basket2 = Arrays.copyOfRange(basket, 1, basket.length);
		for (int a : basket2) {
			System.out.print(a + " ");
		}
		sc.close();

	}

}
