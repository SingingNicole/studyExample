<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>application</title>
</head>
<body>
	서버명: <%= application.getServerInfo() %> <br> <!-- 현재 사용하고 있는 서버의 정보를 추출한다. -->
	서블릿 버전: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
	<!-- 현재 지원하고 있는 서블릿의 Major, Minor 버전을 추출한다. -->
	<h3>/edu 리스트</h3>
	<%
		java.util.Set<String> list = application.getResourcePaths("/"); // 인자로 지정한 디렉터리의 목록을 반환한다.
		if (list != null) { // 메서드에서 반환된 값이 있으면 실행된다.
			Object[] obj = list.toArray(); // list 객체를 배열로 변환하여 반환한다.
			for (int i = 0; i < obj.length; i++) {
				out.print(obj[i] + "<br>"); // for문을 활용해 배열의 값을 출력한다.
			}
		}
	%>
</body>
</html>