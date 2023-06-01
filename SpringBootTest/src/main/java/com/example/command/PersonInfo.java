package com.example.command;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PersonInfo {

	private String name;
	private int age; // 문자열을 입력받으면 typeMismatch 400 에러 발생
	@DateTimeFormat(pattern = "yyyyMMdd") // '/' 기호만 인식하기 때문에 따로 패턴을 지정하면 인식된다.
	private Date birth;
	private List<String> favAnimal; // checkbox로 받아 오는 값의 이름과 변수명을 일치시켜야 한다.

}
