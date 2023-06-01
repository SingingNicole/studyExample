package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class HelloController {

	@GetMapping("/hello") // get 방식으로 "/hello"라는 요청이 들어온 경우
	public void hello(Model m) {
		m.addAttribute("hello", "hello,spring!!");
		// return "hello"; // view name
		// String으로 저장하지 않아도 hello.jsp를 찾아갈 수 있음
		//	-> 요청 uri를 제외한 첫 번째 슬래시가 뷰네임이 되기 때문
	}
	
	@GetMapping("/jsondata")
	@ResponseBody // view를 거치지 않고 클라이언트 화면에 데이터 직접 출력
	public String getJson() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("tomato");
		list.add("사과");
		
		Gson gson = new Gson();
		return gson.toJson(list);
	}

}
