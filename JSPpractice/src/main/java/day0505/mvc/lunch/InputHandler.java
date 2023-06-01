package day0505.mvc.lunch;

import day0404.mvc.command.CommandHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InputHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			String zipcode = req.getParameter("zonecode");
			String address = req.getParameter("address");
			System.out.println("아이디: " + id + ", " + "비밀번호: " + pw + ", " + "우편번호: " + zipcode + ", " + "주소: " + address);
			
			return "/WEB-INF/view/input.jsp";
			/*
			 * if(zipcode.equals("")) { return "/WEB-INF/view/form.jsp"; } else { return
			 * "/WEB-INF/view/input.jsp"; }
			 */

	}

}
