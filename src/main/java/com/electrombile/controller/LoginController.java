package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.RuleInfo;
import com.electrombile.model.UserInfo;
import com.electrombile.request.RuleSession;
import com.electrombile.request.UserSession;
import com.electrombile.service.RuleInfoService;
import com.electrombile.service.UserInfoService;
import com.electrombile.service.UserMenuService;

/**
 * @author admin
 *
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

	@Autowired
	private UserInfoService userService;
	@Autowired
	private RuleInfoService ruleService;
	@Autowired
	private UserMenuService menuService;
	
	
	/**
	 * @param username
	 * @param password
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "loginCheck")
	public ModelAndView loginCheck(HttpServletRequest request,@RequestParam("username")String username,
			@RequestParam("password")String password,HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		String msg = "";
		if (null == username || username.equals("")) {
			msg = "用户名为空!";
		}else if(null == password || password.equals("")){
			msg = "密码为空!";
		}
		UserInfo user = userService.findUserByName(username);
		if (null == user) {
			msg = "用户名错误！";
			modelAndView.setViewName("login");
		}else{
			if (password.equals(user.getUserPassword())) {
				UserSession existUser = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
				if (null != existUser && existUser.getUserName().equals(user.getUserName())) {
					msg = "用户已登录！";
					modelAndView.setViewName("login");
				}else {
					UserSession userSession = new UserSession();
					BeanUtils.copyProperties(user, userSession);
					
					List<RuleInfo> rules = null;
					if (user.getUserRuleBelong() == SystemConstant.USER_RULE) {
						rules = ruleService.queryListForMenu();
					}else{
						List ids = menuService.queryMenuListByUser(user.getUserId());
						rules = ruleService.findRuleListByRuleId(ids);
					}
					List<RuleSession> ruleSessions = null;
					if (null  != rules && rules.size() > 0) {
						//父级菜单
						ruleSessions = new ArrayList<RuleSession>();
						for (RuleInfo rule:rules) {
							if (rule.getRuleBelong() == 0) {
								RuleSession ruleSession = new RuleSession();
								BeanUtils.copyProperties(rule, ruleSession);
								ruleSessions.add(ruleSession);
							}
						}
					}
					userSession.setRuleList(ruleSessions);
					request.getSession().setAttribute(SystemConstant.AUTH_TOKEN_SESSION, userSession);//设置用户session信息
					modelAndView.addObject("user", userSession);
					modelAndView.setViewName("main");
				}
			}else{
				msg = "用户密码错误！";
				modelAndView.setViewName("login");
			}
		}
		modelAndView.addObject("msg",msg);
		return modelAndView;
	}
	
	/**
	 * 用户登出
	 * **/
	@RequestMapping(value = "loginOut")
	public ModelAndView loginOut(HttpSession httpSession){
		ModelAndView model = new ModelAndView();
		httpSession.invalidate();
		model.setViewName("login");
		return model;
	}

}
