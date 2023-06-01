package day0404.mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/simple") // /simple 요청을 받을 경우 실행
public class SimpleController extends HttpServlet { // 요청을 받을 컨트롤러 생성

	private static final long serialVersionUID = 1L; // 디폴트 버전 id값 생성

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response); // 링크 클릭 시(요청 받을 시) doGet 메서드 실행
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// /simple 입력 시 동작, 현재 class에서만 동작한다.
		// 같은 class 내에 있을 경우 메서드명 X
		String type = request.getParameter("type"); // request 객체로부터 사용자의 요청 파악
		// type 파라미터로 넘어 온 값을 기준으로 수행한다.
		
		Object resultObject = null; // 클라이언트에게 전송할 Object(결과물)

		if (type == null || type.equals("greeting")) {
			resultObject = "안녕하세요.";
		} else if (type.equals("date")) {
			resultObject = new java.util.Date();
		} else {
			resultObject = "invalid Type";
		}
		
		request.setAttribute("result", resultObject); // request나 session에 처리 결과 저장
		// 결과를 저장하여 view에서 볼 수 있게 한다.
		// 해당 결과는 다음 페이지에서도 저장할 필요가 없기 때문에 request로 저장한다.
		request.setAttribute("type", type); // 필요한 정보가 있을 때마다 request 객체를 만들어 저장한다.

		RequestDispatcher dispatcher = request.getRequestDispatcher("/simpleView.jsp"); // view로 이동한다.
		dispatcher.forward(request, response); // simpleView 파일로 forward한다.

	}

}
