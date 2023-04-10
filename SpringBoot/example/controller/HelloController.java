package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello") // get 방식으로 "/hello"라는 요청이 들어온 경우
	public String hello(Model m) {
		m.addAttribute("hello", "hello,spring!!");
		return "hello"; // view name
	}

}
