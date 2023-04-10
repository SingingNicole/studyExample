package com.example; // 해당 패키지와 그 하위패키지는 무조건 스캔의 대상이 됨.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 다양한 annotation을 한 번에 모아서 가지고 있다.
// @ComponentScan(basePackages = {"com.example", "com.test"})
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

}
