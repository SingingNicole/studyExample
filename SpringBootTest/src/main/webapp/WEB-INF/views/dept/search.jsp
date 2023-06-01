<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>부서명 검색 결과</title>
</head>
<body>
	<b>"${ searchValue }"</b>에 대한 부서 검색 결과입니다.<br/>
	<hr>
	<c:if test="${ size == 0 }">
		검색 조건에 맞는 결과가 없습니다.
	</c:if>
	<c:if test="${ size != 0 }">
		전체 검색 결과: ${ size }개<br/>
		<ul>
			<c:forEach items="${ result }" var="re"> <!-- var의 값과 items로 사용한 이름 값은 겹치지 않도록 함. -->
				<li>${ re.deptno } / ${ re.dname } / ${ re.loc }</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>