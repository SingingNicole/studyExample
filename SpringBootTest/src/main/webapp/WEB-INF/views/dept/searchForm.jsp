<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>부서명 검색</title>
</head>
<body>
	검색할 부서명을 입력하세요.
	<form method="post" onsubmit="return validate()">
	<!-- onsubmit의 경우 return과 함께 메서드명을 적는다. -->
		<input type="search" name="dname"/>
		<input type="submit" value="검색"/>
	</form>
	<script type="text/javascript">
		function validate() {
			if (!document.forms[0].dname.value) {
				alert("검색어를 입력하세요.")
				return false;
			}
		}
	</script>
</body>
</html>