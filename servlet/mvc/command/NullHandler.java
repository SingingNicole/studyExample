package day0404.mvc.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 의도하지 않은 Null 값이 요청되었을 때 수행될 Servlet
public class NullHandler implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {

		res.sendError(HttpServletResponse.SC_NOT_FOUND); // 404 에러 response
		return null; // view 페이지를 표시할 필요가 없으므로 null 값 반환
		// 클라이언트에게 error 메세지가 출력된다.

	}

}
