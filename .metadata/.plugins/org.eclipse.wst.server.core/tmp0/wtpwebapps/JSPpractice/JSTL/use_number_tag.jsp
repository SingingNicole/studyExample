<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>numberFormat 태그 사용</title>
</head>
<body>
	<c:set var="price" value="10000"/>
	<fmt:formatNumber value="${ price }" type="number" var="numberType"/>
	통화: <fmt:formatNumber value="${ price }"
				type="currency" currencySymbol="\\"/> <!-- currencySymbol: 통화 단위 추가 -->
	<br/>
	퍼센트: <fmt:formatNumber value="${ price }"
				type="percent" groupingUsed="false"/>
				<!-- groupingUsed: 세 자리마다 ,로 자릿수 구분. -->
	<br/>
	숫자: ${ numberType }
	<br/>
	패턴: <fmt:formatNumber value="${ price }" pattern="00000000.00"/>
</body>
</html>
