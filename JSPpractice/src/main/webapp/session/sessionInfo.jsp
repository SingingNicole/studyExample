<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page session = "true" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%
	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<html>
<head>
<title>세션정보</title>
</head>
<body>
	세션ID: <%= session.getId() %> <br> <!-- 세션의 id값을 구할 수 있다. -->
	<%
		time.setTime(session.getCreationTime()); // long 타입: 밀리세컨드로 시간을 가져왔다.
	%>
	세션생성시간: <%= formatter.format(time) %> <br> <!-- 밀리세컨드 시간을 date로 변환. -->
	<%
		time.setTime(session.getLastAccessedTime()); // 마지막 접속 시간을 구한 후 밀리세컨드 타임을 date 객체로 변환
	%>
	최근접근시간: <%= formatter.format(time) %> <!-- format 메서드로 시간값 출력 -->

</body>
</html>
