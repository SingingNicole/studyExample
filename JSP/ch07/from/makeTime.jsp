<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.Calendar" %>
<%
	Calendar cal = Calendar.getInstance();
	request.setAttribute("time", cal);
	// String이 아니기때문에 Parameter를 사용할 수 없다.
%>
<jsp:forward page="../to/viewTime.jsp" />
<%-- forward 액션태그 뒤에는 무엇을 적어도 인식되지 않는다.
	 viewTime을 실행시키면 NullPointerException이 발생하므로 makeTime으로 현재 시간을 생성해야 한다. --%>