package com.example; // 해당 패키지와 그 하위패키지는 무조건 스캔의 대상이 됨.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.HiddenHttpMethodFilter;
// import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 다양한 annotation을 한 번에 모아서 가지고 있다.
// @ComponentScan(basePackages = {"com.example", "com.test"})
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Bean // 메서드가 리턴한 객체를 컨테이너에 등록
	// _method라는 이름으로 전달된 값을 요청방식으로 인식한다.
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}

	@Bean
	// Http 요청 후 JSON, XML, String과 같은 응답을 받아 Java Object로 가져 옴.
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
