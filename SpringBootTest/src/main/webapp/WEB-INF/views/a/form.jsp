<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>좋아하는 동물은?</title>
</head>
<body>
	<h5>좋아하는 동물을 선택해 주세요</h5>
	<form method="post"> <!-- post 방식으로 전송해야 @PostMapping으로 사용 가능 -->
		<fieldset>
			이름: <input type="text" name="name"/><br/>
			나이: <input type="text" name="age"/><br/>
			생일: <input name="birth" placeholder="yyyyMMdd"/><br/>
			좋아하는 동물: 
			<ul>
				<li><input type="checkbox" name="favAnimal" value="고양이" id="cat"><label for="cat"> 고양이</label></li>
				<li><input type="checkbox" name="favAnimal" value="강아지"> 강아지</li>
				<li><input type="checkbox" name="favAnimal" value="토끼"> 토끼</li>					
				<!-- value 값이 전달된다는 것을 잊지 말자. -->
			</ul>
		<input type="submit"/>
		</fieldset>
	</form>
</body>
</html>