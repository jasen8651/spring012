<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

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
			<input type="submit" value="login" />
		</p>
	</form>
</body>
</html>