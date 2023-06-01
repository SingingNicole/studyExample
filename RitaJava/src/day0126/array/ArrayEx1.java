package day0126.array;

import java.util.Arrays; // 배열과 관련된 내용이 있는 class

public class ArrayEx1 {

	public static void main(String[] args) {
		char[] ch = new char[4]; // char ch[]도 가능하나 타입 뒤에 주로 쓰인다.
		// new : 공간 형성, 뒤에 공간의 용량 지정.
		// 배열은 한 번 만들어지면 크기가 고정된다.

		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';

		for (int i = 0; i < ch.length; i++) {
			// length를 사용하면 배열 내의 모든 데이터를 추출해 올 수 있다.
			System.out.println(ch[i]);
		}
		// 배열 생성과 초기화를 한번에!
		int[] iarr = { 1, 2, 3, 4 };
		// 저장되어 있는 데이터의 개수에 따라 배열이 만들어진다.
		// 배열의 주소값에 저장되어 있다.
		// iarr[0] == 1
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}

		/*
		 * // 가장 많이 사용하지만 사용하지 못하는 경우도 존재 int[] test; test = {1, 2, 3,}; -> 선언하는 부분과
		 * 생성하는 부분이 다르면 error
		 */

		int[] iarr2 = new int[] { 10, 20, 30 };
		// 데이터 3개, 3칸짜리 배열 형성
		// 선언과 생성이 다른 문장에 있어도 가능하다.

		// 배열 자체에 어떤 데이터가 있는지 알고 싶은 경우는?
		System.out.println(Arrays.toString(ch));// 배열이 가지고 있는 값을 대괄호 안에서 출력해준다.
		System.out.println(Arrays.toString(iarr));
		System.out.println(Arrays.toString(iarr2));
		
		/*
		 * //foreach : 집합데이터의 처음부터 마지막 데이터를 전부 꺼내온다.
		 * for( 변수 선언 : 집합데이터(배열, 컬렉션)) { 수행문; }
		 */
		
		for (int x : iarr) {
			System.out.println(x);
		}
		//ch배열의 모든 데이터를 출력하는 foreach
		for (int y : ch) {
			System.out.println(y);
		}
	}
}
