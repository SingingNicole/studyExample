package com.test0220;

import java.util.*;

public class PersonInfoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("시작일과 작업이름, 작업일수를 입력하세요.");
		String d;

		do {
			System.out.print("시작일(yyyy/MM/dd) > ");
			d = sc.next();
		} while (!matchDate(d)); // 검사한 패턴이 true일때까지 반복

		System.out.print("업무명 > ");
		sc.nextLine(); // 엔터값을 읽어 옴
		String w = sc.nextLine();
		System.out.print("작업 일수 > ");
		int ds = sc.nextInt();

		WorkInfo wi = new WorkInfo(d, w, ds);
		wi.printInfo();

		sc.close();

	}

	// 문자열의 패턴 검사
	public static boolean matchDate(String date) { // 문자열 날짜 값 받아 옴
		String regex = "[0-9]{4}/[0-9]{2}/[0-9]{2}"; // 정규표현식 -> [] : 범위, {} : 개수
		return date.matches(regex); // 정규표현식의 패턴과 매칭된다면 저장한다.
		// (String).matches(String2) : String의 값이 String2와 매칭된다면 true, 아니라면 false
	}

}
