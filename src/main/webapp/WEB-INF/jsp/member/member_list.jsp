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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">会员管理</strong></div>
      </div>
      <hr>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4">
          <div class="am-btn-toolbar">
            <div class="am-btn-group am-btn-group-xs">
              <a href="${ctx }/member/addMember" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
            </div>
          </div>
        </div>
        <div class="am-u-sm-12 am-u-md-3">
          <div class="am-form-group">
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="00">状态</option>
              <option value="0">有效</option>
              <option value="1">无效</option>
            </select>
          </div>
        </div>
        <div class="am-u-sm-12 am-u-md-3">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field" >
          <span class="am-input-group-btn">
            <button class="am-btn am-btn-default" type="button"><a href="${ctx }/member/findMemberInfoByName">搜索</a></button>
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
	                <th class="table-title">会员名称</th>
	                <th class="table-title">性别</th>
	                <th class="table-date am-hide-sm-only">出生日期</th>
	                <th class="table-type">会员手机号</th>
	                <th class="table-author am-hide-sm-only">状态</th>
	                <th class="table-set">操作</th>
	              </tr>
              </thead>
              <tbody>
		         <c:forEach var="member" items="${members}" begin="0" end="15" step="1" varStatus="status">
              				<tr>
	              				<th>${status.index + 1}</th>
	              				<th>${member.memberName}</th>
	              				<th>${member.memberSex}</th>
	              				<th class="am-hide-sm-only">${member.memberBirthday}</th>
	              				<th class="am-hide-sm-only">${member.memberPhone}</th>
	              				<c:choose>
	              					<c:when test="${member.memberStatus == 0}">
	              						<th>有效</th>
	              					</c:when>
	              					<c:otherwise>
	              						<th>无效</th>
	              					</c:otherwise>
	              				</c:choose>
				                <td>
				                  <div class="am-btn-toolbar">
				                    <div class="am-btn-group am-btn-group-xs">
				                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span><a href="${ctx }/member/findMemberInfo?memberId=${member.memberId}"> 编辑</a></button>
				                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span><a href="${ctx }/member/deleteMemberInfo?memberId=${member.memberId}"> 删除</a></button>
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