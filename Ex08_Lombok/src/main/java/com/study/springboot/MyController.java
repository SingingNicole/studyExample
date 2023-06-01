package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/") // url 호출이 /인 경우
	public @ResponseBody String root() throws Exception {
		return "Lombok 사용하기";
	}

	
	@RequestMapping("/test3")
	public String test3(Member member, Model model) {
		// 파라미터와 일치하는 bean을 만들어서 사용할 수 있다.
		// View 페이지에서 model을 사용하지 않고 member 사용
		// 파라미터와 이름이 같은 변수를 가진 커맨드 객체를 이용한다.
		// 커맨드 객체 자체도 뷰에 전달된다.
		return "test3";
	}

}