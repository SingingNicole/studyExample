<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>form</title>
</head>
<body>
	post form
	<form method="post">
		<input name="name"/>
		<input type="submit"/>
	</form>
	put form
	<form method="post">
		<input type="hidden" name="_method" value="put"/>
		<!-- HiddenHttpMethodFilter를 통해 _method 이름으로 보내진 put을 방식으로 인식한다. -->
		<input name="name"/>
		<input type="submit"/>
	</form>
	delete form
	<form method="post">
		<input type="hidden" name="_method" value="delete"/>
		<!-- HiddenHttpMethodFilter를 통해 _method 이름으로 보내진 put을 방식으로 인식한다. -->
		<input name="name"/>
		<input type="submit"/>
	</form>
</body>
</html>