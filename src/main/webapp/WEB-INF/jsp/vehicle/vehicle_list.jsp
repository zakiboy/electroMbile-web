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
		              <a href="${ctx}/mbile/goMbileAdd" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
		            </div>
		          </div>
		        </div>
		        <form action="${ctx}/mbile/findMbileByNo" method="post">
		        <div class="am-u-sm-12 am-u-md-3">
		          <div class="am-form-group">
		            <select name="type" data-am-selected="{btnSize: 'sm'}">
		              <option value="all">车辆状态</option>
		              <option value="0">未骑行</option>
		              <option value="1">骑行中</option>
		            </select>
		          </div>
		        </div>
		        <div class="am-u-sm-12 am-u-md-3">
		          <div class="am-input-group am-input-group-sm">
		            <input type="text" name="number" class="am-form-field" placeholder="请输入电动车编号...">
		          <span class="am-input-group-btn">
		            <button class="am-btn am-btn-default" type="submit">搜索</button>
		          </span>
		          </div>
		        </div>
		        </form>
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
                <th class="table-type">电动车位置</th>
                <th class="table-author am-hide-sm-only">电动车状态</th>
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
	              			<th>${mbile.electrombileCoordinate}</th>
	              			<c:choose>
	              				<c:when test="${mbile.electrombileType == '0'}">
	              					<th>未骑行</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th><font color="red">骑行中</font></th>
	              				</c:otherwise>
	              			</c:choose>
			                <td>
			                  <div class="am-btn-toolbar">
			                    <div class="am-btn-group am-btn-group-xs">
			                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span><a href="${ctx}/mbile/goMbileUpdate?mbileId=${mbile.electrombileId}"> 编辑</a></button>
			                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span><a href="${ctx}/mbile/mbileDelete?mbileId=${mbile.electrombileId}"> 删除</a></button>
			                    </div>
			                  </div>
			                </td>
						</tr>
					</c:forEach>
	              </tbody>
            </table>
			<jsp:include page="/WEB-INF/jsp/common/page.jsp" />
          </form>
          <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
				
			</div>
			<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
			<jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
		</div>
		<!-- content end -->
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
	<c:if test="${!empty msg}">
		<script src="${ctx }/assets/js/alert/alert.js"></script>
	</c:if>
</body>
</html>