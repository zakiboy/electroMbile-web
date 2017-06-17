<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!-- sidebar start -->
<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
	<div class="am-offcanvas-bar admin-offcanvas-bar">
		<ul class="am-list admin-sidebar-list" id="collapase-nav-one">
			<li><a href="#/"><span class="am-icon-home"></span> 首页</a></li>
	
			<c:forEach var="rule" items="${user.ruleList}" begin="0" step="1" varStatus="status">
				<li class="admin-parent">
					<a class="am-cf" href="${ctx}/${rule.ruleUrl}?menuId=${rule.ruleCode}" data-am-collapse="{target: '##collapse-nav${status.index + 1}'}">
						<span class="am-icon-file"></span> ${rule.ruleName} <span class="am-icon-angle-right am-fr am-margin-right"></span>
					</a>
						<c:choose>
							<c:when test="${!empty rule.childrens}">
								<ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav${status.index + 1}">
									<c:forEach var="children" items="${rule.childrens}" begin="0" step="1">
										<li>
											<li><a href="${ctx }/${children.ruleUrl}"><span class="am-icon-th"></span> ${children.ruleName}</a></li>
										</li>
									</c:forEach>
								</ul>
							</c:when>
						</c:choose>
				</li>
		</c:forEach>
		</ul>
	</div>
</div>
<!-- sidebar end -->