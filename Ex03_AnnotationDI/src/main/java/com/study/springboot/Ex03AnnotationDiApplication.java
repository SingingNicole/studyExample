package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @Configuration: bean을 생성할 때 Singletone으로 한 번만 생성. 각종 설정 세팅
 * 
 * @EnableAutoConfiguration: 스프링 어플리케이션 컨텍스트(Application Context)를 만들 때 자동으로 설정
 * 기능 on. - 사용자가 필요할 것 같은 빈을 추측, ApplicationContext를 만들 때 필요한 설정 진행. - 클래스패스를
 * 기준으로 클래스 찾아 설정
 * 
 * @ComponentScan: 지정한 위치 이하에 있는 @Component와 @Configuration이 붙은 클래스를 스캔하여 bean
 * 등록
 */
public class Ex03AnnotationDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex03AnnotationDiApplication.class, args);
	}

}
