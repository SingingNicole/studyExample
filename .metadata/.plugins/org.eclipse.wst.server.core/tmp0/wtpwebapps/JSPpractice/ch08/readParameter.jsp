<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page errorPage = "error/viewErrorMessage.jsp" %>
<!-- 해당 문서에만 적용되는 errorPage -->
<!DOCTYPE html>
<html>
<head>
<title>파라미터 출력</title>
</head>
<body>
	name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>
</body>
</html>