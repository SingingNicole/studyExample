<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import="day0403.el.Member, java.util.*" %>
<html>
<head>
<title>EL min, max</title>
</head>
<body>
	${ vals = [20, 17, 30, 2, 9, 23] ; '' } <!-- el은 항상 후처리를 위한 값을 적어야 한다.
												 빈 문자열('')은 아무 것도 하지 않겠다는 의미. -->
	${ vals.stream().min().get() }
	<hr>
	<%
    	List<Member> memberList = Arrays.asList(
        	new Member("홍길동", 20), new Member("이순신", 54),
        	new Member("유관순", 19), new Member("왕건", 42) );
   	 	request.setAttribute("members", memberList);
   	 	// 멤버 객체 4명 추가, 리스트로 묶어 둠.
   	 	// el에서 사용할 수 있도록 setAttribute 메서드 활용.
	%>
	${ maxAgeMemOpt = members.stream().max((m1, m2) -> m1.age.compareTo(m2.age)) ; ''}
	<!-- 람다식으로 메서드 오버라이딩, 객체 비교의 기준 정함. 나이 값을 비교(compareTo) -->
	${ maxAgeMemOpt.get().name } (${maxAgeMemOpt.get().age}세)
</body>
</html>
