package com.example.excption;

import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice
// 프로젝트 작성이 끝난 후 에러페이지를 보여 줄 때 사용
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BoardException.class)
	public String handleCustomException(BoardException exception, Model model) {
		model.addAttribute("exception", exception);
		return "/errors/boardError";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception exception, Model model) {
		model.addAttribute("exception", exception);
		return "/errors/globalError";
	}

}
