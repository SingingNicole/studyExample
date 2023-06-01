package baek.stringtest;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String target = sc.next();
		sc.close();

		boolean search = false;

		for (int i = 97; i <= 122; i++) {

			for (int j = 0; j < target.length(); j++) {
				if (i != target.charAt(j)) {
					search = false;
				} else {
					System.out.print(j + " ");
					search = true;
					break;
				}
			}

			if (search != true) {
				System.out.print(-1 + " ");
			}

		}
	}
}
