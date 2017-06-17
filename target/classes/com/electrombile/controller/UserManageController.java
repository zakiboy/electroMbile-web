package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.DepartmentInfo;
import com.electrombile.model.RuleInfo;
import com.electrombile.model.UserInfo;
import com.electrombile.request.ChildrenRule;
import com.electrombile.request.RuleSession;
import com.electrombile.request.UserSession;
import com.electrombile.response.UserResponse;
import com.electrombile.service.DepartmentInfoService;
import com.electrombile.service.RuleInfoService;
import com.electrombile.service.UserInfoService;
import com.electrombile.utils.DateUtils;


/**
 * @author admin
 *
 */
@Controller
@RequestMapping(value = "user")
public class UserManageController {
	
	@Autowired
	private UserInfoService userService;
	@Autowired
	private RuleInfoService ruleservice;
	@Autowired
	private DepartmentInfoService deparService;
	
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryUserList")
	public ModelAndView queryUserList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		UserInfo userInfo = new UserInfo();
		List<UserInfo> userInfos = userService.queryList(userInfo);
		List<UserResponse> users = new ArrayList<UserResponse>();
		if (null != userInfos && userInfos.size() > 0) {
			for (UserInfo us:userInfos) {
				UserResponse ur = new UserResponse();
				BeanUtils.copyProperties(us, ur);
				ur.setUserStatus(us.getUserStatus().toString());
				ur.setUserBirthday(DateUtils.setUtilDateToString(us.getUserBirthday()));
				ur.setUserEntryDate(DateUtils.setUtilDateToString(us.getUserEntryDate()));
				users.add(ur);
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("users", users);
		modelAndView.setViewName("user/user_list");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "findUserInfo")
	public ModelAndView findUserRule(HttpServletRequest request,@RequestParam("userId")String userId){
		ModelAndView modelAndView = new ModelAndView();
		UserInfo userInfo = userService.loadUserInfo(Integer.valueOf(userId));
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(userInfo, userResponse);
		userResponse.setUserBirthday(DateUtils.setUtilDateToString(userInfo.getUserBirthday()));
		userResponse.setUserEntryDate(DateUtils.setUtilDateToString(userInfo.getUserEntryDate()));
		userResponse.setUserStatus(userInfo.getUserStatus().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		List<RuleInfo> ruleList = ruleservice.queryListForMenu();//查询出所有菜单
		List<RuleSession> menuList = new ArrayList<RuleSession>();
		for (RuleInfo rule:ruleList) {
			RuleSession re = new RuleSession();
			BeanUtils.copyProperties(rule, re);
			menuList.add(re);
		}
		modelAndView.addObject("userResponse", userResponse);
		modelAndView.setViewName("user/user_update");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateUserRule")
	public ModelAndView updateUserRule(HttpServletRequest request,@RequestParam("userId")String userId){
		ModelAndView modelAndView = new ModelAndView();
		UserInfo userInfo = userService.loadUserInfo(Integer.valueOf(userId));
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(userInfo, userResponse);
		userResponse.setUserBirthday(DateUtils.setUtilDateToString(userInfo.getUserBirthday()));
		userResponse.setUserEntryDate(DateUtils.setUtilDateToString(userInfo.getUserEntryDate()));
		userResponse.setUserStatus(userInfo.getUserStatus().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		List<RuleInfo> ruleList = ruleservice.queryAllListForMenu();//查询出所有菜单
		List<RuleInfo> userRule = ruleservice.queryListForMenuByUser(Integer.valueOf(userId));
		List<RuleSession> menuList = new ArrayList<RuleSession>();
		for (RuleInfo rule:ruleList) {
			if (userInfo.getUserRuleBelong() == SystemConstant.USER_RULE) {
				rule.setOwner(0);
			}else {
				rule.setOwner(1);
				if (null != userRule && userRule.size() > 0) {
					for (RuleInfo rf:userRule) {
						if (rf.getRuleId() == rule.getRuleId()) {
							rule.setOwner(0);
						}
					}
				}
			}
			if (rule.getRuleCode() != null) {
				RuleSession ruleSession = new RuleSession();
				BeanUtils.copyProperties(rule, ruleSession);
				menuList.add(ruleSession);
			}
		}
		
		if (null != menuList && menuList.size() > 0) {
			for (int i = 0; i < menuList.size(); i++) {
				List<ChildrenRule> childrens = new ArrayList<ChildrenRule>();
				for (RuleInfo rif:ruleList) {
					if (rif.getRuleBelong() == menuList.get(i).getRuleCode()) {
						ChildrenRule children = new ChildrenRule();
						BeanUtils.copyProperties(rif, children);
						childrens.add(children);
					}
				}
				menuList.get(i).setChildrens(childrens);
			}
		}
		modelAndView.addObject("menuList", menuList);
		modelAndView.addObject("userResponse", userResponse);
		modelAndView.setViewName("user/user_rule");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "addUserPage")
	public ModelAndView addUserInfo(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		List<DepartmentInfo> departs = deparService.queryList(new DepartmentInfo());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("departs", departs);
		modelAndView.setViewName("user/user_add");
		return modelAndView;
	}	
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "addUserInfo")
	public ModelAndView addUserInfo(HttpServletRequest request,@PathParam("userResponse")UserResponse userResponse){
		ModelAndView modelAndView = new ModelAndView();
		String msg = "";
		boolean isDate = DateUtils.checkDateFormat(userResponse.getUserBirthday());
		boolean isDateFormat = DateUtils.checkDateFormat(userResponse.getUserEntryDate());
		if (isDate && isDateFormat) {
			UserInfo userInfo = new UserInfo();
			BeanUtils.copyProperties(userResponse, userInfo);
			userInfo.setUserBirthday(DateUtils.setStringToUtilDate(userResponse.getUserBirthday()));
			userInfo.setUserEntryDate(DateUtils.setStringToUtilDate(userResponse.getUserEntryDate()));
			userInfo.setUserStatus(Integer.valueOf(userResponse.getUserStatus()));
			int num = userService.insertUserInfo(userInfo);
			if (num > 0) {
				msg = "新增成功,请去管理页面设置用户登录菜单!";
			}else {
				msg = "新增失败！";
			}
		}else {
			msg = "日期格式错误！请重新输入！";
		}
		modelAndView.addObject("msg", msg);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/user_add");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateUserInfo")
	public ModelAndView updateUserInfo(HttpServletRequest request,@RequestParam("user")UserResponse userResponse){
		ModelAndView modelAndView = new ModelAndView();
		UserInfo userInfo = new UserInfo();
		BeanUtils.copyProperties(userResponse, userInfo);
		userInfo.setUserBirthday(DateUtils.setStringToUtilDate(userResponse.getUserBirthday()));
		userInfo.setUserEntryDate(DateUtils.setStringToUtilDate(userResponse.getUserEntryDate()));
		userInfo.setUserStatus(Integer.valueOf(userResponse.getUserStatus()));
		int num = userService.updateUserInfo(userInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "修改成功！");
		}else {
			modelAndView.addObject("msg", "修改失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/user_update");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "deleteUserInfo")
	public ModelAndView deleteUserInfo(HttpServletRequest request,@RequestParam("userId")String userId){
		ModelAndView modelAndView = new ModelAndView();
		int num = userService.deleteUserInfo(Integer.valueOf(userId));
		if (num > 0) {
			modelAndView.addObject("msg", "删除成功！");
		}else {
			modelAndView.addObject("msg", "删除失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/user_list");
		return modelAndView;
	}
	
}
