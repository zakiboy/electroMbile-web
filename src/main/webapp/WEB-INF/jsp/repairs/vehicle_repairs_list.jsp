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
                <th class="table-title">电动车电量</th>
                <th class="table-type">电动车状态</th>
                <th class="table-author am-hide-sm-only">电动车类型</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
		            <c:forEach var="mbile" items="${electrombiles}" begin="0" end="15" step="1" varStatus="status">
              			<tr>
              				<th style="display:none">${mbile.electrombileId}</th>
	              			<th>${status.index + 1}</th>
	              			<th>${mbile.electrombileNo}</th>
	              			<th class="am-hide-sm-only">${mbile.electrombileElectric}</th>
	              			<c:choose>
	              				<c:when test="${mbile.electrombileStatus == '0'}">
	              					<th>正常</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>已报修</th>
	              				</c:otherwise>
	              			</c:choose>
	              			<c:choose>
	              				<c:when test="${mbile.electrombileType == '0'}">
	              					<th>小型</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>大型</th>
	              				</c:otherwise>
	              			</c:choose>
			                <td>
			                  <div class="am-btn-toolbar">
			                    <div class="am-btn-group am-btn-group-xs">
			                    <c:choose>
			                    	<c:when test="${mbile.electrombileStatus == '0'}">
			                    		<button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"><a href="${ctx}/mbile/mbileRepairs?mbileId=${mbile.electrombileId}&type=look"> 报修</a></span></button>
			                    	</c:when>
			                    	<c:otherwise>
			                    		车辆已报修
			                    	</c:otherwise>
			                    </c:choose>
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