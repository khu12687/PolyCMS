<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<h3>${boardId }게시판 목록</h3>
		</div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>게시글 번호</th>
						<th>제목</th>
						<th>관리</th>
					</tr>
				</thead>
				<tbody>
					<c:if test = "${list.size() < 1 }">					
						<tr>
							<td colspan="7">등록 된 게시판이 없습니다</td>
						</tr>
					</c:if>
					<c:forEach var="item" items="${list }">				
						<tr>
							<td>${item.articleId }</td>
							<td>${item.subject }</td>
							<td><a href="update/${item.articleId }">변경</a> <a href="delete/${item.articleId }">삭제</a><a href="${item.articleId}/article/list">게시글</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="add">추가</a>
		</div>
	</div>
</body>
</html>