package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 다음 Member 클래스를 bean으로 등록
public class Member {
	@Value("홍길동") // value 기본값 지정
	private String name;
	@Value("도사")
	private String nickname;
	@Autowired
	@Qualifier("printerA")
	private Printer printer;

	public Member() {
	}

	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}

}
