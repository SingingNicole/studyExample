<%@ page contentType="text/xml; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String user_id = request.getParameter("user_id");
	//form이 없다면 null
	//form은 있지만 입력하지 않았으면 ""
	//System.out.println("user_id: "+user_id);	
	if (user_id == null) {
		user_id = "";
	} // user_id가 null이라면 nullpointerException이 발생할 수 있어 null값이라면 빈 문자열로 변경한다.
	
	// 데이터베이스 연동을 통한 아이디 중복검사 결과를 얻어오는 과정에 대한 가정
	boolean result = false;
	if (user_id.equals("jquery")) { 
		result = true;
	}
%>
<?xml version='1.0' encoding='UTF-8'?>
<id_check>
	<result><%=result%></result>
</id_check>