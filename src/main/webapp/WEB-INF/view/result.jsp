<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>結果発表</title>
<link rel="stylesheet" href="">

</head>
<body>
	<h1 style="text-align: center">結果発表</h1>
	<c:forEach items="${catdogList}" var="catdog"> 
	<h2><c:out value="${catdog.id}"/>です</h2>
	</c:forEach>
</body>
</html>