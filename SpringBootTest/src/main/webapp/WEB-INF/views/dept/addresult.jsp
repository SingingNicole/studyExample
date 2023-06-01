<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>추가 부서 결과</title>
</head>
<body>
	<c:if test="${ msg != null }">
		${ msg }
	</c:if>
	<c:if test="${ msg == null }">
		${ dept.dname }(${ dept.deptno }) 부서가 추가되었습니다.
	</c:if>
</body>
</html>