<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>成員</title></head>
<body style="background-color:#fdf5e6">
<div align="center">
<h2>新增成功</h2>
<jsp:useBean id="Holo" scope="request" class="com.lcpan.bean.HoloBean" />
<table>

<tr><td>ID
<td><input type="text" disabled value="<%=request.getParameter("memberid")%>">
<tr><td>圖片<td><input type="text" disabled value="<%=request.getParameter("memberpicture")%>">
<tr><td>名稱<td><input type="text" disabled value="<%=request.getParameter("membername")%>">
<tr><td>基本資料<td><input type="text" disabled value="<%=request.getParameter("memberdata")%>">
<tr><td>歸屬<td><input type="text" disabled value="<%=request.getParameter("memberfrom")%>">

</table>
</div>
</body>
</html>