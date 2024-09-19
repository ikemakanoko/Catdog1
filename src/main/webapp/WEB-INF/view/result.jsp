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
	<h1>結果発表</h1>
	 
    <c:set var="animal" value="${param.animalName}" />
    <h2>${animal}です</h2>
	<!-- <h2><name="animal">です</h2> -->
</body>
</html>