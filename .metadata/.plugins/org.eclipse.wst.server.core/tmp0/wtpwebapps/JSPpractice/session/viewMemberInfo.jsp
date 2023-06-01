<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head>
<title>세션 정보 조회</title>
</head>
<body>
	MEMBERID = <%= session.getAttribute("MEMBERID") %><br/>
	NAME = <%= session.getAttribute("NAME") %>
	<!-- 세션의 정보는 set, get으로 설정하고 가져 온다. -->
</body>
</html>
