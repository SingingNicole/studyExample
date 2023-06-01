package day0127.array;

public class MultiArrayEx {

	public static void main(String[] args) {
		// 이차원 배열 : 배열 속 배열
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		//foreach를 활용한 다중 배열 출력
		for(int[] iarray : arr) { // 첫 번째 1차원 배열 저장
			for(int i : iarray) {
				System.out.print(i); // 한 배열을 모두 출력한다.
			}
			System.out.println(); // 공백 후 다음 배열을 모두 출력한다.
		}

	}

}
