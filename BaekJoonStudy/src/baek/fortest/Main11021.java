package baek.fortest;

import java.util.Scanner;

public class Main11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < x - 1; i++)
			;
		{
			for (int j = 0; j < x; j++) {
				int a = Integer.parseInt(sc.next());
				int b = Integer.parseInt(sc.next());
				sum = a + b;
				System.out.printf("Case #%d: %d\n", j + 1, sum);
			}
		}
		sc.close();
	}

}
