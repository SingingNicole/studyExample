<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>부서 추가</title>
</head>
<body>
	부서를 추가합니다.
	<form method="post">
		부서 번호: <input name="deptno" value="${ newDeptno }" readonly/><br/>
		부서 이름: <input name="dname"/><br/>
		근무지: <input name="loc"/><br/>
		<input type="submit"/>
	</form>
</body>
</html>