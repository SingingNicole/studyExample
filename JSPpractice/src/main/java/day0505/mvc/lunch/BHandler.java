package day0505.mvc.lunch;

import day0404.mvc.command.CommandHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String menuString = req.getParameter("lunch");
		System.out.println("선택하신 점심 메뉴는 " + menuString + "입니다.");
		return "/WEB-INF/view/b.jsp";
	}

}
