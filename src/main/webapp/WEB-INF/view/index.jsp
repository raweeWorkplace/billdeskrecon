<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:if test="${not empty message}">
		<h1>Upload Status</h1>
		<h2>Message : ${message}</h2>
	</c:if>
	<div id="drop-area">
		<form method="POST" action="/billdesk-reconcilation/upload"
			enctype="multipart/form-data">
			<div class="file-upload-wrapper" data-height="500" >
				<input type="file" name="file" id="input-file-max-fs" class="file-upload" data-max-file-size="2M"/><br />
			</div>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>