<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>spring 시작!!</title>
</head>
<body>
${ hello }
<c:if test="true">
	<p>jstl test</p>
</c:if>
<h4>구구단: 4단</h4>
<ul>
	<c:forEach var="i" begin="1" end="9">
		<li>4 * ${ i } = ${ 4 * i }
	</c:forEach>
</ul>
</body>
</html>