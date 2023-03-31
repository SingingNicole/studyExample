<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<title>index</title>
</head>
<body>
	<h3>index.jsp 파일은 경로 없이 요청할 수 있는 welcome file 입니다.</h3>
	<% Date now = new Date(); %>
	<p>현재 시간: <%= now %> </p>
</body>
</html>