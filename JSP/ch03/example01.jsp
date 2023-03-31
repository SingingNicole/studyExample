<%@ page contentType="text/html; charset=UTF-8" %>
<!-- charset을 변경(ex.iso-8859-1: 알파벳만 인코딩 가능)하면 페이지 인코딩에 문제가 생긴다. -->
<%@ page trimDirectiveWhitespaces="true" %>
<%-- jsp 주석: 현재 jsp 페이지에서만 보이며 xml, html 문서에서는 사용할 수 없다.
			  클라이언트 페이지에서 소스 코드를 확인하면 해당 주석은 보이지 않는다.
			  주석의 내용이 클라이언트에게 전송되지 않아 불필요한 데이터를 줄일 수 있다. --%>
<!DOCTYPE html>
<html>
<head>
<title>jsp 기본 예제 1</title>
</head>
<body>
	<p>현재 시간: <%= new java.util.Date() %></p>
	trimDirectiveWhitespaces 속성은 불필요한 빈 줄이나 빈 칸을 지워 줍니다.
</body>
</html>