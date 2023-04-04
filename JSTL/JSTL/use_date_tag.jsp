<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>formatDate 태그 사용</title>
</head>
<body>
	<c:set var="now" value="<%= new java.util.Date() %>"/>
	<fmt:formatDate value="${ now }" type="date" dateStyle="full"/><br>
	<fmt:formatDate value="${ now }" type="date" dateStyle="short"/><br>
	<fmt:formatDate value="${ now }" type="time"/><br> <!-- time 스타일의 기본값 -->
	<fmt:formatDate value="${ now }" type="both"
			dateStyle="full" timeStyle="full"/><br>
		<fmt:formatDate value="${now}" pattern="z a h:mm" /> <br> <!-- 날짜값을 직접 지정한 패턴으로 -->
</body>
</html>
