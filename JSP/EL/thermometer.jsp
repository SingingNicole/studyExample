<%@ page import="day0403.el.Thermometer"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
	Thermometer thermometer = new Thermometer();
	request.setAttribute("t", thermometer); // t라는 이름으로 Thermometer 객체 저장
%>
<html>
<head>
<title>온도 변환 예제</title>
</head>
<body>
	${t.setCelsius('서울', 27.3)} <!-- 서울: key, value: 27.3, 리턴값 없음 -->
	서울 온도: 섭씨 ${t.getCelsius('서울')}도 / 화씨 ${t.getFahrenheit('서울')}
	<br/>
	정보: ${t.info} <!-- getInfo 메서드가 호출된다. -->
</body>
</html>