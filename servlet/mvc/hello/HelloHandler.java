package day0404.mvc.hello;

import day0404.mvc.command.CommandHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloHandler implements CommandHandler { // CommandHandler 상속

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		req.setAttribute("hello", "안녕하세요!"); // 화면에 보일 데이터 저장(setAttribute 활용)
		return "/WEB-INF/view/hello.jsp"; // 수행할 파일 경로 반환
	}

}
