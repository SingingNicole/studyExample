<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>파라미터 출력</title>
</head>
<body>
	name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>
</body>
</html>

<!-- 500 상태코드 에러와 java.lang.NullPointerException 에러가 발생한다.
		errorPage -> exception type -> 상태 코드 순으로 우선 순위를 가짐. -->