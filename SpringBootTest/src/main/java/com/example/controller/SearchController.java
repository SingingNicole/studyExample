package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	@RequestMapping("/search/internal")
	public ModelAndView searchInternal(String query, @RequestParam("p") int pageNumber) {
		// RequestParam으로 p 파라미터의 값을 int 변수에 저장한다.
		System.out.println("query=" + query + ", pageNumber=" + pageNumber);
		return new ModelAndView("search/internal");
		// ModelAndView 생성자("viewname");
		// ModelAndView("viewname", "model이름", model값);
	}

	@RequestMapping("/search/external")
	public ModelAndView searchExternal(String query,
			@RequestParam(value="p", defaultValue="1")int pageNumber) {
		// String에는 null값이 저장 가능하나 int에는 null값 저장이 불가능하여 defaultValue를 지정한다.
		System.out.println("query=" + query + ", pageNumber=" + pageNumber);
		
		// ModelAndView 객체 생성하여 return
		ModelAndView mav = new ModelAndView(); // 새 ModelAndView 객체 추가
		// ModelAndView mav = new ModelAndView("view name");
		mav.setViewName("search/external"); // view name 추가
		mav.addObject("query", query); // model 데이터 추가
		return mav;
	}

}
