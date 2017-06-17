<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!doctype html>
<html class="no-js">
<jsp:include page="/WEB-INF/jsp/common/top.jsp"></jsp:include>
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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户新增</strong></div>
      </div>
      <hr/>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>

        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form class="am-form am-form-horizontal" action="${ctx }/user/addUserInfo" method="post">
          
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">登录账号</label>
              <div class="am-u-sm-9">
                <input type="text" name="userName" placeholder="请输入登录账号..." required />
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-email" class="am-u-sm-3 am-form-label">登录密码</label>
              <div class="am-u-sm-9">
                <input type="password" name="userPassword" placeholder="请输入登录密码..." required />
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-phone" class="am-u-sm-3 am-form-label">联系方式</label>
              <div class="am-u-sm-9">
                <input type="tel" name="userPhone" placeholder="输入联系方式..." required />
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">出生日期</label>
              <div class="am-u-sm-9">
                <input type="date" class="am-form-field am-input-sm" name="userBirthday" placeholder="请输入出生日期..." required />
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">入职日期</label>
              <div class="am-u-sm-9">
                <input type="date" class="am-form-field am-input-sm" name="userEntryDate" placeholder="请输入入职日期..." required />
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">用户工号</label>
              <div class="am-u-sm-9">
                <input type="text" name="userJobNumber" placeholder="请输入用户工号..." required />
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">性别</label>
              <div class="am-u-sm-9">
              		<input type="radio" name="userSex" value="男" >男</input>
              		<input type="radio" name="userSex" value="女" >女</input>
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">用户角色</label>
              <div class="am-u-sm-9">
              		<input type="radio" name="userRuleBelong" value="0" >超级管理员</input>
              		<input type="radio" name="userRuleBelong" value="1" >普通管理员</input>
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">用户状态</label>
              <div class="am-u-sm-9">
              		<input type="radio" name="userStatus" value="0" checked="checked" >有效</input>
              		<input type="radio" name="userStatus" value="1" >无效</input>
              </div>
            </div>
            
	        <div class="am-form-group">
	            <label for="user-name" class="am-u-sm-3 am-form-label">所属部门</label>
	            <div class="am-u-sm-9">
	              <select data-am-selected="{btnSize: 'sm'}" name="departmentId">
	              	<c:forEach items="${departs }" var="depart">
	              		<option value="${depart.departmentId }">${depart.departmentName }</option>
	              	</c:forEach>
	              </select>
	            </div>
	        </div>
	        
           <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">职位名称</label>
              <div class="am-u-sm-9">
                <input type="text" name="departmentName" placeholder="请输入职位名称..." required />
              </div>
            </div>

            <div class="am-form-group">
              <div class="am-u-sm-9 am-u-sm-push-3">
                <button type="submit" class="am-btn am-btn-primary">保存</button>
                <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
              </div>
            </div>
          </form>
          <jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
        </div>
      </div>
    </div>

    <jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
  </div>
  <!-- content end -->
  </div>
<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
<c:if test="${!empty msg}">
	<script src="${ctx }/assets/js/alert/alert.js"></script>
</c:if>
</body>
</html>