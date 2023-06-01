package day0330.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet; // 항상 @WebServlet 어노테이션을 추가해야 한다.
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/servletTest", "/now"}) // url에 /servletTest로 표기된다.
public class NowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	} // 클라이언트가 요청할 때마다 request 객체와 response 객체가 만들어진다.
	// response: 클라이언트에게 보냄 => writer(출력 스트림)
	// contextPath: url 상에서 가장 처음으로 접근하는 경로.
	// 결과물 => Served at: + contextPath

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
