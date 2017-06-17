<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!doctype html>
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
						<strong class="am-text-primary am-text-lg">车辆位置显示</strong>
					</div>
				</div>
      			<div class="am-g">
      			  <div class="am-u-sm-12 am-u-md-4 am-u-md-pull-8"></div>
        			<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
						<!--地图div -->
						<div id="allmap" style="width:1050px;height:600px"></div>
					</div>
				</div>
		<!-- content end -->
		</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/jsp/common/floor.jsp" />
</body>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	map.centerAndZoom(new BMap.Point(121.477362,31.23754),12);
	map.enableScrollWheelZoom(true);
	map.disableDragging();     //禁止拖拽
	setTimeout(function(){
	   map.enableDragging();   //两秒后开启拖拽
	   //map.enableInertialDragging();   //两秒后开启惯性拖拽
	}, 2000);
	// 用经纬度设置地图中心点
	var ctx = "${ctx}";
	map.clearOverlays();
	<c:forEach var="bounds" items="${electrombiles}">
		var str = "${bounds.electrombileCoordinate}";
		var content = "车电量剩余："+"${bounds.electrombileElectric}";
		var strs = new Array(); //定义一数组
		strs = str.split(","); //字符分割
		var point = new BMap.Point(strs[0], strs[1]);
		var myIcon = new BMap.Icon(ctx + "/assets/image/mbile.png", new BMap.Size(30, 30));//设置自定义图标
		var marker = new BMap.Marker(point, {icon : myIcon});// 创建标注
		map.addOverlay(marker);// 将标注添加到地图中
		addClickHandler(content,marker);//备注信息
	</c:forEach>
	map.panTo(new_point);
	var opts = {
			width : 60,     // 信息窗口宽度
			height: 50,     // 信息窗口高度
			title : "信息窗口" , // 信息窗口标题
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
</script>
</html>