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
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">车辆管理</strong>
					</div>
				</div>
		      <div class="am-g">
		        <div class="am-u-sm-12 am-u-md-6">
		          <div class="am-btn-toolbar">
		            <div class="am-btn-group am-btn-group-xs">
		              <a href="${ctx}/user/addUserPage" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
		            </div>
		          </div>
		        </div>
		        <div class="am-u-sm-12 am-u-md-3">
		          <div class="am-form-group">
		            <select data-am-selected="{btnSize: 'sm'}">
		              <option value="option1">车辆类型</option>
		              <option value="option2">小型</option>
		              <option value="option2">大型</option>
		            </select>
		          </div>
		        </div>
		        <div class="am-u-sm-12 am-u-md-3">
		          <div class="am-input-group am-input-group-sm">
		            <input type="text" class="am-form-field">
		          <span class="am-input-group-btn">
		            <button class="am-btn am-btn-default" type="button">搜索</button>
		          </span>
		          </div>
		        </div>
		      </div>
      <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-id">序号</th>
                <th class="table-title">电动车编号</th>
                <th class="table-title">报修类型</th>
                <th class="table-type">当前电量</th>
                <th class="table-type">车辆位置</th>
                <th class="table-type">维修状态</th>
                <th class="table-type">维修时间</th>
                <th class="table-type">维修人员</th>
                <th class="table-type">修理结果</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
		            <c:forEach var="repair" items="${repairs}" begin="0" end="15" step="1" varStatus="status">
              			<tr>
              				<th style="display:none">${repair.reparirsId}</th>
	              			<th>${repair.index + 1}</th>
	              			<th>${repair.electrombileNo}</th>
	              			<c:choose>
	              				<c:when test="${repair.reparirsType == '0'}">
	              					<th>开不开锁</th>
	              				</c:when>
	              				<c:when test="${repair.reparirsType == '1'}">
	              					<th>电量不足</th>
	              				</c:when>
	              				<c:when test="${repair.reparirsType == '2'}">
	              					<th>二维码损坏</th>
	              				</c:when>
	              				<c:when test="${repair.reparirsType == '3'}">
	              					<th>车头损坏</th>
	              				</c:when>
	              				<c:when test="${repair.reparirsType == '4'}">
	              					<th>电量不足</th>
	              				</c:when>
	              				<c:when test="${repair.reparirsType == '5'}">
	              					<th>车胎损坏</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>车开不了</th>
	              				</c:otherwise>
	              			</c:choose>
	              			<th class="am-hide-sm-only">${repair.electrombileElectric}</th>
	              			<th class="am-hide-sm-only">${repair.electrombileCoordinate}</th>
	              			<c:choose>
	              				<c:when test="${repair.reparirsStatus == '0'}">
	              					<th>等待维修</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>维修完成</th>
	              				</c:otherwise>
	              			</c:choose>
	              			<th class="am-hide-sm-only">${repair.reparirsDate}</th>
	              			<th class="am-hide-sm-only">${repair.userName}</th>
	              			<th class="am-hide-sm-only">${repair.reparirsResult}</th>
			                <td>
			                  <div class="am-btn-toolbar">
			                    <div class="am-btn-group am-btn-group-xs">
			                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span><a href="${ctx}/mbile/findUserInfo?userId=${user.userId}"> 车辆报警</a></button>
			                    </div>
			                  </div>
			                </td>
						</tr>
					</c:forEach>
	              </tbody>
            </table>
            
            <div class="am-cf">
			共 15 条记录
              <div class="am-fr">
                <ul class="am-pagination">
                  <li class="am-disabled"><a href="#">«</a></li>
                  <li class="am-active"><a href="#">1</a></li>
                  <li><a href="#">2</a></li>
                  <li><a href="#">»</a></li>
                </ul>
              </div>
            </div>
          </form>
          <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
				
			</div>
			
			<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
		</div>
		<!-- content end -->
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
</body>
</html>