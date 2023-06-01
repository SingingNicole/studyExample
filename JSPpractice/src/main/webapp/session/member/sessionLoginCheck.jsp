<%@ page contentType = "text/html; charset=utf-8" %>
<%
String memberId = (String)session.getAttribute("MEMBERID"); // "MEMBERID"의 값을 memberId 문자열에 저장
boolean login = memberId == null? false : true; // 값이 존재하면 true, null이라면 false
%>
<html>
<head>
<title>로그인 여부 검사</title>
<body>
	<%
	if (login) {
	%>
		아이디 "<%= memberId %>"로 로그인한 상태
	<%
	} else {
	%>
		로그인 하지 않은 상태
	<%
		}
	%>
</body>
</head>
</html>