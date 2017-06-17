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
				<div class="am-cf am-padding">
					<div class="am-cf"><strong class="am-text-primary am-text-lg">电动车新增</strong></div>
				</div>
			    <div class="am-g">
			    <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
			        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
			          <form class="am-form am-form-horizontal" action="${ctx}/mbile/mbileAdd" method="post">
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileNo" placeholder="请输入电动车编号..." />
			              </div>
			            </div>
			
<!-- 			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车坐标</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileCoordinate" placeholder="请输入电动车坐标..." />
			              </div>
			            </div> -->
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车类型</label>
			              <div class="am-u-sm-9">
			              		<input type="radio" name="electrombileType" value="0" >小型</input>
			              		<input type="radio" name="electrombileType" value="1" >大型</input>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车状态</label>
			              <div class="am-u-sm-9">
			              		<input type="radio" name="electrombileStatus" value="0" checked="checked">正常</input>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车报警状态</label>
			              <div class="am-u-sm-9">
			              		<input type="radio" name="electrombileStatus" value="0" checked="checked">正常</input>
			              </div>
			            </div>	
				        
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电机编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileElectrical" placeholder="请输入电动车电机编号..." />
			              </div>
			            </div>	        
				        
			           <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电量</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileElectric" value="100%" />
			              </div>
			            </div>
			
			            <div class="am-form-group">
			              <div class="am-u-sm-9 am-u-sm-push-3">
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                <button type="submit" class="am-btn am-btn-primary">添加</button>
			                <button type="submit" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
			              </div>
			            </div>
			          </form>
			          <jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
			        </div>
				</div>
				<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
			</div>
			<!-- content end -->
			</div>
		</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
	<c:if test="${!empty msg}">
		<script src="${ctx }/assets/js/alert/alert.js"></script>
	</c:if>
</body>
</html>