<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>부서 정보 업데이트</title>
</head>
<body>
	${ deptno }번 부서의 정보를 수정합니다.
	<hr>
	<form method="post" action="/update">
		<input type="hidden" name="_method" value="put"/>
		<input type="hidden" name="deptno" value="${ deptno }">
		부서명: <input type="text" name="dname"/><br/>
		근무지: <input type="text" name="loc"/>
		<input type="submit"/>
	</form>
</body>
</html>