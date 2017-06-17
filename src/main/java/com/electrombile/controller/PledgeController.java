package com.electrombile.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.PledgeCash;
import com.electrombile.request.UserSession;
import com.electrombile.service.PledgeCashService;


@Controller
public class PledgeController {

	@Autowired
	private PledgeCashService cashService;
	
	@RequestMapping("queryPledgeList")
	public ModelAndView queryPledgeList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		List<PledgeCash> pledges = cashService.queryPageList(new PledgeCash());
		UserSession user = (UserSession)request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("pledges", pledges);
		model.setViewName("pledge/pledge_list");
		return model;
	}
	
	@RequestMapping("handBackPage")
	public ModelAndView handBackPage(HttpServletRequest request,@RequestParam("pledgeId")Integer pledgeId){
		ModelAndView model = new ModelAndView();
		PledgeCash pledge = cashService.loadPledgeCash(pledgeId);
		UserSession user = (UserSession)request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("pledge", pledge);
		model.setViewName("pledge/pledge_info");
		return model;
	}
	
	/**
	 * 押金退还操作
	 * **/
	@RequestMapping("handBackPledgeCash")
	public ModelAndView handBackPledgeCash(HttpServletRequest request,@RequestParam("pledgeId")Integer pledgeId){
		ModelAndView model = new ModelAndView();
		PledgeCash pledge = cashService.loadPledgeCash(pledgeId);
		
		
		UserSession user = (UserSession)request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("pledge", pledge);
		model.setViewName("pledge/pledge_info");
		return model;
	}
	
}
