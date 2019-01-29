<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listAll.jsp</title>
<script type="text/javascript">
var result = '${msg}';

if(result == 'SUCCESS'){
	alert('글이 정상적으로 등록되었습니다.');
}

</script>
</head>
<body>
	<table class="table table-bordered">
		<tr>
			<th style="width:10px">BNO</th>
			<th>제목</th>	
			<th>작성자</th>
			<th>작성일</th>
			<th style="width: 40px">조회수</th>
		</tr>
	
	
	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVO.bno}</td>
			<td><a href="/board/read?bno=${boardVO.bno}">${boardVO.title }</a></td>
			<td>${boardVO.writer}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.getRegdate()}"/></td>
			
			<td><span class="badge ba-red">${boardVO.viewcnt }</span></td>
		</tr>
	
	
	</c:forEach>
	
	</table>
</body>
</html>