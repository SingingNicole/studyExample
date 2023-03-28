package com.test0220;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WorkInfo {

	private String date;
	private String work;
	private int days;

	public WorkInfo(String date, String work, int days) {
		this.date = date;
		this.work = work;
		this.days = days;
	}

	public String getDate() {
		return date;
	}

	public String getWork() {
		return work;
	}

	public int getDays() {
		return days;
	}

	public void printInfo() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date start = null;

		try {
			start = sdf.parse(date);
		} catch (Exception e) {
			System.out.println("잘못된 값이 입력되었습니다.(종료)");
			return;
		}

		Calendar c = Calendar.getInstance();
		c.setTime(start); // Date가 캘린더에 저장
		c.add(Calendar.DATE, days);

		Date end = c.getTime(); // Calendar를 Date로 변환
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");

		System.out.println(work + "의 시작일은 " + sdf2.format(start) + "이고 " + sdf2.format(end) + "까지 수행해야 합니다.");

		// 메서드 내에만 사용하는 변수는 메서드 안에서 인스턴스 변수로 선언하자

	}

}
