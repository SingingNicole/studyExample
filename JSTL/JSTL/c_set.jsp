<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="day0403.el.Member"%>
<%@ page import="java.util.*"%>
<% Member m = new Member("김자바", 10);
   Map<String, String> pref = new HashMap<>(); %>
<!DOCTYPE html>
<html>
<head>
<title>c set 예제</title>
</head>
<body>
	<c:set var="mem" value="<%= m %>"/>
	<c:set target="${mem}" property="name" value="su"/>
	${ mem.name } <br>
	<c:set var="pre" value="<%= pref %>"/>
	<c:set var="favoriteColor" value="#{pre.color}"/>
	좋아하는 색: ${favoriteColor}<br>
	<c:set target="${pre}" property="color" value="red"/>
	좋아하는 색2: ${favoriteColor}<br> <!-- 매핑된 값을 꺼내온다 -->
</body>
</html>