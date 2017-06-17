package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.DealInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.DealResponse;
import com.electrombile.service.DealInfoService;
import com.electrombile.utils.DateUtils;



@Controller
public class DealInfoController {

	@Autowired
	private DealInfoService dealInfoService;
	
	/**
	 * @param order
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateWeiXinOrder")
	public ModelAndView updateWeiXinOrder(HttpServletRequest request,
			@PathParam("deal")DealResponse deal){
		ModelAndView modelAndView = new ModelAndView();
		DealInfo dealInfo = new DealInfo();
		BeanUtils.copyProperties(deal, dealInfo);
		int num = dealInfoService.updateDealInfo(dealInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "更新成功！");
		}else{
			modelAndView.addObject("msg", "更新失败！");
		}
		UserSession user = (UserSession)request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("deal", deal);
		modelAndView.setViewName("wixin/weixin_update");
		return modelAndView;
	}


	@RequestMapping(value = "queryWeiXinOrderList")
	public ModelAndView queryWeiXinOrderList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		DealInfo dealInfo = new DealInfo();
		List<DealInfo> dealList = dealInfoService.queryList(dealInfo);
		List<DealResponse> deals = null;
		if (null != dealList && dealList.size() > 0) {
			deals = new ArrayList<DealResponse>();
			for (DealInfo deal:dealList) {
				DealResponse re = new DealResponse();
				BeanUtils.copyProperties(deal, re);
				re.setDealDate(DateUtils.setUtilDateToString(deal.getDealDate()));
				deals.add(re);
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("deals", deals);
		modelAndView.setViewName("weixin/weixin_list");
		return modelAndView;
	}
	
	
}
