package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.RuleInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.RuleResponse;
import com.electrombile.service.RuleInfoService;
import com.electrombile.service.UserMenuService;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author StarZou
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
public class PageController {
	
	@Autowired
	private RuleInfoService ruleService;
	@Autowired
	private UserMenuService menuService;

    /**
     * 登录页
     * @return String
     */
    @RequestMapping("index")
    public String login() {
        return "login";
    }
    
    /**
     * 主页
     * @return String
     */
    @RequestMapping("main")
    public ModelAndView main(HttpSession session) {
    	ModelAndView modelAndView = new ModelAndView();
    	UserSession user = (UserSession) session.getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
    	if (null != user) {
			List<RuleInfo> rules = null;
			if (user.getUserRuleBelong().equals(SystemConstant.USER_RULE)) {
				rules = ruleService.queryListForMenu();
			}else{
				List ids = menuService.queryMenuListByUser(user.getUserId());
				rules = ruleService.findRuleListByRuleId(ids);
			}
			List<RuleResponse> ruleBack = new ArrayList<RuleResponse>();
			if (null != rules && rules.size() > 0) {
				for (int i = 0; i < rules.size(); i++) {
					RuleResponse ruleResponse = new RuleResponse();
					BeanUtils.copyProperties(rules.get(i), ruleResponse);
					List<RuleInfo> ruleList = ruleService.findRuleListByBelong(rules.get(i).getRuleCode());
					ruleResponse.setChildrens(ruleList);
					ruleBack.add(ruleResponse);
				}
			}
			modelAndView.addObject("ruleBack", ruleBack);
		}
        return modelAndView;
    }
    
    /**
     * dashboard页
     * @return String
     */
    @RequestMapping("dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 404页
     * @return String
     */
    @RequestMapping("404")
    public ModelAndView error404(HttpServletRequest request) {
    	ModelAndView modelAndView = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("error/404");
        return modelAndView;
    }

    /**
     * 401页
     * @return String
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     * @return String
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}