package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest")
public class RestTestController {

	@GetMapping
	public String restForm() {
		return "rest/form";
	}

	@PostMapping
	public String postForm(String name) {
		System.out.println("name: " + name);
		return "redirect:/"; // 경로가 없으므로 index.html 출력
	}

	@PutMapping
	public String putSubmit(String name) {
		System.out.println("put name: " + name);
		return "redirect:/";
	}

	@DeleteMapping
	public String deleteSubmit(String name) {
		System.out.println("delete name: " + name);
		return "redirect:/";
		// return "rest/form"; 은 에러가 발생한다. jsp를 view로 사용할 때는 GET, POST, HEAD외에는 불가.
	}

}
