<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title>sqlError</title>
</head>
<body>
	<h1><font color="red">SQLException 발생!</font></h1>
	<a href="/">index 이동</a>
	<table>
		<tr>
			<th bgcolor="red" align="left">예외 메세지: [[${ exception.message }]]</th>
		</tr>
	</table>
</body>
</html>