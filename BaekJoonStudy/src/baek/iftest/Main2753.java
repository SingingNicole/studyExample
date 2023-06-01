package baek.iftest;

import java.util.Scanner;

public class Main2753 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		if ( x % 4 == 0 ) {
			
		if ( x % 100 == 0 ) {
			if ( x % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("1");
		}
			
		}
		else {
			System.out.println("0");
		}
		
	}
}
