<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<div class="am-cf">
	<c:if test="${!empty pagination}">
		共 ${pagination.totalCount}条记录   共${pagination.totalPages}页
	</c:if>
	<div class="am-fr">
		<ul class="am-pagination">
			<c:forEach items="${pagination.paginationlist}" begin="0" end="4" step="1" var="page">
				<c:choose>
					<c:when test="${page == 1}">
						<li class="am-disabled"><a href="#">«</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="#">«</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page == pagination.pageNo}">
						<li class="am-active"><a href="#">${page}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="#">${page}</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page == pagination.totalCount}">
						<li class="am-disabled"><a href="#">»</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="#">»</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>

		</ul>
	</div>
</div>
