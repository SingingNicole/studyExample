<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>고객명으로 주문 검색</title>
</head>
<body>
	<h2>고객명으로 주문을 검색합니다.</h2>
	<form action="/book/nameresult" method="post">
		<input type="text" name="name"/>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>