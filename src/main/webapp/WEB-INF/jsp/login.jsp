<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
  <head>
	  <title>Login Page | 用户登录</title>
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <meta name="format-detection" content="telephone=no">
	  <meta name="renderer" content="webkit">
	  <meta http-equiv="Cache-Control" content="no-siteapp" />
	  <link rel="alternate icon" type="image/png" href="${ctx }/assets/i/favicon.png">
	  <link rel="stylesheet" href="${ctx }/assets/css/amazeui.min.css"/>
	    <style>
		    .header {
		      text-align: center;
		    }
		    .header h1 {
		      font-size: 200%;
		      color: #333;
		      margin-top: 30px;
		    }
		    .header p {
		      font-size: 14px;
		    }
	  </style>
  </head>
  
  <body>
	<div class="header">
	  <div class="am-g">
	    <h1>后台管理登录</h1>
	  </div>
	  <hr />
	</div>
	<div class="am-g">
	  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
	    <form method="post" class="am-form" action="${ctx }/login/loginCheck">
	      <label for="email">账号:</label>
	      <input type="text" name="username" id="username" value="">
	      <br>
	      <label for="password">密码:</label>
	      <input type="password" name="password" id="password" value="">
	      <br>
	      <br />
	      <div class="am-cf">
	        <input type="submit" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
	      </div>
	    </form>
	    <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
	    <jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
	    <hr>
	  </div>
	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
	<c:if test="${!empty msg}">
		<script src="${ctx }/assets/js/alert/alert.js"></script>
	</c:if>
  </body>
</html>
