<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>example11</title>
</head>
<body>
	<%
		int total = out.getBufferSize(); // 기본 버퍼의 크기를 추출한다.
		out.print("첫 번째 텍스트입니다.");
		out.clearBuffer(); // 버퍼에 있는 내용을 삭제한다.
		out.print("출력 버퍼의 크기: " + total);
		out.print("<br>사용되지 않은 버퍼의 크기: " + out.getRemaining()); // 버퍼의 남은 용량을 추출한다.
		out.flush(); // 버퍼에 있는 내용을 버퍼가 차 있는 것과 관계 없이 강제로 전송한다.
		out.print("<br>flush 후 버퍼의 크기: " + out.getRemaining());
	%>
	<hr>
	<h3>out.print()메서드</h3>
	<%
		out.print(100);
		out.print(true);
		out.print(3.14);
		out.print("test");
		out.print('가');
		out.print(new java.io.File("\\"));
		out.print("버퍼의 크기: " + out.getRemaining());
	%>
</body>
</html>