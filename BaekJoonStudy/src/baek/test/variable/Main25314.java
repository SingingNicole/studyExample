package baek.test.variable;

import java.util.Scanner;

public class Main25314 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = "long ";
		int n = sc.nextInt();

		System.out.println(w.repeat(n / 4) + "int");
		sc.close();

	}

}
