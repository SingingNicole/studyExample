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
	<a href="simple">simple</a><br>
	<a href="simple?type=greeting">simple_greeting</a><br>
	<a href="simple?type=date">simple_date</a><br>
	<a href="simple?type=test">simple_test</a><br>
	<a href="ControllerUsingFile?cmd=hello">model_hello</a><br>
	<a href="hello.do">hello.do</a><br>
	<a href="a.do">점심 메뉴 선택</a><br>
	<a href="inputForm.do">회원 가입</a><br>
</body>
</html>