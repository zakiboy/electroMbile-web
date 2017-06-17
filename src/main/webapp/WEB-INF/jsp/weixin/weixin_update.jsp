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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户修改</strong></div>
      </div>
      <hr/>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>

        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form class="am-form am-form-horizontal" action="${ctx }/user/updateUserInfo" method="post">
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">订单号</label>
              <div class="am-u-sm-9">
              	<input value="${order.orderId}" type="hidden" />
                <input type="text" name="orderNo" value="${order.orderNo}"/>
              </div>
            </div>
          	
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">订单类型</label>
              <div class="am-u-sm-9">
                  <c:choose>
                  	<c:when test="${order.orderType == '0'}">
		                <input type="radio" name="orderType" value="0" checked="checked">骑行支付</input>
		                <input type="radio" name="orderType" value="1">买车支付</input>            			
                  	</c:when>
                  	<c:otherwise>
                  		<input type="radio" name="orderType" value="0">骑行支付</input>
	                    <input type="radio" name="orderType" value="1" checked="checked">买车支付</input>
                  	</c:otherwise>
                  </c:choose>
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">交易渠道</label>
              <div class="am-u-sm-9">
                 <c:choose>
                  	<c:when test="${order.orderChannel == '0'}">
		                <input type="radio" name="orderChannel" value="0" checked="checked">微信</input>
		                <input type="radio" name="orderChannel" value="1">支付宝</input>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="radio" name="orderChannel" value="0">微信</input>
	                    <input type="radio" name="orderChannel" value="1" checked="checked">支付宝</input>
                  	</c:otherwise>
                  </c:choose>
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">订单金额</label>
              <div class="am-u-sm-9">
                <input type="text" name="orderMoney" value="${order.orderMoney}"/>
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">订单日期</label>
              <div class="am-u-sm-9">
                <input type="date" class="am-form-field am-input-sm" name="orderDate" value="${order.orderDate}"/>
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">订单状态</label>
              <div class="am-u-sm-9">
                 <c:choose>
                  	<c:when test="${order.orderStatus == '0'}">
		                <input type="radio" name="orderStatus" value="0" checked="checked">有效</input>             			
                  	</c:when>
                  	<c:otherwise>
	                    <input type="radio" name="orderStatus" value="1" checked="checked">无效</input>  
                  	</c:otherwise>
                  </c:choose>
              </div>
            </div>
            
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">关联会员</label>
              <div class="am-u-sm-9">
                <input type="text" class="am-form-field am-input-sm" name="memberName" value="${order.memberName}"/>
              </div>
            </div>
            
            <div class="am-form-group">
              <div class="am-u-sm-9 am-u-sm-push-3">
                <button type="submit" class="am-btn am-btn-primary">保存</button>
                <button type="button" hidden="hidden" data-am-modal="{target: '#my-alert'}" id="alert" >alert</button>
              </div>
            </div>
          </form>
          <jsp:include page="/WEB-INF/jsp/common/alert.jsp" />
        </div>
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