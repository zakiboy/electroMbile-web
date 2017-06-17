package com.electrombile.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.RidingRecord;
import com.electrombile.request.UserSession;
import com.electrombile.service.RidingRecordService;
import com.electrombile.utils.MapUtil;


@Controller
@RequestMapping("riding")
public class RidingRecordController {

	@Autowired
	private RidingRecordService recordService;
	
	@RequestMapping("queryRidingRecordList")
	public ModelAndView queryRidingRecordList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		RidingRecord ridingRecord = new RidingRecord();
		List<RidingRecord> ridis = recordService.queryPageList(ridingRecord);
		for (RidingRecord record:ridis) {
			record.setRidingStart(MapUtil.getAdress(record.getRidingStart()));
			record.setRidingEnd(MapUtil.getAdress(record.getRidingEnd()));
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("ridis", ridis);
		model.setViewName("riding/riding_list");
		return model;
	}
	
	@RequestMapping("findRidingRecord")
	public ModelAndView queryRidingRecordList(HttpServletRequest request,@RequestParam("id")Integer id){
		ModelAndView model = new ModelAndView();
		RidingRecord ridi = recordService.loadRidingRecord(id);
		ridi.setRidingStart(MapUtil.getAdress(ridi.getRidingStart()));
		ridi.setRidingEnd(MapUtil.getAdress(ridi.getRidingEnd()));
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("ridi", ridi);
		model.setViewName("riding/riding_info");
		return model;
	}
	
}
