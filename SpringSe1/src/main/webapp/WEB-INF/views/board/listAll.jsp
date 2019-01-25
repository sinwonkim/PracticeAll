<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listAll.jsp</title>
<script type="text/javascript">
var result = '${msg}';

if(result == 'SUCCESS'){
	alert('처리가 완료 되었습니다.');
}

</script>
</head>
<body>
	<table class="table table-border">
		<tr>
			<th style="width:10px">BNO</th>
			<th>작성자</th>	
			<th>작성일</th>
			<th>보기</th>
		</tr>
	</table>
	
	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVo.bno}</td>
			<td></td>
			<td></td>
			<td></td>
		
		
		</tr>
	
	
	</c:forEach>
</body>
</html>