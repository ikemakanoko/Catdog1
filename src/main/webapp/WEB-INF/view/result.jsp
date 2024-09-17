<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>結果発表</title>
<link rel="stylesheet" href="">

</head>
<body>
	<h1 style="text-align: center">結果発表</h1>
	<c:forEach items="${catdogList}" var="member">
		<tr>
			<td><c:out value="${catdog.id}" /></td>
			<td><c:out value="${catdog.animal}" />です。</td>
		</tr>
	</c:forEach>
</html>