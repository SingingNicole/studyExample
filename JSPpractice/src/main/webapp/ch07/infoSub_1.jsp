<%@ page contentType="text/html; charset=UTF-8"%>

<%
	String type = request.getParameter("type");

	if (type == null) {
		return;
	}
	// 요청 파라미터는 항상 String 타입으로 저장된다.
%>
<br>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>타입</td>
		<td><b><%= type %></b></td>
	</tr>
	<tr>
		<td>특징</td>
		<td>
		<% if (type.equals("A")) { %>
			 강한 내구성.
		<% } else if (type.equals("B")) { %>
			 뛰어난 대처 능력.
		<% } %>
		</td>
		<!-- 보낸 파라미터 값에 따라 달라진다. -->
	</tr>
</table>