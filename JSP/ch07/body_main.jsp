<%@ page contentType = "text/html; charset=utf-8" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<html>
<head><title>INFO</title></head>
<body>
	include 전 name 파라미터 값: <%= request.getParameter("name") %>
	<hr>
	<jsp:include page="body_sub.jsp" flush="false">
		<jsp:param name="name" value="최범균" />
	</jsp:include>
	<!-- param action 태그로 보낸 값은 해당 태그 안에서만 사용 가능하다. -->
	<hr/>
	include 후 name 파라미터 값: <%= request.getParameter("name") %>
</body>
</html>