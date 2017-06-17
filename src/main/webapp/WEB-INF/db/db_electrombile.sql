/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.13 : Database - db_electrombile
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_electrombile` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_electrombile`;

/*Table structure for table `abnormal_move_message` */

DROP TABLE IF EXISTS `abnormal_move_message`;

CREATE TABLE `abnormal_move_message` (
  `abnormal_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '异常移动信息表ID',
  `department_id` int(11) DEFAULT NULL COMMENT '电动车ID',
  `department_electric` varchar(25) DEFAULT NULL COMMENT '车辆电量',
  `department_coordinate` varchar(50) DEFAULT NULL COMMENT '移动前位置',
  `abnormal_date` datetime DEFAULT NULL COMMENT '异常时间',
  `move_coordinate` varchar(50) DEFAULT NULL COMMENT '移动后位置',
  `dispose_date` datetime DEFAULT NULL COMMENT '处理时间',
  `user_id` int(11) DEFAULT NULL COMMENT '处理人',
  `dispose_result` varchar(50) DEFAULT NULL COMMENT '处理结果说明',
  `remark` varchar(25) DEFAULT NULL COMMENT '备注字段',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段',
  PRIMARY KEY (`abnormal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `abnormal_move_message` */

/*Table structure for table `deal_info` */

DROP TABLE IF EXISTS `deal_info`;

CREATE TABLE `deal_info` (
  `deal_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '交易ID',
  `deal_no` varchar(25) DEFAULT NULL COMMENT '交易号',
  `deal_type` int(1) DEFAULT NULL COMMENT '交易类型',
  `deal_date` datetime DEFAULT NULL COMMENT '交易日期',
  `deal_money` decimal(11,2) DEFAULT NULL COMMENT '交易金额',
  `deal_status` int(1) DEFAULT NULL COMMENT '交易状态',
  `order_no` varchar(25) DEFAULT NULL COMMENT '订单号',
  PRIMARY KEY (`deal_id`),
  KEY `ORDER_DEAL_PK` (`order_no`),
  CONSTRAINT `ORDER_DEAL_PK` FOREIGN KEY (`order_no`) REFERENCES `order_info` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `deal_info` */

/*Table structure for table `department_info` */

DROP TABLE IF EXISTS `department_info`;

CREATE TABLE `department_info` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `department_name` varchar(25) DEFAULT NULL COMMENT '部门名称',
  `department_no` varchar(25) DEFAULT NULL COMMENT '部门编号',
  `department_status` char(2) DEFAULT NULL COMMENT '部门状态',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='部门信息表';

/*Data for the table `department_info` */

insert  into `department_info`(`department_id`,`department_name`,`department_no`,`department_status`) values (1,'管理部','GL001','0');

/*Table structure for table `electrombile_alarm_message` */

DROP TABLE IF EXISTS `electrombile_alarm_message`;

CREATE TABLE `electrombile_alarm_message` (
  `alarm_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '报警信息ID',
  `electrombile_id` int(11) DEFAULT NULL COMMENT '电动车ID',
  `alarm_status` int(2) DEFAULT NULL COMMENT '状态0未处理1处理中2已处理',
  `alarm_handle_result` varchar(100) DEFAULT NULL COMMENT '处理结果',
  `alarm_cause` varchar(100) DEFAULT NULL COMMENT '报警原因',
  `alarm_type` int(2) DEFAULT NULL COMMENT '信息类型',
  `remark` varchar(25) DEFAULT NULL COMMENT '备注字段',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段1',
  PRIMARY KEY (`alarm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `electrombile_alarm_message` */

/*Table structure for table `electrombile_info` */

DROP TABLE IF EXISTS `electrombile_info`;

CREATE TABLE `electrombile_info` (
  `electrombile_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电动车ID',
  `electrombile_no` varchar(50) DEFAULT NULL COMMENT '电动车编号',
  `electrombile_repair_status` int(2) DEFAULT NULL COMMENT '报修状态0正常1已报修2修理中3无法修复',
  `electrombile_type` int(2) DEFAULT NULL COMMENT '电动车0未骑行1骑行中',
  `electrombile_longitude` double DEFAULT NULL COMMENT '电动车经度坐标',
  `electrombile_latitude` double DEFAULT NULL COMMENT '电动车纬度坐标',
  `electrombile_electrical` varchar(100) DEFAULT NULL COMMENT '电动车电机',
  `electrombile_electric` varchar(100) DEFAULT NULL COMMENT '电动车电量',
  `electrombile_alarm_status` int(2) DEFAULT NULL COMMENT '报警状态0正常1已报警2处理中',
  `electrombile_status` int(2) DEFAULT NULL COMMENT '有效状态0有效1无效',
  `remark` varchar(25) DEFAULT NULL COMMENT '备注字段',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段1',
  PRIMARY KEY (`electrombile_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `electrombile_info` */

insert  into `electrombile_info`(`electrombile_id`,`electrombile_no`,`electrombile_repair_status`,`electrombile_type`,`electrombile_longitude`,`electrombile_latitude`,`electrombile_electrical`,`electrombile_electric`,`electrombile_alarm_status`,`electrombile_status`,`remark`,`remark1`) values (1,'CSJQ123',1,0,121.472188,31.244085,'5165465','25%',0,1,NULL,NULL),(2,'CSJQ456',0,0,121.449192,31.236305,'516546534','15%',0,0,NULL,NULL),(3,'CSJQ789',0,0,121.446604,31.215801,'51654650','10%',0,0,NULL,NULL),(4,'CSJQ110',0,1,121.449192,31.217036,'516546500','5%',0,0,NULL,NULL),(5,'CSJQ111',0,1,121.502802,31.227042,'516546567','10%',0,0,NULL,NULL),(6,'CSJQ112',0,1,121.485842,31.238404,'516546534','25%',0,0,NULL,NULL),(7,'CSJQ122',1,1,121.489292,31.231118,'516546512','30%',0,0,NULL,NULL),(8,'CSJQ198',0,0,121.495903,31.233835,'516546599','10%',0,0,NULL,NULL),(9,'CSJQ177',0,0,121.479375,31.240133,'5165465113','10',0,0,NULL,NULL),(10,'CSJQ166',0,0,121.486202,31.234391,'5165465993','10',0,0,NULL,NULL);

/*Table structure for table `member_info` */

DROP TABLE IF EXISTS `member_info`;

CREATE TABLE `member_info` (
  `member_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员ID',
  `nickname` varchar(25) DEFAULT NULL COMMENT '用户的昵称',
  `openid` varchar(50) DEFAULT NULL COMMENT '用户的标识，对当前公众号唯一',
  `sex` int(2) DEFAULT NULL COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
  `city` varchar(20) DEFAULT NULL COMMENT '用户所在城市',
  `country` varchar(20) DEFAULT NULL COMMENT '用户所在国家',
  `province` varchar(20) DEFAULT NULL COMMENT '电动车ID',
  `subscribe` int(1) DEFAULT NULL COMMENT '用户所在省份',
  `language` char(5) DEFAULT NULL COMMENT '用户的语言，简体中文为zh_CN',
  `headimgurl` varchar(150) DEFAULT NULL COMMENT '用户头像URL，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像）,用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。',
  `subscribe_time` datetime DEFAULT NULL COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
  `unionid` int(2) DEFAULT NULL COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
  `remark` varchar(25) DEFAULT NULL COMMENT '公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注',
  `groupid` int(2) DEFAULT NULL COMMENT '用户所在的分组ID（兼容旧的用户分组接口）',
  `tagid_list` int(2) DEFAULT NULL COMMENT '用户被打上的标签ID列表',
  `name` varchar(25) DEFAULT NULL COMMENT '会员姓名',
  `phone` char(11) DEFAULT NULL COMMENT '会员手机号',
  `email` varchar(25) DEFAULT NULL COMMENT '会员邮箱',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `adress` varchar(50) DEFAULT NULL COMMENT '地址',
  `status` int(2) DEFAULT NULL COMMENT '状态0有效1无效',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员信息表';

/*Data for the table `member_info` */

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `order_type` bigint(2) DEFAULT NULL COMMENT '订单类型',
  `order_money` decimal(11,2) DEFAULT NULL COMMENT '订单金额',
  `order_date` datetime DEFAULT NULL COMMENT '订单日期',
  `order_channel` bigint(2) DEFAULT NULL COMMENT '交易渠道',
  `order_status` bigint(2) DEFAULT NULL COMMENT '订单状态',
  `member_id` int(11) DEFAULT NULL COMMENT '会员ID',
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `ORDER_MEMBER_UNIQUE_PK` (`member_id`),
  UNIQUE KEY `ORDER_NO_PK` (`order_no`),
  CONSTRAINT `ORDER_MEMBER_PK` FOREIGN KEY (`member_id`) REFERENCES `member_info` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表';

/*Data for the table `order_info` */

/*Table structure for table `pledge_cash` */

DROP TABLE IF EXISTS `pledge_cash`;

CREATE TABLE `pledge_cash` (
  `pledge_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '押金表ID',
  `pledge_money` decimal(11,2) DEFAULT NULL COMMENT '押金金额',
  `pledge_usable` decimal(11,2) DEFAULT NULL COMMENT '可用金额',
  `pledge_date` datetime DEFAULT NULL COMMENT '押金日期',
  `member_id` int(11) DEFAULT NULL COMMENT '会员ID',
  `user_id` int(11) DEFAULT NULL COMMENT '操作人员',
  PRIMARY KEY (`pledge_id`),
  UNIQUE KEY `PLEDGE_MEMBER_UNIQUE_PK` (`member_id`),
  CONSTRAINT `PLEDGE_MEMBER_PK` FOREIGN KEY (`member_id`) REFERENCES `member_info` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户押金信息表';

/*Data for the table `pledge_cash` */

/*Table structure for table `repairs_message` */

DROP TABLE IF EXISTS `repairs_message`;

CREATE TABLE `repairs_message` (
  `reparirs_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '保修表ID',
  `reparirs_type` int(2) DEFAULT NULL COMMENT '报修类型0开不开锁1电量不足2二维码损坏3车头损坏4电量不足5车胎损坏6车开不了',
  `reparirs_describe` varchar(100) DEFAULT NULL COMMENT '报修原因描述',
  `reparirs_result` varchar(100) DEFAULT NULL COMMENT '修理结果',
  `department_id` int(11) DEFAULT NULL COMMENT '电动车ID',
  `reparirs_electric` varchar(0) DEFAULT NULL COMMENT '当前电量',
  `member_openId` varchar(30) DEFAULT NULL COMMENT '报修人员openID',
  `reparirs_date` datetime DEFAULT NULL COMMENT '维修时间',
  `user_id` int(11) DEFAULT NULL COMMENT '维修人员ID',
  `reparirs_status` int(2) DEFAULT NULL COMMENT '维修状态',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段1',
  PRIMARY KEY (`reparirs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `repairs_message` */

/*Table structure for table `riding_record` */

DROP TABLE IF EXISTS `riding_record`;

CREATE TABLE `riding_record` (
  `riding_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录表',
  `member_open_id` varchar(50) DEFAULT NULL COMMENT '会员openID',
  `department_id` int(11) DEFAULT NULL COMMENT '车辆ID',
  `riding_start_date` datetime DEFAULT NULL COMMENT '骑行开始时间',
  `riding_end_date` datetime DEFAULT NULL COMMENT '骑行结束时间',
  `riding_start` varchar(50) DEFAULT NULL COMMENT '骑行起始坐标',
  `riding_end` varchar(50) DEFAULT NULL COMMENT '骑行结束坐标',
  `remark` varchar(25) DEFAULT NULL COMMENT '备注字段',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段1',
  PRIMARY KEY (`riding_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `riding_record` */

/*Table structure for table `route_info` */

DROP TABLE IF EXISTS `route_info`;

CREATE TABLE `route_info` (
  `route_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '行程ID',
  `route_count` decimal(11,2) DEFAULT NULL COMMENT '行程公里数',
  `route_start` varchar(50) DEFAULT NULL COMMENT '行程起点',
  `route_end` varchar(50) DEFAULT NULL COMMENT '行程终点',
  `start_date` datetime DEFAULT NULL COMMENT '开始时间',
  `end_date` datetime DEFAULT NULL COMMENT '结束时间',
  `route_time` decimal(11,2) DEFAULT NULL COMMENT '行程使用时间',
  `member_id` int(11) DEFAULT NULL COMMENT '会员ID',
  PRIMARY KEY (`route_id`),
  UNIQUE KEY `MEMBER_ROUTE_UNIQUE_PK` (`member_id`),
  CONSTRAINT `MEMBER_ROUTE_PK` FOREIGN KEY (`member_id`) REFERENCES `member_info` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户行程信息表';

/*Data for the table `route_info` */

/*Table structure for table `rule_info` */

DROP TABLE IF EXISTS `rule_info`;

CREATE TABLE `rule_info` (
  `rule_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rule_name` varchar(25) DEFAULT NULL COMMENT '角色名称',
  `rule_url` varchar(100) DEFAULT NULL COMMENT '角色菜单连接地址',
  `rule_url_menu` varchar(300) DEFAULT NULL COMMENT '角色菜单地址集合',
  `rule_belong` int(2) DEFAULT NULL COMMENT '角色父级',
  `rule_rank` int(2) DEFAULT NULL COMMENT '角色排名',
  `rule_status` int(2) DEFAULT NULL COMMENT '角色状态',
  `rule_code` int(2) DEFAULT NULL COMMENT '角色代码',
  PRIMARY KEY (`rule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='角色信息表';

/*Data for the table `rule_info` */

insert  into `rule_info`(`rule_id`,`rule_name`,`rule_url`,`rule_url_menu`,`rule_belong`,`rule_rank`,`rule_status`,`rule_code`) values (1,'用户角色管理','menu/queryMenuChildren',NULL,0,0,0,1),(2,'用户权限','user/queryUserList','user/queryUserList,user/findUserInfo,user/updateUserRule,user/addUserPage,user/addUserInfo,user/updateUserInfo,user/deleteUserInfo',1,1,0,NULL),(3,'部门管理','depart/queryDepartList','depart/queryDepartList,depart/addDepartInfo,depart/findDepartInfo,depart/queryDepart,depart/updateOrder,depart/deleteOrder,depart/addDepart',1,2,0,NULL),(4,'组织架构','/juese.html',NULL,1,3,0,NULL),(5,'支付管理','menu/queryMenuChildren',NULL,0,0,0,2),(6,'微信支付','/juese.html',NULL,2,1,0,NULL),(7,'押金退还管理','/juese.html',NULL,2,2,0,NULL),(8,'会员管理','menu/queryMenuChildren',NULL,0,0,0,3),(9,'会员管理','member/queryMemberList','member/queryMemberList,member/queryMemberInfo,member/findMemberInfo,member/addMemberInfo,member/updateMemberInfo,member/deleteMemberInfo,member/addMember',3,1,0,NULL),(10,'订单管理','order/queryOrderList','order/queryOrderList,order/findOderInfo,order/queryOrder,order/updateOrder,order/deleteOrder,order/addOrder',3,2,0,NULL),(11,'车辆管理','menu/queryMenuChildren',NULL,0,0,0,4),(12,'全局车辆管理','mbile/queryPageList?pageNo=1','mbile/queryPageList,mbile/findMbileByNo,mbile/goMbileUpdate,mbile/mbileUpdate,mbile/goMbileAdd,mbile/mbileAdd',4,1,0,NULL),(13,'车辆位置显示','mbile/queryLocationList','mbile/queryLocationList,mbile/mbileLocation',4,2,0,NULL),(14,'报修管理','mbile/mbileRepairsList','mbile/mbileRepairsList,mbile/mbileRepairs',4,3,0,NULL),(15,'车辆异常移动报警','mbile/mbileMoveList','mbile/mbileMoveList',4,4,0,NULL),(16,'统计报表','menu/queryMenuChildren',NULL,0,0,0,5),(17,'订单统计','order/queryOrderList',NULL,5,1,0,NULL),(18,'销售额统计','/juese.html',NULL,5,2,0,NULL),(19,'基础配置','menu/queryMenuChildren',NULL,0,0,0,6),(20,'车辆低电量管理','mbile/lowElectricQuery','mbile/lowElectricQuery',4,5,0,NULL);

/*Table structure for table `send_message` */

DROP TABLE IF EXISTS `send_message`;

CREATE TABLE `send_message` (
  `send_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `send_phone` varchar(11) DEFAULT NULL COMMENT '发送手机号',
  `send_content` varchar(150) DEFAULT NULL COMMENT '发送内容',
  `send_date` datetime DEFAULT NULL COMMENT '发送日期',
  `send_type` int(2) DEFAULT NULL COMMENT '短信类型',
  PRIMARY KEY (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `send_message` */

/*Table structure for table `tb_point` */

DROP TABLE IF EXISTS `tb_point`;

CREATE TABLE `tb_point` (
  `timestamp` date NOT NULL COMMENT '时间戳',
  `point` point NOT NULL COMMENT '经纬度',
  `type` char(20) CHARACTER SET utf8 DEFAULT '' COMMENT '点类型',
  `name` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '点名称',
  `introduce` text CHARACTER SET utf8 COMMENT '介绍，包含文字、视频、目录，json格式',
  `attention` int(5) NOT NULL DEFAULT '0' COMMENT '关注人数',
  `score` tinyint(2) NOT NULL DEFAULT '0' COMMENT '评分，用于协同过滤推荐',
  `status` tinyint(2) NOT NULL DEFAULT '2' COMMENT '状态，用于管理员添加',
  `uri` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '维基uri',
  PRIMARY KEY (`timestamp`,`point`(25)),
  KEY `index_timestamp` (`timestamp`) USING BTREE,
  KEY `index_name` (`name`) USING HASH
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `tb_point` */

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_sex` char(2) DEFAULT NULL COMMENT '用户性别',
  `user_name` varchar(25) DEFAULT NULL COMMENT '用户名称',
  `user_password` varchar(25) DEFAULT NULL COMMENT '用户密码',
  `user_phone` char(11) DEFAULT NULL COMMENT '联系方式',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户生日',
  `user_job_number` varchar(25) DEFAULT NULL COMMENT '用户工号',
  `user_entry_date` datetime DEFAULT NULL COMMENT '入职日期',
  `user_rule_belong` int(2) DEFAULT NULL COMMENT '用户角色',
  `user_status` bigint(2) DEFAULT NULL COMMENT '用户状态',
  `department_id` int(11) DEFAULT NULL COMMENT '用户部门ID',
  `department_name` varchar(25) DEFAULT NULL COMMENT '职位名称',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `user_info` */

insert  into `user_info`(`user_id`,`user_sex`,`user_name`,`user_password`,`user_phone`,`user_birthday`,`user_job_number`,`user_entry_date`,`user_rule_belong`,`user_status`,`department_id`,`department_name`) values (1,'男','admin','admin123','13123564556','1990-12-31 12:27:10','admin','2010-01-01 12:27:31',0,0,1,'管理部'),(4,'男','ceshi','123','13265478965','1990-12-01 00:00:00','C001','2017-08-09 00:00:00',1,0,1,'员工'),(5,'男','ceshi1','123','13625647895','1990-12-01 00:00:00','C002','2017-08-09 00:00:00',1,0,1,'员工'),(6,'男','ceshi2','123','13625647812','1990-12-10 00:00:00','C003','2017-12-12 00:00:00',1,0,1,'员工');

/*Table structure for table `user_menu` */

DROP TABLE IF EXISTS `user_menu`;

CREATE TABLE `user_menu` (
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单id',
  `menu_url` varchar(300) DEFAULT NULL COMMENT '菜单url',
  `remark1` varchar(25) DEFAULT NULL COMMENT '备注字段1',
  `remark2` varchar(25) DEFAULT NULL COMMENT '备注字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_menu` */

insert  into `user_menu`(`user_id`,`menu_id`,`menu_url`,`remark1`,`remark2`) values (1,1,NULL,NULL,NULL),(1,2,NULL,NULL,NULL),(1,3,NULL,NULL,NULL),(1,4,NULL,NULL,NULL),(4,1,NULL,NULL,NULL),(4,3,NULL,NULL,NULL),(4,4,NULL,NULL,NULL),(4,5,NULL,NULL,NULL),(4,6,NULL,NULL,NULL),(4,7,NULL,NULL,NULL),(4,8,NULL,NULL,NULL),(4,9,NULL,NULL,NULL),(4,10,NULL,NULL,NULL),(4,11,NULL,NULL,NULL),(4,12,NULL,NULL,NULL),(4,13,NULL,NULL,NULL),(4,14,NULL,NULL,NULL),(4,15,NULL,NULL,NULL),(4,16,NULL,NULL,NULL),(4,17,NULL,NULL,NULL),(4,18,NULL,NULL,NULL),(5,1,NULL,NULL,NULL),(5,3,NULL,NULL,NULL),(5,4,NULL,NULL,NULL),(5,5,NULL,NULL,NULL),(5,6,NULL,NULL,NULL),(5,7,NULL,NULL,NULL),(5,8,NULL,NULL,NULL),(5,9,NULL,NULL,NULL),(5,10,NULL,NULL,NULL),(6,1,NULL,NULL,NULL),(6,3,NULL,NULL,NULL),(6,4,NULL,NULL,NULL),(6,5,NULL,NULL,NULL),(6,6,NULL,NULL,NULL),(6,7,NULL,NULL,NULL),(6,8,NULL,NULL,NULL),(6,9,NULL,NULL,NULL),(6,10,NULL,NULL,NULL),(6,11,NULL,NULL,NULL),(6,12,NULL,NULL,NULL),(6,13,NULL,NULL,NULL),(6,14,NULL,NULL,NULL),(6,15,NULL,NULL,NULL),(6,20,NULL,NULL,NULL),(6,16,NULL,NULL,NULL),(6,17,NULL,NULL,NULL),(6,18,NULL,NULL,NULL),(6,19,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
