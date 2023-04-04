<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="day0403.el.Member, java.util.*"%>
	<%
    	List<Member> memberList = Arrays.asList(
        	new Member("홍길동", 20), new Member("이순신", 54),
        	new Member("유관순", 19), new Member("왕건", 42) );
   	 	request.setAttribute("members", memberList);
	%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="mem" items="${ memberList }">
			<li>이름: ${ mem.name } 나이: $ {mem.age} </li>
		</c:forEach>
	</ul>
</body>
</html>