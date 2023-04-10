package com.example.command;

import java.util.List;

import lombok.Data;

@Data
public class PersonInfo {
	
	private String name;
	private int age;
	private List<String> animal; // checkbox로 받아 오는 값의 이름과 변수명을 일치시켜야 한다.

}
