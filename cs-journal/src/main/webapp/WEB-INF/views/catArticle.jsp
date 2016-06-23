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
	<p>A category article here</p>
	<h1>Article Content</h1>
			<table>
				<tr>
					<td><c:out value="${article.artId}" /></td> 
					<td><c:out value="${article.artName}" /></td>
					<td><c:out value="${article.author}" /></td>
					<td><c:out value="${article.dateModified}" ></c:out></td>
					<td><c:out value="${article.content}" /></td>
					<td><c:out value="${article.thumbnailUrl}" /></td>
				</tr>
			</table>

	<h1>Related Articles</h1>
			<table>
				<c:forEach var="rel_art" items="${rel_articles}">
					<tr>
						<td><c:out value="${rel_art.id}" /></td> 
						<td><c:out value="${rel_art.title}" /></td>
						<td><c:out value="${rel_art.titleWithoutSpaces}" /></td>
					</tr>
				</c:forEach>
			</table>

	<h1>Category Articles</h1>
			<table>
				<c:forEach var="article" items="${cat_articles}">
					<tr>
						<td><c:out value="${article.artId}" /></td> 
						<td><c:out value="${article.artName}" /></td>
					</tr>
				</c:forEach>
			</table>
			
	<h1>External Links</h1>
			<table>
				<c:forEach var="ext" items="${ext_links}">
					<tr>
						<td><c:out value="${ext.id}" /></td> 
						<td><c:out value="${ext.name}" /></td>
						<td><c:out value="${ext.url}" /></td>
					</tr>
				</c:forEach>
			</table>
			

</body>
</html>