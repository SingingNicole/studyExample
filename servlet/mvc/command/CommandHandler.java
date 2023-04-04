package day0404.mvc.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface CommandHandler {

	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception;
	// 추상 메서드 선언
}
