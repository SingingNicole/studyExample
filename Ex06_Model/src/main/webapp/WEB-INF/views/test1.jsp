<%@ page contentType="text/html; charset=UTF-8" %>]
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>test1</title>
</head>
<body>
<%
	out.println("Model: Hello World");
%>
	<br/>
	당신의 이름은 ${ name }입니다.
</body>
</html>