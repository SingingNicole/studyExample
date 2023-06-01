<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import = "ch03.day0331.Calc" %>
<%!
	public int sum(int start, int end) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += i;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>1에서 10까지의 합</title>
</head>
<body>
<%
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}
	// System.out.println("sum: " + sum) => 이클립스 콘솔창에 출력된다.
			// 클라이언트는 해당 내용을 볼 수 없다.
%>
<% Calc c = new Calc(); %>
1~10까지의 합1: <%= sum %> <br>
1~10까지의 합2: <%= 1 + 2 + 3 + 4 + 5 + 6 +7 + 8 + 9 + 10 %> <br>
1~10까지의 합3: <%= sum(1, 10) %> <br>
1~10까지의 합4: <%= c.sum(1, 10) %> <br>
</body>
</html>