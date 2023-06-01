<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>회원가입 폼</title>
</head>
<body>
	<h3>회원 가입을 환영합니다.</h3>
	<form action="insert" method="post" id="joinform">
		<table>
			<tr>
				<td>id</td>
				<td>
					<input name="id" id="id"/>
					<input type="button" id="id_check" value="중복 확인"/>
					<span id="id_msg"></span>
				</td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" id="name"/></td>
			</tr>
			<tr>
				<td>birth</td>
				<td><input type="text" name="birth" placeholder="yyyyMMdd"></td>
			</tr>
			<tr>
				<td>address</td>
				<td>
					<input type="text" name="address" id="address"/>
					<input type="button" id="addbtn" value="우편번호 검색" onclick="addPost()"/>
				</td>	
			</tr>
			<tr>
				<td>email</td>
				<td>
					<input name="email" id="email"/>
					<div id="emailresult"></div>
					<input type="button" id="mail_ck" value="메일 인증"/>
					<div id="input"><input id="ck_num"><input type="button" id="ck_b" value="인증 확인"/></div>
					<div id="result"></div>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="가입"/></td>
			</tr>
		</table>
	</form>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
		function addPost() {
			new daum.Postcode({
				oncomplete: function(data) {
					document.querySelector("#address").value = data.address;
					alert("나머지 주소도 입력하세요.");
				}
			}).open();
		}	// addPost end

		$(function() {
			$("#id_check").click(function() {
				let id = $("#id").val();

				if (!id) {
					$("#id_msg").html("아이디를 입력하세요.")
					return false;
				}	// if end

				$.ajax({url:"/idCheck", data:"id=" + id, datatype:"text"}
				).done(function(data) {	// checkid의 값 검사

					if (data == "") {	// null 데이터가 빈 문자열로 전달.
						$("#id_msg").html("사용할 수 있는 아이디입니다.");
						// 중복 검사를 통과했다면 value에 1 저장
						$("#id_msg").append("<input type='hidden' id='id_ck' value='1'/>");
					} else {
						$("#id_msg").html("이미 사용중인 아이디입니다.");
					}	// if end

				})	// ajax end

			})	// click end

			$("#joinform").submit(function() {
				if ($("#id_ck").val() != 1) {	// 중복 체크를 통과하지 못한 경우 수행
					$("#id_msg").html("아이디 중복 체크를 진행해 주세요.")
					return false;
				}

				if (!$("#password").val()) {
					alert("비밀번호를 입력해 주세요.");
					return false;
				}

			});	// submit end

			$("#mail_ck").click(function() {
				let email = $("#email").val();

				if(!email) {
					$("#result").css("display", "block").html("메일 주소를 입력하세요.");
					return false;
				}

				$.ajax({url:"/send",
						data:"emailAddress="+email,
						dataType:"json"}
				).done(function(data) {

					if (eval(data[1])) {
						num = data[0];
						alert("메일이 전송되었습니다. 인증번호를 입력하세요.")
						$("#input, #result").css("display", "block")
						
					}	// ajax end
				});	// done end

			})	// mail click end

			$("#ck_b").click(function() {
				let ck_num = $("#ck_num").val();

				if (ck_num == num) {
					$("#result").html("인증이 확인되었습니다.")
					$("#result").append("<input type='hidden' id='ck' value='1'/>")
				} else {
					$("#result").html("인증에 실패했습니다. 인증번호를 확인해 주세요.")
				}

			})	// ck_b click end

		}) // ready end
	</script>
</body>
</html>