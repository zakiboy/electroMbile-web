<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="no-js">
<jsp:include page="/WEB-INF/jsp/common/mapTop.jsp"></jsp:include>
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
						<strong class="am-text-primary am-text-lg">车辆位置信息</strong>
					</div>
				</div>
				<hr/>
      			<div class="am-g">
      			  <div class="am-u-sm-12 am-u-md-4 am-u-md-pull-8"></div>
        			<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
						<!--地图div -->
						<div id="allmap" style="width:1050px;height:600px"></div>
					</div>
				</div>
			</div>
			<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
		</div>
		<!-- content end -->

	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
</body>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	map.centerAndZoom(new BMap.Point(121.477362,31.23754),17);
	map.enableScrollWheelZoom(true);
	map.disableDragging();     //禁止拖拽
	setTimeout(function(){
	   map.enableDragging();   //两秒后开启拖拽
	   //map.enableInertialDragging();   //两秒后开启惯性拖拽
	}, 2000);
	// 用经纬度设置地图中心点
	function theLocation(longitude,latitude){
		var ctx = "${ctx}";
		var content = "车电量剩余："+"${electric}";
		if(longitude != "" && latitude != ""){
			map.clearOverlays(); 
			var new_point = new BMap.Point(longitude,latitude);
			var myIcon= new BMap.Icon(ctx+"/assets/image/mbile.png",new BMap.Size(30,30));//设置自定义图标
			var marker = new BMap.Marker(new_point,{icon:myIcon});// 创建标注
			map.addOverlay(marker);// 将标注添加到地图中
			addClickHandler(content,marker)
			map.panTo(new_point);
		}
	}
	var opts = {
			width : 30,// 信息窗口宽度
			height: 20,// 信息窗口高度
			//title : "信息窗口" , // 信息窗口标题
			enableMessage:true//设置允许信息窗发送短息
		   };
	function addClickHandler(content,marker){
		marker.addEventListener("click",function(e){openInfo(content,e)});
	}
	function openInfo(content,e){
		var p = e.target;
		var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
		var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象 
		map.openInfoWindow(infoWindow,point); //开启信息窗口
	}	
	$(function(){
		var longitude = "${longitude}";
		var latitude = "${latitude}";
		if(null != longitude && "" != longitude && null != latitude && latitude != ""){
			theLocation(longitude,latitude);//调用地图
		}
	});
</script>
</html>