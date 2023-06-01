<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>names</title>
</head>
<body>
	[${ ename }]의 검색 결과입니다.
<c:if test="${ size == 0 }">
	검색 조건에 맞는 결과가 없습니다.
</c:if>
<c:if test="${ size != 0 }">
	검색 결과: ${ size }개<br/>
	<c:forEach items="${ names }" var="emp">
		${ emp.empno }번 / ${ emp.ename }사원은 ${ emp.dname }부서에 있습니다.
	</c:forEach>
</c:if>
</body>
</html>