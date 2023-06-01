package baek.stringtest;

import java.util.Scanner;

public class Main9086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String test = sc.next();
			System.out.println(String.valueOf(test.charAt(0)) + String.valueOf(test.charAt(test.length() - 1)));
		}

		sc.close();
	}

}
