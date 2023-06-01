package baek.iftest;

import java.util.Scanner;

public class Main2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d1 = Integer.parseInt(sc.next());
		int d2 = Integer.parseInt(sc.next());
		int d3 = Integer.parseInt(sc.next());

		boolean x = d1 == d2;
		boolean y = d1 == d3;
		boolean z = d2 == d3;

		if (x && y && z) {
			System.out.println(10000 + d1 * 1000);
		} else if (x || y) {
			System.out.println(1000 + d1 * 100);
		} else if (z) {
			System.out.println(1000 + d3 * 100);
		} else if (d1 > d2 && d1 > d3) {
			System.out.println(d1 * 100);
		} else if (d2 > d1 && d2 > d3) {
			System.out.println(d2 * 100);
		} else if (d3 > d1 && d3 > d2) {
			System.out.println(d3 * 100);
		}
		sc.close();
	}
}
