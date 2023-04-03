<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page buffer="2kb" %> <%-- 2kb가 넘어 배출됨. --%>
<html>
<head>
<title>fromBufferOF의 제목</title>
</head>
<body>
	<div>
	<% for (int i = 0 ; i < 512 ; i++) { %>
	<%= i %>
	<% } %>
	</div>
	<jsp:forward page="../to/to.jsp" />
</body>
</html>
<%--이미 플러시된 버퍼는 clear() 할 수 없음 => java.io.IOException 발생 --%>