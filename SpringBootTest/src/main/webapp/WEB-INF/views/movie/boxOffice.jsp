<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>boxOffice</title>
</head>
<body>
	<c:forEach items="${ boxOfficeList.boxOfficeResult.dailyBoxOfficeList }"
	var="movie">
		${ movie.rank }위: <a href="movieinfo?movieCd=${ movie.movieCd }">${ movie.movieNm }</a><br>
	</c:forEach>
</body>
</html>