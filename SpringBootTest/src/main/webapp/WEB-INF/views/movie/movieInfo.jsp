<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>영화 정보</title>
</head>
<body>
	${ movieInfo.movieInfoResult.movieInfo.movieNm }<br>
	<ul>
		<c:forEach items="${ movieInfo.movieInfoResult.movieInfo.actors }" var="actor">
			<li>${ actor.cast }역: ${ actor.peopleNm }</li>
		</c:forEach>
	</ul>
</body>
</html>