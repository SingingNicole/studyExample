package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.NewArticleCommand;

/*GET : article/newArticle
  POST : article/newArticle*/

@Controller
@RequestMapping("/article/newArticle") // annotation에 속성 부여 시 문자열로
public class NewArticleController {

	@GetMapping
	public String form() {
		return "article/newArticleForm";
		// 요청 처리 메서드에서 String 리턴 시 return값=view name
	}

	@PostMapping // post 방식 메서드
	public String submit(@ModelAttribute("command")NewArticleCommand article) { // string으로 view 경로 return		
		// 1. dispatcherServlet이 NewArticleCommand 객체 생성 - 매개변수에 저장
		// 2. @~Mapping이 요청 파라미터값을 변수명에 맞게 저장(setter)
		// 3. dispatcherServlet이 생성한 객체는 전부 view로 전달됨(model)
		// 이름(key)을 지정하지 않으면 클래스명을 사용하되 첫글자는 소문자로 변경
		// @ModelAttribute을 사용해 model 이름을 지정해 줄 수 있다.
		System.out.println(article);
		return "article/newArticleSubmit";

	}

}
