package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.RuleInfo;
import com.electrombile.model.UserInfo;
import com.electrombile.model.UserMenu;
import com.electrombile.request.ChildrenRule;
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
@RequestMapping(value = "menu")
public class RuleController {

	@Autowired
	private RuleInfoService ruleService;
	@Autowired
	private UserMenuService menuService;
	@Autowired
	private RuleInfoService ruleservice;
	@Autowired
	private UserInfoService userService;
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryMenuChildren")
	public ModelAndView queryMenuChildren(HttpServletRequest request,@Param("menuId")String menuId){
		ModelAndView modelAndView = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		Integer id = Integer.valueOf(menuId);
		for (int i = 0; i < user.getRuleList().size(); i++) {
			if (user.getRuleList().get(i).getRuleCode() == id && null != user.getRuleList().get(i).getChildrens() 
					&& user.getRuleList().get(i).getChildrens().size() > 0) {
				user.getRuleList().get(i).setChildrens(null);
			}else if(user.getRuleList().get(i).getRuleCode() == id && (null == user.getRuleList().get(i).getChildrens() 
					|| user.getRuleList().get(i).getChildrens().size() <= 0)){
				List<RuleInfo> childrens = null;
				if (user.getUserRuleBelong() == SystemConstant.USER_RULE) {
					childrens = ruleService.findRuleListByBelong(id);
				}else {
					RuleInfo ruleInfo = new RuleInfo();
					ruleInfo.setRuleCode(id);
					ruleInfo.setUserId(user.getUserId());
					childrens = ruleService.findRuleListByRuleCode(ruleInfo);
				}
				//设置父级菜单下的子级菜单
				if (null != childrens && childrens.size() > 0) {
					List<ChildrenRule> childrenRules = new ArrayList<ChildrenRule>();
					for (RuleInfo rs:childrens) {
						ChildrenRule cr = new ChildrenRule();
						BeanUtils.copyProperties(rs, cr);
						childrenRules.add(cr);
					}
					user.getRuleList().get(i).setChildrens(childrenRules);
				}
			}
		}
		modelAndView.addObject("user", user);
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryMenuList")
	public ModelAndView queryMenuList(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		List ids = menuService.queryMenuListByUser(user.getUserId());
		List<RuleInfo> userRule = ruleService.findRuleListByRuleId(ids);
		List<RuleInfo> rules = ruleService.queryListForMenu();
		modelAndView.addObject("user", user);
		modelAndView.addObject("userRule", userRule);//用户菜单
		modelAndView.addObject("rules", rules);//所有菜单
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "userRuleUpdate")
	public ModelAndView userRuleUpdate(HttpServletRequest request,@RequestParam("userId")String userId,
			@RequestParam("menuStr")String menuStr){
		ModelAndView modelAndView = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		Integer id = Integer.valueOf(userId);
		menuService.deleteUserMenuByUserId(id);//删除用户之前的菜单
		List<UserMenu> menList = null;
		if (StringUtils.isNotEmpty(menuStr)) {
			menList = loadUserMenu(menuStr,id);
		}
		int num = menuService.addUserMenus(menList);
		if (num > 0) {
			modelAndView.addObject("msg", "添加成功！");
		}else {
			modelAndView.addObject("msg", "添加失败！");
		}
		UserInfo userInfo = userService.loadUserInfo(Integer.valueOf(userId));
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
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/user_rule");
		return modelAndView;
	}
	
	
	private List<UserMenu> loadUserMenu(String umStr,Integer userId){
		List<UserMenu> umList = null;
		if(StringUtils.isNotEmpty(umStr)){
			String[] umArr = umStr.split(",");
			if(umArr.length>0){
				umList = new ArrayList<UserMenu>();
				UserMenu um = null;
				for(String str:umArr){
					if(str.length()>0 && NumberUtils.isDigits(str)){
						um = new UserMenu();
						um.setMenuId(Integer.parseInt(str));
						um.setUserId(userId);
						umList.add(um);
					}
				}
			}
		}
		return umList;
	}
	
}
