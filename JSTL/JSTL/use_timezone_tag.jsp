<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>timeZone 태그 사용</title>
</head>
<body>
	<c:set var="now" value="<%= new java.util.Date() %>" /> <!-- 내가 있는 곳의 현재 시간 -->
	<fmt:formatDate value="${now}" type="both" 
		dateStyle="full" timeStyle="full" />
	<br>
	<fmt:timeZone value="Europe/London"> <!-- timezone 리스트에서 원하는 국가/도시를 입력하면 출력 가능 -->
	<fmt:formatDate value="${now}" type="both" 
		dateStyle="full" timeStyle="full"/>
	</fmt:timeZone>
</body>
</html>
