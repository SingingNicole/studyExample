<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLDecoder" %>
<html>
<head>
<title>쿠키 목록</title>
</head>
<body>
	쿠키 목록<br>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (int i = 0 ; i < cookies.length ; i++) {
	%>
		<%= cookies[i].getName() %> = 
		<%= URLDecoder.decode(cookies[i].getValue(), "utf-8") %><br>
	<%
			}
		} else {
	%>
	쿠키가 존재하지 않습니다.
	<%
		}
	%>
	<!-- cookie의 id는 세션의 id와 같다. -->
</body>
</html>
