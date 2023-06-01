package baek.fortest;

import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int y = Integer.parseInt(sc.next());
			int z = Integer.parseInt(sc.next());
			System.out.println(y + z);
		}
		sc.close();
	}
}
