<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>成員</title>
</head>
<style>
img{
	width:200px
}

</style>
<body >
<div align="center">


  <c:forEach var="holo" items="${holoBeans}"  varStatus="id">
		<div>  ID： <input type="text" name="memberid" value="${holo.memberid }"> </div>
		<div> 名稱：<input type="text" name="membername" value="${holo.membername }"> </div>
		<div> 圖片：<img src="${holo.memberpicture }"> </div>
		<div> 介紹：<div>${holo.memberdata }</div></div>
		<div> 歸屬：<input type="text" name="memberfrom" value="${holo.memberfrom }"> </div>
		<br>
		<br>
		<br>
 </c:forEach>

</div>
</body>
</html>