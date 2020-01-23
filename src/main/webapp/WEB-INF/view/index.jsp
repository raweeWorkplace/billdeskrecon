<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Bill desk Reconcilation</title>
<style>
#container {
	margin-top: 100px; margin-left : 50px;
	margin-right: 50px;
	background: #ffbb99;
	font-family: "Palatino", serif;
	margin-left: 50px;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body style="color: navy;">
	<div id="container" class="container-fluid">
		<h4 align="center">APEPDCL</h4>
		<h1 align="center">Bill desk Reconcilation</h1>
		<c:if test="${not empty message}">
			<h1>Upload Status</h1>
			<h2>Message : ${message}</h2>
		</c:if>
		<div id="drop-area">
			<form method="POST" action="/billdesk-reconcilation/upload"
				enctype="multipart/form-data">
				<div class="file-upload-wrapper" align="center">
					<span><input type="file" name="file" id="input-file-now"
						class="file-upload"
						style="width: 250px; height: 250px; border: dotted" /></span><br />
				</div>
				<div align="center">
					<input type="submit" value="Submit" />
				</div>
			</form>
		</div>
	</div>
	<p align='center'>&#169; Phoenix Publishing, 2020</p>
</body>
</html>