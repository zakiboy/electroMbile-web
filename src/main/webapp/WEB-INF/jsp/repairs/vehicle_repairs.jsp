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
			          <form class="am-form am-form-horizontal" method="post">
						<input type="hidden" name="electrombileId" value="${mbile.electrombileId }"/>
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileNo" value="${mbile.electrombileNo }" readonly="readonly" />
			              </div>
			            </div>
			
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车坐标</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileCoordinate" value="${mbile.electrombileCoordinate }" readonly="readonly" />
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车类型</label>
			              <div class="am-u-sm-9">
			               <c:choose>
			              	<c:when test="${mbile.electrombileType == 0 }">
			              		<input type="text" name="electrombileType" value="小型" readonly="readonly" />
			              	</c:when>
			              	<c:otherwise>
			              		<input type="text" name="electrombileType" value="大型" readonly="readonly" />
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>
			            
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车状态</label>
			              <div class="am-u-sm-9">
			              <c:choose>
			              	<c:when test="${mbile.electrombileStatus == 0 }">
			              		<input type="text" name="electrombileStatus" value="正常" checked="checked"/>
			              	</c:when>
			              	<c:when test="${mbile.electrombileStatus == 1 }">
			              		<input type="text" name="electrombileStatus" value="已报修" checked="checked"/>
			              	</c:when>
			              	<c:when test="${mbile.electrombileStatus == 2 }">
			              		<input type="text" name="electrombileStatus" value="修理中" checked="checked"/>
			              	</c:when>
			              	<c:otherwise>
			              		<input type="text" name="electrombileStatus" value="无法修复" checked="checked"/>
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>
				        
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车状态</label>
			              <div class="am-u-sm-9">
			              <c:choose>
			              	<c:when test="${mbile.electrombileAlarmStatus == 0 }">
			              		<input type="text" name="electrombileStatus" value="正常" checked="checked"/>
			              	</c:when>
			              	<c:when test="${mbile.electrombileAlarmStatus == 1 }">
			              		<input type="text" name="electrombileStatus" value="已报警" checked="checked" />
			              	</c:when>
			              	<c:otherwise>
			              		<input type="text" name="electrombileStatus" value="处理中" checked="checked"/>
			              	</c:otherwise>
			              </c:choose>
			              </div>
			            </div>
				        
			            <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电机编号</label>
			              <div class="am-u-sm-9">
			                <input type="text" class="am-form-field am-input-sm" name="electrombileElectrical" value="${mbile.electrombileElectrical }" readonly="readonly" />
			              </div>
			            </div>	        
				        
			           <div class="am-form-group">
			              <label for="user-name" class="am-u-sm-3 am-form-label">电动车电量</label>
			              <div class="am-u-sm-9">
			                <input type="text" name="electrombileElectric" readonly="readonly" value="${mbile.electrombileElectric}" />
			              </div>
			            </div>
			
			            <div class="am-form-group">
			              <div class="am-u-sm-9 am-u-sm-push-3">
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                <a href="${ctx }/mbile/mbileRepairs?mbileId=${mbile.electrombileId}&type=repairs">
			                <button type="button" class="am-btn am-btn-primary">报修</button></a>
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