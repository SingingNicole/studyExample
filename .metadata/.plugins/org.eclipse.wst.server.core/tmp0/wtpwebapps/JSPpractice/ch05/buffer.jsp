<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page buffer="8kb" autoFlush="true"%>
<!-- 버퍼가 꽉 차지 않은 상태에서 eof를 만나도 자동으로 flush 처리한다. 
	 false를 붙여 특정 용량만 보낼 때 사용한다. -->
<!DOCTYPE html>
<html>
<head>
<title>autoFlush 예제</title>
</head>
<body>
	<div>
<% 
	for (int i = 0; i < 1000; i++) { %>
		<%= i %>
	<% } 
%>

<% 
	for (int i = 0; i < 1000; i++) {
		out.println(i); // out 기본 객체를 활용하여 출력할 수도 있다.
	}
%>
	</div>
</body>
</html>