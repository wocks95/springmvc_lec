<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${contextPath}/assets/css/init.css?dt=<%=System.currentTimeMillis()%>">
<link rel="stylesheet" href="${contextPath}/assets/css/header.css?dt=<%=System.currentTimeMillis()%>">
<script src="${contextPath}/assets/js/main.js?dt=<%=System.currentTimeMillis()%>"></script>
<title>${param.title}</title> <!-- 상단에 고정 -->
</head>
<body>
  
  <h1 id="logo" class="logo">Coupang</h1>
  
  <nav class="gnb-wrap">
    <ul class="gnb">
      <li><a href="${contextPath}/blog/list.do">블로그</a></li>
      <li><a href="${contextPath}/notice/list.do">공지사항</a></li>
      <li><a href="${contextPath}/notice/list.do">공지사항</a></li>
      <li><a href="${contextPath}/notice/list.do">공지사항</a></li>
      <li><a href="${contextPath}/notice/list.do">공지사항</a></li>
    </ul>
  </nav>
  <!-- 로그인이 안되면 회원가입을 보여줌 -->
  <c:if test="${empty sessionScope.loginUser}">
    <button type="button" id="btn-login-form">로그인</button>
    <button type="button" id="btn-signup-form">회원가입</button>
    
   <script>
     function loginForm() {
       document.getElementById('btn-login-form').addEventListener('click', (event) => {
         location.href = '${contextPath}/user/login.form?url=' + location.href;
       })                    // main.jsp에서 login.jsp로 갈때 url 전달!
     }
     
     function signupForm() {
       document.getElementById('btn-signup-form').addEventListener('click', (event) => {
         location.href = '${contextPath}/user/signup.form';
       })
     }
     loginForm();
     signupForm();
   </script>
  </c:if>
  
  <c:if test="${not empty sessionScope.loginUser}">
    <div>
      <span><a href="#">${sessionScope.loginUser.userName}</a>님 환영합니다.</span>
      <button type="button" id="btn-logout">로그아웃</button>
    </div>
    <script>
      function logout() {
        document.getElementById('btn-logout').addEventListener('click', (event) => {
          location.href = '${contextPath}/user/logout.do';
        })
      
      }
      logout();
    </script>
  </c:if>

  
  <script>

    function displayMsg() {
      const msg ='${msg}';
      if(msg !=='')
        alert(msg);
    }
   
    displayMsg();
    
  </script>

   <div class="wrap">