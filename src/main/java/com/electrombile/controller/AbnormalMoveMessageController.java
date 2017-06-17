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
import com.electrombile.model.AbnormalMoveMessage;
import com.electrombile.request.UserSession;
import com.electrombile.response.AbnormalMoveResponse;
import com.electrombile.service.AbnormalMoveMessageService;


@Controller
@RequestMapping("abnormal")
public class AbnormalMoveMessageController {

	@Autowired
	private AbnormalMoveMessageService abnormalService;
	
	@RequestMapping("queryAbnormalMessageList")
	public ModelAndView queryAbnormalMoveMessageList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		AbnormalMoveMessage abnormalMoveMessage = new AbnormalMoveMessage();
		List<AbnormalMoveMessage> abnormals = abnormalService.queryPageList(abnormalMoveMessage);
		model.addObject("abnormals", abnormals);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("abnormal/abnormal_list");
		return model;
	}
	
	@RequestMapping("findAbnormalMessage")
	public ModelAndView queryAbnormalMoveMessageList(HttpServletRequest request,@RequestParam("id")Integer id){
		ModelAndView model = new ModelAndView();
		AbnormalMoveMessage abnormal = abnormalService.loadAbnormalMoveMessage(id);
		model.addObject("abnormal", abnormal);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("abnormal/abnormal_info");
		return model;
	}
	
	@RequestMapping("updateAbnormalMessage")
	public ModelAndView updateAbnormalMoveMessage(HttpServletRequest request,@PathParam("abnormalResponse")AbnormalMoveResponse abnormalResponse){
		ModelAndView model = new ModelAndView();
		AbnormalMoveMessage abnormalMoveMessage = new AbnormalMoveMessage();
		BeanUtils.copyProperties(abnormalResponse, abnormalMoveMessage);
		int num = abnormalService.updateAbnormalMoveMessage(abnormalMoveMessage);
		String msg = "";
		if (num > 0) {
			msg = "更新成功！";
		}else {
			msg = "更新失败！";
		}
		model.addObject("msg", msg);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("abnormal/abnormal_update");
		return model;
	}
	
}
