<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>員工資料</title></head>
<body style="background-color:#fdf5e6">
<div align="center">


<%--<jsp:useBean id="Holo" scope="request" class="com.lcpan.bean.HoloBean" />--%>

<h2>成員資料已刪除成功</h2>
<h3>若還需刪除請按返回繼續操作</h3>
<input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/>
<table>

<%--<tr><td>員工編號
<td><input type="text" disabled value="<%=emp.getEmpno()">
<tr><td>姓名<td><input type="text" disabled value="<%=emp.getEname()%>">
<tr><td>到職日<td><input type="text" disabled value="<%=emp.getHiredate()%>">
<tr><td>薪水<td><input type="text" disabled value="<%=emp.getSalary()%>">
<tr><td>部門編號<td><input type="text" disabled value="<%=emp.getDeptno()%>">
<tr><td>職稱<td><input type="text" disabled value="<%=emp.getTitle()%>">--%>

</table>

</div>

</body>
</html>