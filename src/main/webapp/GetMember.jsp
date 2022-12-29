<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<form action="GetMember" method="POST" enctype="multipart/form-data"> 
		<div>  ID： <input type="text" name="memberid" value="${holo.memberid }"> </div>
		<div> 名稱：<input type="text" name="membername" value="${holo.membername }"> </div>
		<div> 圖片：<img src="${holo.memberpicture }"> </div>
		<div> 介紹：<div>${holo.memberdata }</div></div>
		<div> 歸屬：<input type="text" name="memberfrom" value="${holo.memberfrom }"> </div>
</form>

</div>
</body>
</html>