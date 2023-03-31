<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>
<% if(request.getMethod().equals("POST")) { %>
	<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		if (id.isEmpty() || pwd.isEmpty()) { // 유효성 체크
			request.setAttribute("error", "ID 또는 비밀번호를 입력해 주세요!");
			RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
			rd.forward(request, response);
			return;
		} %>
		
		<%= id %> / <%= pwd %>
	
		<% if (session.isNew() || session.getAttribute("id") == null) { // 두 조건 모두 만족하면 현재 로그인 상태이다.
			// .isNew(): HttpSession 객체를 새로 생성하여 반환하면 true, 기존 객체를 반환하면 false.
			session.setAttribute("id", id); // session에 "id" 이름으로 id 값 등록
			out.print("로그인 작업이 완료되었습니다.");
		} else {
			out.print("이미 로그인 상태입니다.");
		} %>
		
	<% } else if (request.getMethod().equals("GET")) {
			if (session != null && session.getAttribute("id") != null) {
				session.invalidate(); // HttpSession 객체를 삭제한다.
				out.print("로그아웃 작업이 완료되었습니다.");
			} else {
				out.print("현재 로그인 상태가 아닙니다.");
			}
	} %>
	
	<% RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
	   rd.forward(request,response); %>

</body>
</html>