<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>成員</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<style>
img{
	width:200px
}
div{

}
</style>
<body>
    <div class="container">

    <form>
      <div class="form-group">
        <label for="exampleInputEmail1">ID</label>
        <input type="text" class="form-control" id="exampleInputEmail1" value=${holo.memberid}>
      </div>
      <div class="form-group">
        <label for="exampleInputPassword1">名稱</label>
        <input type="password" class="form-control" id="exampleInputPassword1" value=${holo.membername}>
      </div>
      <div class="form-group">
        <label for="exampleInputPassword1">圖片</label>
        <img src=${holo.memberpicture}>
      </div>
      <div class="form-group">
        <label for="exampleInputPassword1">介紹</label>
        <input type="password" class="form-control" id="exampleInputPassword1" value=${holo.memberdata}>
      </div>
      <div class="form-group">
        <label for="exampleInputPassword1">歸屬</label>
        <input type="password" class="form-control" id="exampleInputPassword1" value=${holo.memberfrom}>
      </div>
    </form>
</div>
</body>
</html>