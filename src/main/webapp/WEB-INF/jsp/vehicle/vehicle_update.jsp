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
					<div class="am-cf"><strong class="am-text-primary am-text-lg">电动车报修</strong></div>
				</div>
			    <div class="am-g">
			    <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
			        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
			          <form class="am-form am-form-horizontal" action="${ctx}/mbile/mbileUpdate" method="post">
						<input type="hidden" name="electrombileId" value="${mbile.electrombileId }"/>
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileNo" value="${mbile.electrombileNo }"/>
			              </div>
			            </div>
			
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车坐标</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileCoordinate" value="${mbile.electrombileCoordinate }"/>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车类型</label>
			              <div class="am-u-sm-9">
			               <c:choose>
			              	<c:when test="${mbile.electrombileType == '0' }">
			              		<input type="radio" name="electrombileType" value="0" checked="checked">小型</input>
			              		<input type="radio" name="electrombileType" value="1" >大型</input>
			              	</c:when>
			              	<c:otherwise>
			              		<input type="radio" name="electrombileType" value="0">小型</input>
			              		<input type="radio" name="electrombileType" value="1" checked="checked">大型</input>
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车状态</label>
			              <div class="am-u-sm-9">
			              <c:choose>
			              	<c:when test="${mbile.electrombileStatus == '0' }">
			              		<input type="radio" name="electrombileStatus" value="0" checked="checked">正常</input>
			              		<input type="radio" name="electrombileStatus" value="1" >已报修</input>
			              		<input type="radio" name="electrombileStatus" value="2" >修理中</input>
			              		<input type="radio" name="electrombileStatus" value="3" >无法修复</input>
			              	</c:when>
			              	<c:when test="${mbile.electrombileStatus == '1' }">
				              		<input type="radio" name="electrombileStatus" value="0" >正常</input>
			              		<input type="radio" name="electrombileStatus" value="1" checked="checked">已报修</input>
			              		<input type="radio" name="electrombileStatus" value="2" >修理中</input>
			              		<input type="radio" name="electrombileStatus" value="3" >无法修复</input>
			              	</c:when>
			              	<c:when test="${mbile.electrombileStatus == '2' }">
			              		<input type="radio" name="electrombileStatus" value="0" >正常</input>
			              		<input type="radio" name="electrombileStatus" value="1" >已报修</input>
			              		<input type="radio" name="electrombileStatus" value="2" checked="checked">修理中</input>
			              		<input type="radio" name="electrombileStatus" value="3" >无法修复</input>
			              	</c:when>
			              	<c:otherwise>
			              		<input type="radio" name="electrombileStatus" value="0" >正常</input>
			              		<input type="radio" name="electrombileStatus" value="1" >已报修</input>
			              		<input type="radio" name="electrombileStatus" value="2" >修理中</input>
			              		<input type="radio" name="electrombileStatus" value="3" checked="checked">无法修复</input>
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车报警状态</label>
			              <div class="am-u-sm-9">
			              <c:choose>
			              	<c:when test="${mbile.electrombileAlarmStatus == '0' }">
			              		<input type="radio" name="electrombileAlarmStatus" value="0" checked="checked">正常</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="1" >已报警</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="2" >处理中</input>
			              	</c:when>
			              	<c:when test="${mbile.electrombileAlarmStatus == '1' }">
			              		<input type="radio" name="electrombileAlarmStatus" value="0" >正常</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="1" checked="checked">已报警</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="2" >处理中</input>
			              	</c:when>
			              	<c:otherwise>
			              		<input type="radio" name="electrombileAlarmStatus" value="0" >正常</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="1" >已报警</input>
			              		<input type="radio" name="electrombileAlarmStatus" value="2" checked="checked">处理中</input>
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>			            
				        
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电机编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileElectrical" value="${mbile.electrombileElectrical }" />
			              </div>
			            </div>	        
				        
			           <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电量</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileElectric" value="${mbile.electrombileElectric}" />
			              </div>
			            </div>
			
			            <div class="am-form-group">
			              <div class="am-u-sm-9 am-u-sm-push-3">
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                <button type="submit" class="am-btn am-btn-primary">修改</button>
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
</body>
</html>