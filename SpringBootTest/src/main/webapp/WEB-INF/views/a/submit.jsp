<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>입력 결과</title>
</head>
<body>
	<h3>제출 정보</h3>
	이름: ${ pinfo.name }<br/>
	나이: ${ pinfo.age }<br/>
	생일: <fmt:formatDate value="${ pinfo.birth }" pattern="yyyy년 MM월 dd일"/><br/>
	좋아하는 동물: 
		<ul>
			<c:forEach var="item" items="${ pinfo.favAnimal }">
				<li>${ item }</li>
				<!-- animal 리스트에는 string 제네릭 값이 저장되었으므로 item으로 출력. -->
			</c:forEach>
		</ul>
</body>
</html>