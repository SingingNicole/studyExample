<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>책 정보 조회</title>
</head>
<body>
<%-- 	<h2>현재 책의 정보를 출력합니다.</h2>
	<ul>
		<c:forEach var="book" items="${ bookList }">
			<li>
				책 이름: ${ book.bookname } / 출판사: ${ book.publisher } / 가격: ${ book.price }원<br/>
			</li>
		</c:forEach>
	</ul> --%>
	<p>모든 책의 내용을 출력합니다.</p>
	<table>
		<tr><th>id</th><th>name</th><th>publisher</th><th>price</th></tr>
		<c:forEach var="book" items="${ bookList }">
			<tr><th>${ book.bookid }</th><th>${ book.bookname }</th><th>${ book.publisher }</th><th>${ book.price }원</th></tr>
		</c:forEach>
	</table>
</body>
</html>