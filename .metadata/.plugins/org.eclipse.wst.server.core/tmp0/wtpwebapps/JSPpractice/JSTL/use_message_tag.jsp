<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="en"/> <!-- 국제화 코드: 클라이언트의 사용 언어에 따라 달라진다. -->
<fmt:bundle basename="resource.message"> <!-- bundle 태그 사이에만 사용 가능 -->
	<fmt:message key="TITLE" var="title"/> <!-- 꺼내 온 값을 변수에 저장 -->
	<html>
	<head>
	<title>${title}</title> <!-- 변수가 가지고 있는 값을 해당 태그에 출력한다. -->
	</head>
	<body>
		<fmt:message key="GREETING"/> <!-- 저장하지 않고 바로 출력 -->
		<br>
		<c:if test="${! empty param.id}">
			<fmt:message key="VISITOR">
    			<fmt:param value="${param.id}"/>
			</fmt:message>
		</c:if>
	</body>
	</html>
</fmt:bundle>
