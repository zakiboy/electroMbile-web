package com.electrombile.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.request.UserSession;
import com.electrombile.service.UserMenuService;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Autowired
	private UserMenuService menuService;

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//获取用户信息
		 //获取Session
        String url = request.getRequestURI();
        UserSession user = (UserSession)request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
        if (null != user) {
        	if (user.getUserRuleBelong() == SystemConstant.USER_RULE) {
				return true;
			}else {
	            //获取请求的URL
	            List<String> menus = menuService.queryCheckMenuByUserId(user.getUserId());
	            if(url.contains("index") || url.contains("loginCheck") || url.contains("loginOut") 
	            		|| url.contains("assets") || url.contains("404") || url.contains("queryMenuChildren")){
					return true;
				}else if (null != menus && menus.size() > 0) {
		            //检查用户是否有权限访问菜单
					for (String str:menus) {
						String[] urls = str.split(",");
						for (String menu:urls) {
							if (url.contains(menu.trim())) {//有权限访问
								return true;
							}
						}
					}
				}else{
					response.sendRedirect(request.getContextPath() + "/404");
					return false;
				}
			}
		}else if (url.contains("index") || url.contains("loginCheck") || url.contains("404")
				|| url.contains("loginOut") || url.contains("assets")) {
			return true;
		}
        //不符合条件的，跳转到登录界面
        response.sendRedirect(request.getContextPath() + "/index");
        return false;
	}

}
