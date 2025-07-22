<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원리스트</h2>
	<table border="1">
		<tr>
			<th>아이디
			<th>패스워드
			<th>이름
			<th>가입일
			<th>
		</tr>
		<!-- 컨트롤러에서 영역에 저장한 List를 기반으로 목록을 반복 출력 -->
		<c:forEach items="${memberList}" var="row" varStatus="loop">
		<tr>
			<td>${row.id }		
			<td>${row.pass }		
			<td>${row.name }		
			<td>${row.regidate }		
			<td>
				<a href="edit.do?id=${row.id }">수정</a>			
				<a href="delete.do?id=${row.id }">삭제</a>			
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="regist.do">회원등록</a>
</body>
</html>