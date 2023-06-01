package day0127.array;

import java.util.Arrays;

public class ArrayAddressEx {
	// 실행 시 argument에 hello world 두 개 입력

	public static void main(String[] args) {
		String[] arr = args;
		// 배열의 주소값을 꺼내 입력

		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(arr));

		arr[0] = "hi";

		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(arr));
		
		// args라는 변수에 값 넣어 출력
		// 배열에는 주소값이 저장된다!
	}

}
