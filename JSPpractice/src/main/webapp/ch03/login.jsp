<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
</head>
<body>
<%
	String id = request.getParameter("memberId");
	String pw = request.getParameter("memberPw");
	// id와 pw가 같으면 로그인이 성공한 것으로 판단한다.
	if(id.equals(pw)) { // 입력 값이 null 이라면 NullPointerException 발생, 500 에러 코드
		response.sendRedirect("index.jsp");
	} else {
		%>
		로그인 실패!! 다시 로그인하세요!!
		<button onclick="history.go(-1)">로그인 form</button> <!-- history.go(-1): 이전 페이지로 이동 -->		
	<% } %>
</body>
</html>