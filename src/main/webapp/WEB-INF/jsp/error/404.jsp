<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!doctype html>
<html class="no-js">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>主页</title>
<meta name="description" content="主页">
<meta name="keywords" content="user">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="${ctx }/static/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="${ctx }/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${ctx }/assets/css/amazeui.min.css" />
<link rel="stylesheet" href="${ctx }/assets/css/admin.css">
</head>
<body>
	<header class="am-topbar am-topbar-inverse admin-header">
		<div class="am-topbar-brand">
			<strong>晨 睿</strong> <small>后台管理系统</small>
		</div>
		<button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>
		<div class="am-collapse am-topbar-collapse" id="topbar-collapse">
			<ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
				<li class="am-dropdown" data-am-dropdown>
				<a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;"> 
				<span class="am-icon-users"></span>欢迎管理员 ${user.userName}<span class="am-icon-caret-down"></span>
				</a>
					<ul class="am-dropdown-content">
						<li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
						<li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
						<li><a href="${ctx }/login/loginOut"><span class="am-icon-power-off"></span> 退出</a></li>
					</ul></li>
				<li class="am-hide-sm-only">
					<a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span><span class="admin-fullText">开启全屏</span></a>
				</li>
			</ul>
		</div>
	</header>
	<div class="am-cf admin-main">
		<!-- sidebar start -->
		<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
			<div class="am-offcanvas-bar admin-offcanvas-bar">
				<ul class="am-list admin-sidebar-list" id="collapase-nav-one">
					<li><a href="#/"><span class="am-icon-home"></span> 首页</a></li>

					<c:forEach var="rule" items="${user.ruleList}" begin="0" step="1" varStatus="status">
						<li class="admin-parent">
						<a class="am-cf" href="${ctx}/${rule.ruleUrl}?menuId=${rule.ruleCode}" data-am-collapse="{target: '##collapse-nav${status.index + 1}'}">
							<span class="am-icon-file"></span> ${rule.ruleName} <span class="am-icon-angle-right am-fr am-margin-right"></span>
						</a>
						<c:choose>
							<c:when test="${!empty rule.childrens}">
								<ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav${status.index + 1}">
										<c:forEach var="children" items="${rule.childrens}" begin="0" step="1">
											<li>
												<li><a href="${ctx }/${children.ruleUrl}"><span class="am-icon-th"></span> ${children.ruleName}</a></li>
											</li>
										</c:forEach>
								</ul>
							</c:when>
						</c:choose>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- sidebar end -->

	  <!-- content start -->
	  <div class="admin-content">
	    <div class="admin-content-body">
	      <div class="am-cf am-padding am-padding-bottom-0">
	        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">404</strong> / <small>That’s an error</small></div>
	      </div>
	
	      <hr>
	
	      <div class="am-g">
	        <div class="am-u-sm-12">
	          <h2 class="am-text-center am-text-xxxl am-margin-top-lg">404. Not Found</h2>
	          <p class="am-text-center">没有找到你要的页面</p>
	        <pre class="page-404">
	        </pre>
	        </div>
	      </div>
	    </div>
	
	    <footer class="admin-content-footer">
	      <hr>
	      <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
	    </footer>
	  </div>
	  <!-- content end -->

	</div>
	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="${ctx }/assets/js/jquery.min.js"></script>
	<!--<![endif]-->
	<script src="${ctx }/assets/js/amazeui.min.js"></script>
	<script src="${ctx }/assets/js/app.js"></script>
</body>
</html>