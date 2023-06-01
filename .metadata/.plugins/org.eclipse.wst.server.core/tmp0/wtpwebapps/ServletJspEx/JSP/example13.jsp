<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>pageContext</title>
</head>
<body>
	<%!
		public void work(String p, PageContext pc) { // <%! ~ : 메서드 선언
		try {
			JspWriter out = pc.getOut();
			// out 메서드는 내장 객체이지만 _jspService() 메서드 안에서 선언된 지역 변수이기 때문에 스크립트릿, 스크립트식에서만 사용할 수 있다.
			// 다른 메서드에서 내장 객체를 사용할 때에는 PageContext 내장 객체를 활용해야 한다.
			if (p.equals("include")) { // p 값이 include일 경우
				out.print("-- include 전 -- <br>");
				pc.include("test.jsp"); // test.jsp 파일을 현재 문서에 삽입
				out.print("-- include gn -- <br>");
			} else if (p.equals("forward")) {
				pc.forward("test.jsp"); // test.jsp 파일로 이동
			}
		} catch (Exception e) {
			System.out.println("오류 발생!!");
			}
		}
	%>
	<%
		String p = request.getParameter("p"); // p값 추출
		this.work(p, pageContext); // work 메서드 호출, 인자값으로 쿼리 문자열 q의 값과 내장 객체 pageContext 값을 전달.
	%>
</body>
</html>