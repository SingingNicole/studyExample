package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> arg0) {
		return ContentDto.class.isAssignableFrom(arg0);	// 검증할 객체의 클래스 타입 정보
	}
	
	@Override
	public void validate(Object obj, Errors errors) {	// 커맨드 객체를 파라미터로 받아들인다.
		ContentDto dto = (ContentDto)obj;	// 형변환하여 변수에 저장.
		
		String sWriter = dto.getWriter();
		if(sWriter == null || sWriter.trim().isEmpty()) {
			System.out.println("Writer is null or empty");
			errors.rejectValue("writer", "trouble");
		}
		
		String sContent = dto.getContent();
		if (sContent == null || sContent.trim().isEmpty()) {
			System.out.println("Content is null or empty");
			errors.rejectValue("content", "trouble");
		}

	}

}
