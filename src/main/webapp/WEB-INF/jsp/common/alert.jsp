<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!-- alert 弹窗 start -->
<div class="am-modal am-modal-alert" tabindex="-1" id="my-alert">
	<div class="am-modal-dialog">
		<div class="am-modal-hd">提示框</div>
		<div class="am-modal-bd">
			<c:choose>
				<c:when test="${!empty msg}">
				      		${msg}
				           </c:when>
				<c:otherwise>
				           	请先保存操作信息！
				           </c:otherwise>
			</c:choose>
		</div>
		<div class="am-modal-footer">
			<span class="am-modal-btn">确定</span>
		</div>
	</div>
</div>
<!-- alert 弹窗 end -->