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
		        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">会员新增</strong></div>
		      </div>
		      <hr/>
		      <div class="am-g">
		        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
		        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form class="am-form am-form-horizontal" action="${ctx }/member/addMemberInfo" method="post">
          
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">会员名称</label>
              <div class="am-u-sm-9">
                <input type="text" name="memberName" placeholder="请输入名称..." required />
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">会员OpenId</label>
              <div class="am-u-sm-9">
                <input type="text" name="memberOpenId" placeholder="请输入微信识别号..." required />
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">性别</label>
              <div class="am-u-sm-9">
                <input type="radio" name="memberSex" value="男" >男</input>
                <input type="radio" name="memberSex" value="女" >女</input>
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-phone" class="am-u-sm-3 am-form-label">手机号码</label>
              <div class="am-u-sm-9">
                <input type="text" name="memberPhone" placeholder="请输入手机号..." required />
              </div>
            </div>
          	
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">出生日期</label>
              <div class="am-u-sm-9">
                <input type="date" class="am-form-field am-input-sm" name="memberBirthday" placeholder="请输入会员出生日期..." required />
              </div>
            </div>
          	
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">会员状态</label>
              <div class="am-u-sm-9">
              		<input type="radio" name="memberStatus" value="0" checked="checked" >有效</input>
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