<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
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
	<!-- header start -->
	<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
	<!-- header end -->
	<div class="am-cf admin-main">
		<!-- sidebar start -->
		<jsp:include page="/WEB-INF/jsp/common/sidebar.jsp"></jsp:include>
		<!-- sidebar end -->

<!-- content start -->
  <div class="admin-content">
    <div class="admin-content-body">
      <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户菜单管理</strong></div>
      </div>
      <hr/>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>

        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form class="am-form am-form-horizontal" action="${ctx }/menu/userRuleUpdate" method="post">
          <div class="am-u-sm-12 am-u-md-8">
          	<input type="hidden" id="menuStr" name="menuStr" value=""/>
            <input type="hidden" id="subUserId" name="userId" value="${userResponse.userId}"/>
          	<input type="button" id="checkAll" value="全选"> 
			<input type="button" id="cancelCheckAll" value="取消全选">
			<input type="button" id="invertSelection" value="反选"> 
			<input type="button" id="save" value="保存">
			<input type="button" id="cancel" value="取消">
			<c:forEach var="menu" items="${menuList}">
          	<ul>
          		<li>
          			<c:choose>
	              	<c:when test="${menu.owner == 0}">
	              		<div><input type="checkbox" name="rulebox" checked="checked" value="${menu.ruleId}">${menu.ruleName}</div>
	              	</c:when>
	              	<c:otherwise>
	              		<div><input type="checkbox" name="rulebox" value="${menu.ruleId}">${menu.ruleName}</div>
	              	</c:otherwise>
	              </c:choose>
				  <c:if test="${!empty menu.childrens}">
		                <c:forEach var="children" items="${menu.childrens}">
		                  	<c:choose>
			                  	<c:when test="${children.owner == 0}">
				                  	 <ul>
					                      <li><div><input type="checkbox" name="rulebox" checked="checked" value="${children.ruleId}">${children.ruleName}</div></li>
					                 </ul>
			                  	</c:when>
			                  	<c:otherwise>
			                  		 <ul>
					                     <li><div><input type="checkbox" name="rulebox" value="${children.ruleId}">${children.ruleName}</div></li>
					                 </ul>
			                  	</c:otherwise>
		                  	</c:choose>
		               </c:forEach>
	                </c:if>
		        </li>
    		</ul>
    		</c:forEach>
          </div>
            <div class="am-form-group">
              <div class="am-u-sm-9 am-u-sm-push-3">
                <button type="submit" class="am-btn am-btn-primary" id="verify">保存修改</button>
                <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
              </div>
            </div>
          </form>
		  <jsp:include page="/WEB-INF/jsp/common/alert.jsp"></jsp:include>
        </div>
      </div>
    </div>

			<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
		</div>
		<!-- content end -->

	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
	<script src="${ctx }/assets/js/user/user_rule.js" ></script>
	<c:if test="${!empty msg}">
		<script src="${ctx }/assets/js/alert/alert.js"></script>
	</c:if>
</body>
</html>