package day0505.mvc.lunch;

import java.util.ArrayList;
import java.util.List;

import day0404.mvc.command.CommandHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {

		List<String> lunch = new ArrayList<>();
		lunch.add("서울익스프레스8");
		lunch.add("수제버거");
		lunch.add("맘스터치");
		lunch.add("불백당");

		req.setAttribute("menu", lunch);

		return "/WEB-INF/view/a.jsp";

	}

}
