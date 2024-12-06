<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewpoint" content="width=device-width, initial-scale=1.0">
<title>Blog list</title>
</head>
<body>
  <h1>Blog List</h1>
  <div>블로그 수 : ${count}</div>
  
  
  <c:forEach var="blog" items="${books}">
    <div  id = "blog${vs.index}" class="blog">
      <a href="${contextPath}/blog/detail.do?blog_id=${blog.blog_id}">${blog.blog_id} : ${blog.title}</a>
    </div>
  </c:forEach>
</body>
</html>