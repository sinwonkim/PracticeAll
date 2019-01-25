<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form role='hidden' method="post">
		<input type='hideen' name='bno' value="${boardVO.bno }">
	</form>
	
	<div class="form-group">
		<label for="exampleInputEmail1"></label>
		<input type="text" name='title' class="form-control" value="${boardVO.title }"
		readonly="readonly">
	</div>
	<div>
		<label for="exampleInputEmail">Writer :</label>
		<input type="text" name="writer" class="form-control" value="${boardVO.writer }"
		readonly="readonly">
	
	</div>
	
	<div>
		<button type="submit" class="btn btn-warning">Modify</button>
		<button type="submit" class="btn btn-warning">REMOVE</button>
		<button type="submit" class="btn btn-warning">LIST</button>
		
	
	</div>
	
</body>
</html>