<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>게시글 입력 폼</title>
</head>
<body>
	게시글 쓰기 입력 폼
	<form method="post"> <!-- action 생략 -->
		<input type="hidden" name="id" value="10"/>
		<input type="hidden" name="id" value="11"/>
		<input type="hidden" name="id" value="12"/>
		<!-- 같은 이름으로 값 여러 개가 들어올 경우 배열로 저장된다. -->
		제목: <input name="title"/><br/>
		내용: <textarea name="content"></textarea><br/>
		<input type="submit"/>
	</form>
</body>
</html>