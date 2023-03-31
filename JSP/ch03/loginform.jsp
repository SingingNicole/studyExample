<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>login form</title>
</head>
<body>
	<form action="login.jsp" method="post">
		<label for="memberId">아이디: </label>
		<input id="memberId" name="memberId"><br>
		<label for="memberPw">비밀번호: </label>
		<input type="password" id="memberPw" name="memberPw"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>