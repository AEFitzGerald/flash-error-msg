<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html">
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/main.css">
	<title>Secret Message</title>
	
</head>
<body>
	<h1>You must train harder!</h1>
	<h2>What is the Code?</h2>
	<p><c:out value = "${error}"/></p>
		<form action="/submit" method="post">
			<div>
				<input type="text" name ="secretCode">
			</div>
			<div>
				<input type="submit" value="Try Code">
			</div>
		</form>
</body>
</html>