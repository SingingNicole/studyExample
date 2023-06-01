package day0127.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		int [] i1 = {1, 2, 3, 4, 5};
		int [] copy = new int[5];
		
		//System.arraycopy(복사할 배열, 시작 인덱스, 복사 받을 배열, 시작 인덱스, 복사할 데이터의 수);
		
		System.arraycopy(i1, 1, copy, 0, 3); // 복사할 배열 = i1, 시작 인덱스 1번, 복사 받을 배열 = copy, 시작 인덱스 = 0, 복사할 데이터의 수 = 3
		System.out.println(Arrays.toString(copy));
		
		// 깊은 복사 : 새로운 배열을 만들어 복사한다.
		
		int[] copy2 = i1.clone(); // 똑같은 배열이 복제됨.
		System.out.println(Arrays.toString(copy));
		copy2[4] = 10;
		System.out.println(Arrays.toString(copy2));

	}

}
