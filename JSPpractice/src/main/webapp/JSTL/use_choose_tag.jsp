<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>choose 태그</title>
</head>
<body>
	<ul>
		<c:choose>
  			<c:when test="${param.name == 'bk'}" >
    		<li> 당신의 이름은 ${param.name} 입니다.
  			</c:when>
  			<c:when test="${param.age > 20}" >
    		<li> 당신은 20세 이상입니다.
  			</c:when>
  			<c:otherwise> <!-- 모든 조건이 false일 때 수행된다. -->
    		<li> 당신은 'bk'가 아니고 20세 이상이 아닙니다.
  			</c:otherwise>
		</c:choose>
	</ul>
	<!-- choose의 경우 가장 먼저 해당하는 하나만 실행하고 반복문을 종료한다. -->
</body>
</html>
