<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>오늘의 점심은?</title>
</head>
<body>
	<form action="b.do">
		<fieldset>
			<legend>점심 메뉴 선택</legend>
			<c:forEach items="${ menu }" var="m">
				<input type="radio" name="lunch" value="${ m }"/> ${ m }
			</c:forEach>
			<input type="submit" value="전송">
		</fieldset>
	</form>
</body>
</html>