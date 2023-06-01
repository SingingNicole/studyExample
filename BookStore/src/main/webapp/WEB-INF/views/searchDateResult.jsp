<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>기간별 주문 검색 결과</title>
</head>
<body>
	<h4>주문 검색 결과</h4>
	<ul>
		<c:forEach var="result" items="${ resultDate }">
			<li>주문자명: ${ result.name } / 책 이름: ${ result.bookname } / 주문일: ${ result.orderdate } / 구매 가격: ${ result.saleprice }</li>	
		</c:forEach>
	</ul>
</body>
</html>