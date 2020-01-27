<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>BillDesk Reconciliation</title>
<style>
#container {
	margin-top: 10px;
	margin-left: 10px;
	margin-right: 10px;
	background: #e5e9ea;
	font-family: "Palatino", serif;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.tableFixHead {
	overflow-y: auto;
	height: 450px;
}

.tableFixHead table {
	border-collapse: collapse;
	width: 100%;
}

.tableFixHead th, .tableFixHead td {
	padding: 8px 16px;
}

.tableFixHead th {
	position: sticky;
	top: 0;
	background: #eee;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png"
	href="resources/images/apepdclicon.ico" />
</head>
<body id="container" class="container-fluid" style="color: navy;">
	<div>
		<h4 align="center">APEPDCL</h4>
		<h1 align="center">BillDesk Reconciliation</h1>
		<div id="drop-area">
			<form method="POST" action="/billdesk-reconcilation/upload"
				enctype="multipart/form-data">
				<div class="file-upload-wrapper" align="center">
					<span><input type="file" name="file" id="input-file-now"
						required="required" class="file-upload" placeholder="Drag & Drop"
						style="width: 650px; height: 110px; border: dotted" /></span><br />
				</div>
				<div align="center">
					<input type="submit" value="Submit" class="button btn-primary" />
				</div>
			</form>
		</div>
		<div>
			<c:if test="${not empty message}">
				Upload Status Message : ${message}
					<div class="table-responsive tableFixHead">
					<table class="table table-stripped">
						<thead class="table-dark">
							<tr>
								<th>Reference Response</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${list}">
								<c:if test="${not empty item}">
									<c:set var="dateParts" value="${fn:split(item, '::')}" />
									<c:if test="${dateParts[1] eq 'Failure'}">
									<tr  bgcolor="#fc767b">
										<td>${dateParts[0]}</td>
										<td>${dateParts[1]}</td>
									</tr>
									</c:if>
									<c:if test="${dateParts[1] eq 'Success'}">
									<tr  bgcolor="#80BE0F">
										<td>${dateParts[0]}</td>
										<td>${dateParts[1]}</td>
									</tr>
									</c:if>
								</c:if>
							</c:forEach>
						</tbody>

					</table>
				</div>
			</c:if>
		</div>
	</div>
	<p align='center'>&#169; Phoenix Publishing, 2020</p>
</body>
</html>