package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.ContentCommand;

@Controller
public class ValidatorController {

	@GetMapping("/valid/insertForm")
	public String form() {
		return "validator/createPage";
	}

	@RequestMapping("/valid/create")
	public String submit(@ModelAttribute("command") @Validated ContentCommand command,
			BindingResult result) {		// 검사 진행, 통과되지 않으면 result에 오류 객체 저장

		String view = "validator/createDonePage";	// 검사, 변수 지정

		if (result.hasErrors()) {	// result에 error 객체 있을 경우

			if (result.getFieldError("writer") != null) {
				System.out.println("writer: " + result.getFieldError("writer").getDefaultMessage());
			}

			view = "validator/createPage";
		}

		return view;

	}

}
