<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register.jsp</title>
</head>
<body>
	<!-- action 지정되지 않으면 현재경로로 -->
	<form role="form" method="post">
		<div class="form-group">
			<label for="exampleInputEmail">Title</label>
			<input type="text" name="title" placeholder="Enter Title">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="content "rows="3" placeholder="Enter">
			
			</textarea>	
		</div>
		<div class="form-group">
			<label for="exampleInputEmail">Writer</label>
			<input type="text" name="writer" class="form-control" placeholder="Enter Write">
		</div>
		
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">submit</button>
		</div>
	</form>
</body>
</html>