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
	<h1>サイト名</h1>
	<h1 style="text-align: center">ログイン</h1>
	
	<c:if test="${!empty error }">
		<p><c:out value="${error }" /></p>
	</c:if>
	
	<form action="" method="post">
		<p style="text-align: center">
			ログインID： <input type="text" name="id">
		</p>
		
		<!-- 開発用にtext 公開時にはpasswordに変更 -->
		<p style="text-align: center">パスワード：<input type="text" name="pass"></p>
		
		<p style="text-align: center">
			<input type="submit" value="ログイン">
		</p>

	</form>

	<p style="text-align: center">
	<a href="register">会員登録</a>
	</p>

	<script></script>
</body>
</html>