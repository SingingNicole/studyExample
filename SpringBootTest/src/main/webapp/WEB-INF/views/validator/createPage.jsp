<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>createPage</title>
</head>
<body>
	<form:form action="/valid/create"> <!-- 기본값이 post이다. -->
	<!-- modelattribute 태그로 별칭 지정 가능. -->
		작성자: <input name="writer"/>
			<form:errors path="writer" element="div"/> <!-- writer 필드에 에러 발생 시 해당 에러 출력 -->
			<!-- 혹은 delimiter 태그로 구분자를 지정할 수도 있다. -->
		<br/>
		내용: <textarea rows="5" cols="30" name="content"></textarea>
			<form:errors path="content" element="div"/>
		<br/>
		<input type="submit"/>
	</form:form>
</body>
</html>