package com.electrombile.controller;

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
import com.electrombile.model.RepairsMessage;
import com.electrombile.request.UserSession;
import com.electrombile.response.RepairsMessageResponse;
import com.electrombile.service.RepairsMessageService;


@Controller
@RequestMapping("repairs")
public class RepairsMessageController {

	@Autowired
	private RepairsMessageService repairsService;
	
	@RequestMapping("queryRepairsMessageList")
	public ModelAndView queryRepairsMessageList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		RepairsMessage repairsMessage = new RepairsMessage();
		List<RepairsMessage> repairs = repairsService.queryPageList(repairsMessage);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("repairs", repairs);
		model.setViewName("repairs/repairs_list");
		return model;
	}
	
	@RequestMapping("findRepairsMessage")
	public ModelAndView queryRepairsMessageList(HttpServletRequest request,@RequestParam("id")Integer id){
		ModelAndView model = new ModelAndView();
		RepairsMessage repair = repairsService.loadRepairsMessage(id);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("repair", repair);
		model.setViewName("repairs/repairs_info");
		return model;
	}
	
	@RequestMapping("updateRepairsMessage")
	public ModelAndView updateRepairsMessage(HttpServletRequest request,
			@PathParam("repairsResponse")RepairsMessageResponse repairsResponse){
		ModelAndView model = new ModelAndView();
		RepairsMessage repairsMessage = new RepairsMessage();
		BeanUtils.copyProperties(repairsResponse, repairsMessage);
		int num = repairsService.updateRepairsMessage(repairsMessage);
		String msg = "";
		if (num > 0) {
			msg = "更新成功！";
		}else {
			msg = "更新失败！";
		}
		model.addObject("msg", msg);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("repairs/repairs_update");
		return model;
	}
}
