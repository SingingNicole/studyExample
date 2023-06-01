<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인 화면</title>
</head>
<body>
	<h3>로그인 화면입니다.</h3>
	<form:form action="login" method="get" modelAttribute="loginDto">
		<form:errors element="div"/>
		<label for="userid">id: </label><input name="userid" id="userid"><form:errors path="userid" delimiter=" "/><br>
		<label for="password">pw: </label><input type="password" name="password" id="password"/><form:errors path="password" delimiter=" "/><br>
		<input type="submit" value="로그인">
	</form:form>
</body>
</html>