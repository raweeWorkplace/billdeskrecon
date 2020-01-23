<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty message}">
		<h1>Upload Status</h1>
		<h2>Message : ${message}</h2>
	</c:if>
	<form method="POST" action="/billdesk-reconcilation/upload"
		enctype="multipart/form-data">
		<input type="file" name="file" required="required" /> <br /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>