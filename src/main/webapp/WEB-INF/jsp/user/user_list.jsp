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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户管理</strong></div>
      </div>
      <hr>
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
              <option value="option1">所有部门</option>
              <option value="option2">管理部</option>
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
                <th class="table-title">账号</th>
                <th class="table-title">用户工号</th>
                <th class="table-title">联系方式</th>
                <th class="table-type">状态</th>
                <th class="table-author am-hide-sm-only">性别</th>
                <th class="table-date am-hide-sm-only">出生日期</th>
                <th class="table-date am-hide-sm-only">入职日期</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
		            <c:forEach var="user" items="${users}" begin="0" end="15" step="1" varStatus="status">
              			<tr>
              				<th style="display:none">${user.userId}</th>
	              			<th>${status.index + 1}</th>
	              			<th>${user.userName}</th>
	              			<th class="am-hide-sm-only">${user.userJobNumber}</th>
	              			<th class="am-hide-sm-only">${user.userPhone}</th>
	              			<c:choose>
	              				<c:when test="${user.userStatus == '0'}">
	              					<th>有效</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>无效</th>
	              				</c:otherwise>
	              			</c:choose>
	              			<c:choose>
	              				<c:when test="${user.userSex == '男'}">
	              					<th>男</th>
	              				</c:when>
	              				<c:otherwise>
	              					<th>女</th>
	              				</c:otherwise>
	              			</c:choose>
	              			<th class="am-hide-sm-only">${user.userBirthday}</th>
	              			<th class="am-hide-sm-only">${user.userEntryDate}</th>
			                <td>
			                  <div class="am-btn-toolbar">
			                    <div class="am-btn-group am-btn-group-xs">
			                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span><a href="${ctx }/user/findUserInfo?userId=${user.userId}"> 编辑</a></button>
			                      <c:choose>
			                      	<c:when test="${user.userRuleBelong != 0}">
			                      		<button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span><a href="${ctx }/user/updateUserRule?userId=${user.userId}"> 权限</a></button>
			                      	</c:when>
			                      </c:choose>
			                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span><a href="${ctx }/user/deleteUserInfo?userId=${user.userId}"> 删除</a></button>
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
		<jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
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