package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/") // url 호출이 /인 경우
	public @ResponseBody String root() throws Exception {
		return "Form 데이터 전달받아 사용하기";
	}
	
	@RequestMapping("/test1")
	public String test1(HttpServletRequest httpServletRequest ,Model model) {
		String id = httpServletRequest.getParameter("id");
		String name = httpServletRequest.getParameter("name");
		// 추출한 데이터를 모델에 담아 return한다.
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2(@RequestParam("id") String id, @RequestParam("name") String name,
			Model model) {
		// 파라미터 변수에 직접 값을 넣는다.
		// 파라미터가 많아지면 불편해진다.
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "test2";
	}
	
	@RequestMapping("/test3")
	public String test3(Member member, Model model) {
		// 파라미터와 일치하는 bean을 만들어서 사용할 수 있다.
		// View 페이지에서 model을 사용하지 않고 member 사용
		// 파라미터와 이름이 같은 변수를 가진 커맨드 객체를 이용한다.
		// 커맨드 객체 자체도 뷰에 전달된다.
		return "test3";
	}
	
	// path 자체에 변수를 넣을 수도 있다.
	@RequestMapping("/test4/{studentId}/{name}")
	public String getStudent(@PathVariable String studentId, @PathVariable String name,
			Model model) {
	// PathVariable 어노테이션을 사용하여 path에 들어갈 변수임을 명시한다.
		model.addAttribute("id", studentId);
		model.addAttribute("name", name);
		return "test4";
	}
}
