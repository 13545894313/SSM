<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>首页-keke</title>
		<%@include file="../common/common.jsp" %>
	</head>
	<body style="background:url(${basePath}/resource/images/bg2.jpg)">
		<!--头部-->
		<%@include file="../common/header.jsp" %>
		<!-- 内容区 -->
		<div class="container" style="min-height:780px">
			
			<c:forEach var="blog" items="${blogs}">
				<h1><a href="${basePath}/blog/detail/${blog.id}.do">${blog.title}</a></h1>
				<br>				
			</c:forEach>
		</div>
		<!-- end 内容区 -->
		<!--底部-->
		<%@include file="../common/footer.jsp" %>
	</body>
</html>