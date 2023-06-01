<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
	div{
		float: left; /* 줄 바꿈 없이 컨텐츠들이 나열 */
		margin-right: 10px;
	}
</style>
<title>사원 정보 확인</title>
</head>
<body>
	<h4>부서와 사원을 선택하세요.</h4>
	<div>
		<select name="deptInfo" id="deptInfo">
			<option value="">부서 선택</option>
			<c:forEach var="dept" items="${ myDept }">
				<option value="${ dept.deptno }">${ dept.dname }</option>
			</c:forEach>
		</select>
	</div>
	<div id="second"></div>
	<div id="third"></div>
	<script src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(function() {
			$("#deptInfo").change(function() {	// id deptInfo에 change 발생할 경우 수행
				$("#second, #third").empty();

				if($(this).val() == "") {
					alert("부서를 선택하세요.");
					return false;
				}

				let deptno = $(this).val();

				$.ajax({
					  url: '/emps/' + deptno,
					  type: 'get',
					  dataType: 'json'
					  })
					  .done(function(response) {

						  let ops = "<select id='emps'>"

						  for (let i in response) {
							  ops += "<option value='" 
							  + response[i].empno + "'>"
							  + response[i].ename + "</option>"
						  }

						  ops += "</select>"

						  $("#second").append(ops);
					  });	// ajax end

			})	// change end

			$("#second").on("change", "#emps", function() {
				$("#third").empty();
				
				let empno = $(this).val();
				
				$.ajax({
					  url: '/emp/' + empno,
					  type: 'get',
					  dataType: 'json'
					  })
					  .done(function(response) {
						  
						  let emp = "사원 번호:" + response.empno + "<br/>";
						  emp += "사원 이름: " + response.ename + "<br/>";
						  emp += "직급: " + response.job + "<br/>";
						  
						  $("#third").append(emp);
					  });	// ajax end

			});	// emps change end

		});	// ready end
	</script>
</body>
</html>