<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="">
</head>
<body>
	<h1>会員登録</h1>
	
	<c:if test="${!empty error }">
		<p><c:out value="${error }" /></p>
	</c:if>
	
	<form action="" method="post">
		<p>
			ログインID： <input type="text" name="id">
		</p>
		
		<p>パスワード：<input type="text" name="pass"></p>
		
		<p>
			<input type="submit" value="登録">
		</p>

	</form>

	<p>
	<a href="register">会員登録</a>
	</p>






	<script></script>
</body>
</html>