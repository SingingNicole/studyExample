<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>application 속성 보기</title>
</head>
<body>
<%
	Enumeration<String> attrName = application.getAttributeNames();
	while (attrName.hasMoreElements()) {
		String name = attrName.nextElement();
		Object value = application.getAttribute(name);
		out.print(name + " = " + value + "<br>");
	}
%>
</body>
</html>