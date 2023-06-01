package baek.arrayex;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] answer = new String[N];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = sc.next();
			String temp[] = answer[i].split("X");

			int score = 0;

			for (int j = 0; j < temp.length; j++) {
				int x = temp[j].length();
				score += x * (x + 1) / 2;
			}

			System.out.println(score);
		}

		sc.close();

	}

}
