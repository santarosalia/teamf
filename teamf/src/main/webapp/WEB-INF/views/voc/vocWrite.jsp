<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>voc write</title>
<link rel="stylesheet" href="/resources/css/bootstrap.css">
</head>
<body>
	<div class="container" >
	<div class="row" >
	<div class="col-md-1"></div>
	<div class="col-md-10" >
	<form action="/vocWrite.do" method="post">
	클레임 번호 : <input name="claimNo" type="text"><br><br>
	귀책 당사자 : <input name="vocWho" type="text">
	<br><br>
	귀책 내용 : <input name="vocContent" type="text"><br><br>
	패널티 내용 : <input name="vocPenalty" type="text"><br><br>
	<input type="submit" value="작성">
	</form></div>
	<div class="col-md-1"></div>
	</div>
	
	</div>
	
</body>
<script>

</script>
</html>