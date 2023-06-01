<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>고객 정보 조회</title>
</head>
<body>
	<h2>현재 고객의 정보를 출력합니다.</h2>
	<ul>
		<c:forEach var="cust" items="${ custList }">
			<li>
				고객명: ${ cust.name } / 주소: ${ cust.address } / 전화번호: ${ cust.phone }
			</li>
		</c:forEach>
	</ul>
</body>
</html>