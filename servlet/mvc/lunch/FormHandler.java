package day0505.mvc.lunch;

import day0404.mvc.command.CommandHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {

		return "/WEB-INF/view/form.jsp";

	}
	
}
