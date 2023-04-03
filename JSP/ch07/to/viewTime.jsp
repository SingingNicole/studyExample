<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.Calendar" %>
<%-- 날짜값에서 일부만 출력하려면 Calendar 클래스를 활용한다. --%>
<html>
<head>
<title>현재 시간</title>
</head>
<body>
	<%
		Calendar cal = (Calendar) request.getAttribute("time");
		// 캘린더 클래스는 추상 클래스이기 때문에 new로 선언할 수 없다.
	%>
	현재 시간은 <%= cal.get(Calendar.HOUR) %>시
		 	<%= cal.get(Calendar.MINUTE) %>분
		 	<%= cal.get(Calendar.SECOND) %>초 입니다.
		 	<%-- object 객체는 get 메서드 등을 가지고 있지 않기 때문에 캘린더 클래스로 다운캐스팅한다. --%>
</body>
</html>
