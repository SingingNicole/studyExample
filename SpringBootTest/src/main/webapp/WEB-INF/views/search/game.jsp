<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>게임 검색 결과</title>
</head>
<body>
	인기 키워드:
	<c:forEach var="popularQuery" items="${ popularQueryList }">
		${ popularQuery }
	</c:forEach>
	<form action="game">
		<select name="type">
			<c:forEach var="searchType" items="${ searchTypeList }">
				<option value="${ searchType.code }"
					<c:if test="${ command.type == searchType.code}">selected</c:if>>
					${ searchType.text }
				</option>
				<!-- 기존에 선택한 값과 같으면 해당 option 태그에 selected 속성을 부여한다. -->
			</c:forEach>
		</select>
		<!-- value에 모델이 가지고 있던 입력한 값을 그대로 출력하여 창이 바뀌어도 값이 유지된 것처럼 보이게 한다. -->
		<input type="text" name="query" value="${ command.query }"/> 
		<input type="submit" value="검색"/>
	</form>
	검색 결과: ${ searchResult }
</body>
</html>