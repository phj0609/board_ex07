<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container">
   <div class="jumbotron">
      <h2>게시글 목록</h2>
   </div>
   <table class="table">
   		<tr>
   			<th>번호</th>
   			<th>제목</th>
   			<th>작성자</th>
   			<th>등록일</th>
   			<th>수정일</th>
   		</tr>
   		<c:forEach var="b" items="${list}">
   			<tr>
   				<td>${b.bno}</td>
   				<td>
   					<a href="get?bno=${b.bno}">${b.title}</a>
   				</td>
   				<td>${b.writer}</td>
   				<td>
   					<fmt:parseDate var="regDate" value="${b.regDate}" pattern="yyyy-MM-dd'T'HH:mm:ss" type="both"></fmt:parseDate>
   					<fmt:formatDate value="${regDate}" pattern="yyyy년MM월dd일HH:mm:ss"/>
   				</td>
   				<td>
   					<fmt:parseDate var="updateDate" value="${b.updateDate}" pattern="yyyy-MM-dd'T'HH:mm:ss" type="both"></fmt:parseDate>
   					<fmt:formatDate value="${updateDate}" pattern="yyyy년MM월dd일HH:mm:ss"/>
   				</td>
   			</tr>
   		</c:forEach>
   </table>
   
   
</div>
<%@ include file="../layout/footer.jsp" %>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}
th, td {
	text-align: left;
	padding: 8px;
}
tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>