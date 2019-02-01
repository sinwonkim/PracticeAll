<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
 <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
</head>
<body>
	<form role="form" method="post">
	
		<div class="box body">
			<div>
				<label for="exampleInputEmail">BNO</label>
				<input type="text" name='bno' class="form-control" value="${boardVO.bno}"
				 readonly="readonly">
			</div>	
			<div class="form-group">
				<label for="exampleInputEmail">Title</label>
				<input type="text" name='title' class="form-control" value="${boardVO.title }">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">content</label>
				<textarea class="form-control" rows="3">${boardVO.content}</textarea>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Writer</label>
				<input type="text" name="writer" class="form-control" value="${boardVO.writer}">
			</div>
		</div>

	</form>
	
	<div class="box-footer">
		<button type="submit" class="btn btn-primary">저장</button>
		<button type="submit" class="btn btn-warning">취소</button>
	</div>
	
	<script>
		$(document).ready(function(){
			
			var formobj = $("form[role='form']");
			
			console.log(formobj);
			
			$(".btn-warning").on("click",function(){
				self.location = "/board/listAll";
			});
			
			$(".btn-primary").on("click",function(){
				formobj.submit();
			});
			
		});
	
	
	</script>
	
</body>
</html>