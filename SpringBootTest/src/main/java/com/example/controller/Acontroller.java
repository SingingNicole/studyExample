package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.PersonInfo;

@Controller
@RequestMapping("/a") // 요청URI => 컨트롤러와 메서드 찾기
public class Acontroller {

	@GetMapping // get 방식 => uri로 이동.
	public String aform() {
		return "a/form"; // view 찾기
	}

	@PostMapping
	public String asubmit(@ModelAttribute("pinfo")PersonInfo personInfo) {
		System.out.println(personInfo);
		return "a/submit";
	}

}
