<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>기간별 주문 검색</title>
</head>
<body>
	<h2>주문 기간별로 주문을 검색합니다.</h2>
	<form method="post" action="/book/dateresult">
		<h4>주문 기간을 입력해 주세요.</h4>
		<input name="searchStart" type="date" value="2014-07-01"/> - <input name="searchEnd" type="date"/>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>