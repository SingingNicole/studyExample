package day0217.util.date;

import java.util.*;
import java.text.*;

class DateFormatEx3 {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date d = null;
		try {
			// d = df.parse(" 17일 2월 2023년 ");//예외발생
			d = df.parse("2023년 2월 17일");
			// parse를 사용해 날짜값으로 변환
			System.out.println(df2.format(d));
		} catch (Exception e) {
			System.out.println("패턴이 일치하지 않습니다.");
		}

		Calendar cal = Calendar.getInstance(); // 캘린더 객체 생성
		cal.setTime(d); // date의 날짜값을 캘린더에 저장
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		// 캘린더가 저장하고 있는 날짜값 중 이 날이 해당 해의 몇 번째 날인지 추출

	} // main

}