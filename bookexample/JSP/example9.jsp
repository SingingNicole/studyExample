<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>덧셈</title>
</head>
<body>
	<h3>선언문으로 구현한 덧셈</h3>
	<%! // 실행과 관련 없이 메서드를 선언하는 부분이다.
		public int sum(int a, int b) {
		return a + b;
	}
	%>
	덧셈의 결과: <%= this.sum(20,30) %>
	<!-- 앞에서 선언한 sum 메서드를 호출하여 반환한 값을 출력 -->
</body>
</html>