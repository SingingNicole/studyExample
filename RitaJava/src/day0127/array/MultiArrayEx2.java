package day0127.array;

import java.util.Arrays;

public class MultiArrayEx2 {

	public static void main(String[] args) {
		int[][][] arr = new int [3][3][3];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length;k++) {
					arr[i][j][k] = num;
					num++;
				}
			}
		}
		for(int[][] iarr : arr) {
			for(int[] iarrr : iarr) {
				System.out.println(Arrays.toString(iarrr));
			}
		}
		System.out.println();
		
	}

}
