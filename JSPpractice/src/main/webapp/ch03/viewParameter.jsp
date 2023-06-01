<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title>요청 파라미터 출력</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %> <!-- 파라미터 값을 한글로 처리 -->
	<b> request.getParameter() 사용</b><br>
		name 파라미터 : <%= request.getParameter("name") %><br>
		address파라미터 : <%= request.getParameter("address") %><br>
	<p>
	<b> request.getParameterValues() 사용</b><br>
<%
	String[] pets = request.getParameterValues("pet");
	if(pets != null){
		for(String p : pets){
			//out.print(p+"<br>");	
			%><%= p %><br>
<%		
		}
	}
%>
	</p>
	<p>
	<b>request.getParameterNames()사용</b><br>
<%
	Enumeration<String> names = request.getParameterNames();
	
	while(names.hasMoreElements()){
		out.print(names.nextElement()+"<br>");
	}
%>
	</p>
	<p>
	<b>request.getParameterMap()사용</b><br>
<%
	Map<String, String[]> map = request.getParameterMap();
	String[] n = map.get("name");
	if(n != null){
		out.print("이름 : "+ n[0]);
	}

%>
	</p>
</body>
</html>