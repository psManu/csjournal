<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CS Journal | Dashboard</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href='<spring:url value="/resources/css/bootstrap.min.css" ></spring:url>'>
		<link rel="stylesheet" href='<spring:url value="/resources/css/w3.css" ></spring:url>'>
		<link rel="stylesheet" href='<spring:url value="/resources/css/lobster.css" ></spring:url>'>
		<script src='<spring:url value="/resources/js/jquery.min.js"></spring:url>' ></script>
		<script src='<spring:url value="/resources/js/bootstrap.min.js"></spring:url>'></script>
		
		<style>
			.sideList {
				min-height:60px;
				font-size:110%;
				border:1px solid grey;
				text-decoration: none;
				background-color: black;
				color: white;
				
			}
			.sideList a {
				padding-left:15px;
			}
		</style>

		
</head>
	<body style="overflow-x:scroll;">
		<div class="container-fluid" style="max-width:100%; min-width:1300px; min-height:650px;">
			<div class="row w3-black">
				<div class="col-xs-5"></div>
				<div class="col-xs-6">Welcome ${user.username}</div>
				<div class="col-xs-1">Log out</div>
			</div>
			<div class="row">
				<div class="col-xs-2 " style="padding-left:0px;background-color:black;min-height:600px;">
					<ul style="padding-left:0px; min-height:100%;">
						<li class="sideList"><a href="index.html" target="contentLoader">Dashboard/Website</a></li>
						<li class="sideList">
							
							<div class="w3-dropdown-hover">
							  <button class="w3-btn">Articles</button>
							  <div class="w3-dropdown-content w3-border">
								<a href='<spring:url value="/admin/addArtTitle"></spring:url>' target="contentLoader">Add new article title</a>
								<a href='<spring:url value="csjournal/admin/addArt"></spring:url>' target="contentLoader">Add article</a>
								<a href='<spring:url value="admin/editArtName"></spring:url>' target="contentLoader">Edit article name</a>
								<a href='<spring:url value="csjournal/admin/publishArt"></spring:url>' target="contentLoader">Publish articles</a>
								<a href='<spring:url value="csjournal/admin/editArt"></spring:url>' target="contentLoader">Edit articles</a>
								<a href='<spring:url value="csjournal/admin/deleteArt"></spring:url>' target="contentLoader">Delete articles</a>
							  </div>
							</div>

						</li>
						<li class="sideList">
							
							<div class="w3-dropdown-hover">
							  <button class="w3-btn">Categories</button>
							  <div class="w3-dropdown-content w3-border">
								<a href='<spring:url value="admin/add_cat.html"></spring:url>' target="contentLoader">Add new category</a>
								<a href='<spring:url value="admin/add_artto_cat.html"></spring:url>' target="contentLoader">Add article to a category</a>
								<a href='<spring:url value="admin/rmv_from_cat.html"></spring:url>' target="contentLoader">Remove articles from a category</a>
								<a href='<spring:url value="admin/edit_cat_name.html"></spring:url>' target="contentLoader">Edit category name</a>
								<a href='<spring:url value="admin/delete_cat.html"></spring:url>' target="contentLoader">Delete category</a>
							  </div>
							</div>
							
						</li>
						<li class="sideList"><a href='<spring:url value="admin/edit_about.html"></spring:url>' target="contentLoader">About Page</a></li>
						<li class="sideList"><a href='<spring:url value="admin/file_upload.html"></spring:url>' target="contentLoader">File Manager</a></li>
						<li class="sideList"><a href='<spring:url value="admin/"></spring:url>' target="contentLoader">My Profile</a></li>
						<li class="sideList"><a href='<spring:url value="admin/"></spring:url>' target="contentLoader">User Accounts</a></li>
					</ul>
				</div>
				<div class="col-xs-10" style="border:5px solid grey;">
					<iframe src='<spring:url value="/"></spring:url>' width="100%" height="100%" style="border:none; min-height:600px;" name="contentLoader"></iframe>
				</div>
			</div>
		</div>
		

	</body>
</html>