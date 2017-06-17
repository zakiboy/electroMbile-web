package com.electrombile.core;

public class SystemConstant {
	
	public static final String AUTH_TOKEN_SESSION = "auth_token_http_session";//用户登录session的key值
	public static final String KAPTCHA_SESSION_KEY = "kaptcha_session_code";
	public final static int PAGESIZE = 10; //每页数据
	public final static String initPwd = "123456";//初始密码
	public final  static Integer USER_RULE = 0;
	//cxf返回code
	public final static int BASE_CODE_SUCCESS = 0;//成功
	public final static int BASE_CODE_FAILL= 1;//失败
	//交易渠道
	public final static Integer CHANNEL_TYPE_WEIXIN = 0;//微信支付
	
	//交易类型
	public final static Integer ORDER_TYPE_RIDE = 0;//骑行支付
	public final static Integer ORDER_TYPE_BUY = 1;//购买车辆
	
}
