<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		table, td, tr { border:2px solid black }
		td { padding:20px; }
	</style>
</head>
<body>
	<a>Search results page</a>

		<h3>Search Results for  <c:out value="${search_param}"></c:out> </h3>
		<br>
		<br>
		
		<c:if test="${ not empty art_list }">
			<table>
				<c:forEach var="article" items="${art_list}">
					
				<c:set var="url" value="/cs-journal/uncat/${article.artId}/${article.artNameWithoutSpaces} "/>
				
				<tr>
					<td><c:out value="${article.artId}" ></c:out></td> 
					<td><c:out value="${article.artName}" ></c:out></td>
					<td><c:out value="${article.author}" ></c:out></td>
					<td><c:out value="${article.dateModified}" ></c:out></td>
					<td><c:out value="${article.content}" ></c:out></td>
					<td><c:out value="${article.thumbnailUrl}" ></c:out></td>
					<td><a href="${url}">${article.artName}</a></td>
				</tr>
					
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${empty art_list}">
			<p>No articles Found!</p>
		</c:if>

</body>
</html>