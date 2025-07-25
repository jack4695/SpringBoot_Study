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
	
	<!-- 선생님 코드 -->
	<script>
		const formValidate = (fm) => {
			//검색어가 빈값인지 확인하여 경고창 띄움
			if(fm.searchKeyword.value=='') {
				alert("검색어를 입력하세요.");
				fm.searchKeyword.focus();
				return false;
			}
		}
	</script>
	
	<!-- 내가 만든 코드 -->
	<form name="searchFrm" action="list.do">
		<select name="searchField">
			<option value="id">아이디
			<option value="name">이름
		</select>
		<input type="text" name="searchKeyword">
		<button type="submit">
			검색
		</button>
		
	</form>
	
	<!-- 선생님 코드 -->
	<form onsubmit="return formValidate(this);">
	<table border="1">
	<tr>
		<td>
			<select name="searchField">
				<option value="id">아이디</option>
				<option value="name">이름</option>
			</select>
			<input type="text" name="searchKeyword" />
			<input type="submit" value="검색" />
		</td>
	</tr>
	</table>
	</form>
	
	
	
	
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
				<a href="delete.do?id=${row.id }">삭제1</a>			
				<a href="javascript:deleteGet('${row.id }');">삭제2(get)</a>			
				<a href="javascript:deletePost('${row.id }');">삭제3(post)</a>			
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="regist.do">회원등록</a>
	
	<script>
		let deleteGet = (userid) => {
			if(confirm("이 회원을 삭제할까요?")){
				location.href='delete.do?id='+userid
			}
		}
		//POST방식으로 회원정보 삭제하기
		function deletePost(userid) {
			//<form>의 DOM을 얻어온다.
			let f = document.deleteFrm;
			//아이디 입력상자에 매개변수로 받은 아이디를 입력한다.
			f.id.value = userid;
			//<form>의 전송방식과 요청URL을 설정한다.
			f.method = "post";
			f.action = "delete.do";
			
			//사용자에게 물어본 후 제출(전송)한다.
			if(confirm("이 회원을 삭제할까요?")){
				f.submit();
			}
			
		}
	</script>
	
	<!-- 
	Post방식의 삭제 : 화면상에 보이지 않는 hidden 타입의 폼을 하나 추가한다.
	 -->
	<form name="deleteFrm">
		<input type="hid-den" name="id">
	</form>
</body>
</html>