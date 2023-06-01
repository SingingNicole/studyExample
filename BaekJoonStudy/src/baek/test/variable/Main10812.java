package baek.test.variable;

import java.util.Arrays;
import java.util.Scanner;

public class Main10812 {
	
	private static void swap (int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	private static void reverse (int[] arr, int begin, int end) {
		int end2 = end + 1;
		while (begin < end2) {
			swap(arr, begin, end + 1);
			begin++;
			end2--;
		}		
	}
	
	public static void rightShift (int[] arr, int n) {
		int size = arr.length;
		reverse(arr, 0, n);
		reverse(arr, n, size);
		reverse(arr, 0, size);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int[] basket = new int[n + 1];

		for (int i = 0; i < basket.length; i++) {
			basket[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int begin = Integer.parseInt(sc.next());
			int end = Integer.parseInt(sc.next());
			int mid = Integer.parseInt(sc.next());
			
			
			
		}

		int[] basket2 = Arrays.copyOfRange(basket, 1, basket.length);
		for (int a : basket2) {
			System.out.print(a + " ");
		}

	}

}
