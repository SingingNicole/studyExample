<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>업로드 결과</title>
</head>
<body>
	<c:if test="${ dto != null }">
		<h3>파일 업로드가 완료되었습니다.</h3>
		파일 번호: ${ dto.fileid }<br/>
		파일명: ${ dto.name }<br/>
		업로드 된 파일 이름: ${ dto.path }<br/>
		<img src="/mainImg/${ dto.path }" alt="test"/>
	</c:if>
	<c:if test="${ dto == null }">
		파일을 선택하지 않았습니다.<br/>
		<span onclick="history.go(-1)"
			style="text-decoration: underline;">다시 선택</span>
	</c:if>
</body>
</html>