<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>전송</title>
</head>
<body>
	<h3>제출 내역</h3>
	이름: ${ pinfo.name }<br/>
	나이: ${ pinfo.age }<br/>
	좋아하는 동물: 
		<ul>
			<c:forEach var="item" items="${ pinfo.animal }">
				<li>${ item }</li>
				<!-- animal 리스트에는 변수가 존재하지 않으므로 item으로 출력. -->
			</c:forEach>
		</ul>
</body>
</html>