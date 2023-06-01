package day0126.array;

import java.util.Arrays;// Arrays 유틸 클래스

public class ArrayEx3 {

	public static void main(String[] args) {
		// 최대값, 최소값 구하기
		int[] age = { 67, 12, 33, 20, 24, 55, 87 };

		int max = age[0];// 최대값 저장공간, 첫번째 값으로 초기화 후 사용
		int min = age[0];// 최소값 인덱스

		for (int i = 1; i < age.length; i++) {
			if (max < age[i]) {
				max = age[i];
			}
			if (min > age[i]) {
				min = age[i];
			}
		}
		System.out.println("나이가 제일 많은 사람은 " + max + "세 입니다.");
		System.out.println("나이가 제일 적은 사람은 " + min + "세 입니다.");

		Arrays.sort(age);// 정렬(오름차순)
		System.out.println(Arrays.toString(age));
		// 제일 작은 값은 가장 앞 인덱스에, 가장 큰 값은 가장 뒤 인덱스에 저장된다.

		System.out.println("최소 : " + age[0]);
		System.out.println("최대 : " + age[age.length - 1]);
		// 최대값 : length의 값에서 1을 빼면 됨.
		// 숫자일때만 적용 가능.
	}
}
