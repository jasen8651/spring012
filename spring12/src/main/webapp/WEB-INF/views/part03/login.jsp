<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		let returnUrl = "${param.returnUrl}";
		if(returnUrl !="")
			alert(returnUrl + "요청페이지는 회원만 제공");
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="logpro.do" method="post">
		<p>
			<input type="text" name="id" placeholder="아이디 입력" />
		</p>
		<p>
			<input type="password" name="pass" placeholder="비밀번호 입력" />
		</p>
		<p>
			<input type="text" name="returnUrl" value="${param.returnUrl}">
			<input type="submit" value="login" />
		</p>
	</form>
</body>
</html>