<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>제출 양식</title>
</head>
<body>
	<form method="post"> <!-- post 방식으로 전송해야 @PostMapping으로 사용 가능 -->
		이름: <input type="text" name="name"/><br/>
		나이: <input type="text" name="age"/><br/>
		좋아하는 동물:
			<ul>
				<li><input type="checkbox" name="animal" value="고양이"> 고양이</li>
				<li><input type="checkbox" name="animal" value="강아지"> 강아지</li>
				<li><input type="checkbox" name="animal" value="토끼"> 토끼</li>
				<!-- value 값이 전달된다는 것을 잊지 말자. -->
			</ul>
		<input type="submit"/>
	</form>
</body>
</html>