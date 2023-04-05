<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
</head>
<body>
	<form action="input.do" method="post" name="form1" onsubmit="return validate()">
		<fieldset>
			<legend>회원 가입</legend>
			아이디: <input type="text" name="id"/><br/>
			비밀번호: <input type="password" name="pw"/><br/>
			비밀번호 확인: <input type="password" name="pwCheck"/><br/>
			우편번호: <input type="number" name="zonecode" id="zonecode" readonly onclick="getZoneCode()"/><br/>
			주소: <input type="text" name="address" id="address" size="50"/><br/>
		</fieldset>
		<input type="submit" value="확인">
	</form>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
		function getZoneCode(){
			new daum.Postcode({
	        	oncomplete: function(data) {
	           	let addr = '';
	            if (data.userSelectedType === 'R') { // userSelectType: 검색 결과에서 사용자가 선택한 주소의 타입
	            	// R: 도로명주소, J: 지번주소
	            	addr = data.roadAddress; // 도로명주소
	            } else {
	            	addr = data.jibunAddress; // 지번주소
	            }
	            // 사용자가 선택한 도로명주소/지번주소 값을 저장하여 addr에 저장.
	           		document.getElementById("zonecode").value = data.zonecode;
	            	document.getElementById("address").value = addr; // 사용자가 선택한 값에 맞추어 주소 출력
	        	}
			}).open();
		}

		function validate(){
			let form = document.form1;
			if (!form.id.value) {
				alert("아이디를 입력해 주세요.");
				return false;
			}
			
			if (!form.pw.value) {
				alert("비밀번호를 입력해 주세요.");
				return false;
			}
			
			if (form.pw.value != form.pwCheck.value) {
				alert("비밀번호가 일치하지 않습니다.");
				return false;
			}
		}
	</script>
</body>
</html>