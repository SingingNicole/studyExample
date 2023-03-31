<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>폼 생성</title>
</head>
<body>
	<form action="viewParameter.jsp" method="post">
	<!-- post 방식으로 전송한 후 action에 지정한 페이지 실행 -->
		이름: <input name="name" size="10"><br>
		주소: <input name="address" size="30"><br>
		좋아하는 동물:
			<input type="checkbox" name="pet" value="dog"> 강아지
			<input type="checkbox" name="pet" value="cat"> 고양이
			<input type="checkbox" name="pet" value="pig"> 돼지
			<input type="submit" value="전송">
	</form>
	<a href="viewParameter.jsp?name=kim&address=서울시&pet=rabbit">
		파라미터를 링크로 보내기
	</a>
</body>
</html>