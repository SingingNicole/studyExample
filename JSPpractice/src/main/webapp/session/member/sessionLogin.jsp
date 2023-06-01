<%@ page contentType = "text/html; charset=utf-8" %>
<%
String id = request.getParameter("id"); // id 파라미터 값 가져오기
String password = request.getParameter("password"); // password 값 파라미터 가져오기
if (id.equals(password)) { // id와 패스워드의 값이 같다면
	session.setAttribute("MEMBERID", id); // "MEMBERID"에 id 값 저장
%>
<html>
<head>
<title>로그인 성공</title>
</head>
<body>
	로그인에 성공했습니다. <!-- 저장 성공 시 문자열 출력 -->
</body>
</html>	
<%
} else { // 로그인 실패 시
%>
	<script>
		alert("로그인에 실패하였습니다.");
		history.go(-1); // 이전 페이지로 이동
	</script>
<%
} // if end, 프로그램 끝.
%>
