package com.example;

import lombok.Data; // Data 어노테이션은 Setter와 Getter를 한 번에 만들어 준다.
// import lombok.Getter;
// import lombok.Setter;

@Data // 어노테이션이 알아서 setter, getter 형성
public class Test {
	
	private String name;
	private int age;
	
	
}
