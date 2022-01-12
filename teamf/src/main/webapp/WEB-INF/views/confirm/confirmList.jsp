<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirmList</title>
<link rel="stylesheet" href="/resources/css/bootstrap.css">
</head>
<body>

<div class="container">

<div class="row">
<div class="col-md-1"> </div>
<div class="col-md-10"><a href="/index.jsp">메인</a><br>

 </div>
<div class="col-md-1"> </div>
</div>

<div class="row">
<div class="col-md-1"> </div>
<div class="col-md-10">

<table class="table table-hover">
<tr>
<td>패널티 번호</td>
<td>voc 번호</td>
<td>귀책 당사자</td>
<td>귀책 내용</td>
<td>금액</td>
<td>기사 확인 여부</td>
<td>이의제기 여부</td>
<td>이의제기</td>
</tr>
<c:forEach items="${list }" var="v">
<tr>
<td>${v.claimNo }</td>
<td>${v.vocNo }</td>
<td>${v.vocWho }</td>
<td>${v.vocContent }</td>
<td>${v.vocPenalty }</td>
<td>
<c:choose>
<c:when test="${v.vocConfirm eq 0 }" >
확인중
</c:when>
<c:otherwise>
확인 완료</c:otherwise>
</c:choose>
</td>
<td>
<c:choose>
<c:when test="${v.vocObject eq 0 }" >
확인중
</c:when>
<c:when test="${v.vocObject eq 1 }">
이의 없음
</c:when>
<c:otherwise>
이의 있음</c:otherwise>
</c:choose>


</td>
<td>

<form action="updateObject.do" method="post">
<input name="vocNo" type="hidden" value="${v.vocNo }">
<input name="x" type="hidden" value="1">
<input type="submit" value="이의없음">
</form>

<form action="updateObject.do" method="post">
<input name="vocNo" type="hidden" value="${v.vocNo }">
<input name="x" type="hidden" value="2">
<input type="submit" value="이의제기">
</form></td>
</tr>
</c:forEach>

</table> </div>
<div class="col-md-1"> </div>

</div>


</div>

</body>
</html>