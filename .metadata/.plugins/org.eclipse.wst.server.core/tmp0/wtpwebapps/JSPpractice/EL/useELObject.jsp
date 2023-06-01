<%@ page contentType = "text/html; charset=utf-8" %>
<%--<%@ page isELIgnored="true" %>: el 기호 무시 --%>
<%
request.setAttribute("name", "su");
session.setAttribute("name", "javakim");
%>
<html>
<head>
<title>EL Object</title>
</head>
<body>
	${name}<br> <!-- 속성에 이름만 적었을 때는 가장 작은 영역의 이름이 출력된다. => request의 name 출력 -->
	<%-- <%= request.getAttribute("name") %>과 같은 역할을 한다. --%>
	${sessionScope.name}<br> <!-- session에 저장된 이름을 반환하기로 명시. -->
	<!-- 여러 영역에 같은 이름으로 저장된 객체들이 있을 경우 가장 작은 영역이 우선권을 가진다.
		 특정 영역의 객체를 반환하고 싶을 때는 Scope로 명시해 두어야 한다. -->
	요청 URI: ${pageContext.request.requestURI}<br> <!-- pageContext: 일반 객체이므로 뒤의 변수의 getter를 호출한다.
				=> getRequest() 메서드가 호출됨.
				=> request객체가 가지고 있는 getRequestURI() 메서드가 호출된다.
					:URI 경로 반환
				! 변수명을 사용하고 있지만 항상 메서드를 호출한다. -->
	request의 name 속성: ${requestScope.name}<br>
	code 파라미터: ${param.code} <!-- 이름이 code인 파라미터가 존재하지 않아 null 값이며, 빈 문자열로 출력된다. -->
	<%-- <%= request.getParameter("code") %>와 같은 역할을 한다. --%>
</body>
</html>
<!-- 일반적으로는 이름이 겹치지 않기 때문에 Scope를 잘 사용하지는 않는다. -->