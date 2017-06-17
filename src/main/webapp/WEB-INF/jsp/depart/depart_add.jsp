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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">部门新增</strong></div>
      </div>
      <hr/>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>

        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form action="${ctx}/depart/addDepartInfo" class="form-horizontal" method="post">
          
         	<div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">部门名称</label>
              <div class="am-u-sm-9">
                <input type="text" name="departmentName" placeholder="请输入部门名称..." required />
              </div>
            </div>
            
         	<div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">部门编号</label>
              <div class="am-u-sm-9">
                <input type="text" name="departmentNo" placeholder="请输入部门编号..." required />
              </div>
            </div>
            
         	<div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">部门编号</label>
              <div class="am-u-sm-9">
                    <input type="radio" name="departmentStatus" value="0" checked="checked">有效</input>
                    <input type="radio" name="departmentStatus" value="1">无效</input>  
              </div>
            </div>
            
             <div class="am-form-group">
              <div class="am-u-sm-9 am-u-sm-push-3">
                <button type="submit" class="am-btn am-btn-primary">保存</button>
                <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
              </div>
            </div>
          </form>
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