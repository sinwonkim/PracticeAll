<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
</head>
<body>
	<form role='form' method="post">

	<input type='hidden' name='bno' value="${boardVO.bno}">

</form>
	
	<div class="form-group">
		<label for="exampleInputEmail1">제목 : </label>
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
		<button type="submit" class="btn btn-danger">REMOVE</button>
		<button type="submit" class="btn btn-primary">LIST</button>
		
	
	</div>
	
<script type="text/javascript">  
$(document).ready(function(){
		
  	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function(){
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-danger").on("click",function(){
		formObj.attr("action","/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click",function(){
		self.location = "/board/listAll";
	});
});	


</script>
</body>
</html>