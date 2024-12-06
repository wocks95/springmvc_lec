<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewpoint" content="width=device-width, initial-scale=1.0">
<title>Blog Detail</title>
</head>
<body>
  <h1>${blog.title} 블로그</h1>
  <form id="form-detail" method="get">
    <div>
      <label for="blog_id">BLOG ID</label>
      <input type="text" name="blog_id" id="blog_id" value="${blog.blog_id}">
    </div>
    <div>
      <label for="title">TLTLE</label>
      <input type="text" name="title" id="title" value="${blog.title}">
    </div>
    <div>
      <label for="contents">CONTENTS</label>
      <input type="text" name="contents" id="contents" value="${blog.contents}">
    </div>
    <div>
      <label for="user_email">USER EMAIL</label>
      <input type="text" name="user_email" id="user_email" value="${blog.user_email}">
    </div>
    <div>
      <label for="hit">HIT</label>
      <input type="text" name="hit" id="hit" value="${blog.hit}">
    </div>
    <div>
      <label for="modify_dt">MODIFY DT</label>
      <input type="text" name="modify_dt" id="modify_dt" value="${blog.modify_dt}">
    </div>
    <div>
      <label for="create_dt">CREATE DT</label>
      <input type="text" name="create_dt" id="create_dt" value="${blog.create_dt}">
    </div>
    
    
    
    
  </form>


  <script>
     const formDetail = document.getElementById('form-Detail');
  
  
  </script>
</body>
</html>