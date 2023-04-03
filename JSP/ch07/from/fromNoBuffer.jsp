<%@ page buffer="none" contentType = "text/html; charset=utf-8" %>
<%--
	버퍼가 없을 경우 <jsp:forward> 액션 태그가
	올바르게 실행되지 않는다. => java.lang.IllegalStateException 발생
	버퍼가 0일 때 clear() 호출 불가.
--%>
<html>
<head>
<title>fromNoBuffer.jsp의 제목</title>
</head>
<body>
	이 페이지는 fromNoBuffer.jsp가 생성한 것입니다.
	<jsp:forward page="../to/to.jsp" />
</body>
</html>
