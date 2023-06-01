<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title>globalError</title>
</head>
<body>
	<h1><font color="orange">Exception 발생!</font></h1>
	<a href="/">index로 이동</a>
	<table>
		<tr>
			<th bgcolor="orange" align="left">예외 메세지: [[${ exception.message }]]</th>
		</tr>
	</table>
</body>
</html>