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

import com.electrombile.common.Pagination;
import com.electrombile.core.SystemConstant;
import com.electrombile.model.ElectrombileInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.Electrombile;
import com.electrombile.response.QueryParam;
import com.electrombile.service.ElectrombileAlarmMessageService;
import com.electrombile.service.ElectrombileInfoService;


@Controller
@RequestMapping(value = "mbile")
public class ElectrombileController {
	
	@Autowired
	private ElectrombileInfoService mbileService;
	@Autowired
	private ElectrombileAlarmMessageService alarmMessageService;

	/**
	 * 查询所有页面
	 * */
	@RequestMapping("queryPageList")
	public ModelAndView queryMbileList(HttpServletRequest request,@RequestParam("pageNo")int pageNo){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		if (pageNo == 0) {
			pageNo = 1;
		}
		electrombile.setFirstRow(pageNo - 1);
		electrombile.setRowSize(SystemConstant.PAGESIZE);
		int count = mbileService.queryCount(electrombile);
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		for (ElectrombileInfo mbile:electrombiles) {
			mbile.setElectrombileCoordinate(mbile.getElectrombileLongitude()+","+mbile.getElectrombileLatitude());
		}
		Pagination pagination = new Pagination();
		pagination.setPageNo(pageNo);
		pagination.setTotalCount(count);
		pagination.setTotalPages(count);
		pagination.setPaginationlist(pagination.getTotalPages());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.addObject("pagination", pagination);
		model.setViewName("vehicle/vehicle_list");
		return model;
	}
	
	@RequestMapping("findMbileByNo")
	public ModelAndView findMbileByNo(HttpServletRequest request,@PathParam("param")QueryParam param){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		electrombile.setElectrombileElectric("15%");
		if (null != param && !param.getNumber().equals("")) {
			electrombile.setElectrombileNo(param.getNumber().trim());
		}
		if (null != param && !param.getType().equals("") && !param.getType().equals("all")) {
			electrombile.setElectrombileType(Integer.valueOf(param.getType().trim()));
		}
		if (null != param && null != param.getElectric() && !param.getElectric().equals("")) {
			electrombile.setElectrombileElectric(param.getElectric());
		}
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_low_electric");
		return model;
	}
	
	@RequestMapping("mbileRepairsList")
	public ModelAndView mbileRepairsList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_repairs_list");
		return model;
	}
	
	@RequestMapping("mbileRepairs")
	public ModelAndView findMbileById(HttpServletRequest request,@RequestParam("mbileId")String mbileId,
			@RequestParam("type")String type){
		ModelAndView model = new ModelAndView();
		if (type.equals("look")) {
			ElectrombileInfo electrombile = mbileService.loadElectrombileInfo(Integer.valueOf(mbileId));
			model.addObject("mbile", electrombile);
		}else if (type.equals("repairs")){
			ElectrombileInfo electrombileInfo = new ElectrombileInfo();
			electrombileInfo.setElectrombileId(Integer.valueOf(mbileId));
			electrombileInfo.setElectrombileStatus(1);
			int num = mbileService.updateElectrombileInfo(electrombileInfo);
			if (num > 0) {
				model.addObject("msg", "报修成功！");
			}else {
				model.addObject("msg", "报修失败！");
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("vehicle/vehicle_repairs");
		return model;
	}
	
	/**
	 * 定位集合查询页面
	 * */
	@RequestMapping("queryLocationList")
	public ModelAndView queryLocationList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		for (ElectrombileInfo mbile:electrombiles) {
			mbile.setElectrombileCoordinate(mbile.getElectrombileLongitude()+","+mbile.getElectrombileLatitude());
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_location_list");
		return model;
	}
	
	/**
	 * 定位集合查询页面
	 * */
	@RequestMapping("lowElectricQuery")
	public ModelAndView lowElectricQuery(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		electrombile.setElectrombileElectric("15%");
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_low_electric");
		return model;
	}
	
	/**
	 * 定位页面
	 * */
	@RequestMapping("mbileLocation")
	public ModelAndView mbileLocation(HttpServletRequest request,@RequestParam("mbileId")String mbileId){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = mbileService.loadElectrombileInfo(Integer.valueOf(mbileId));
		double longitude = electrombile.getElectrombileLongitude();
		double latitude = electrombile.getElectrombileLatitude();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("longitude", longitude);
		model.addObject("latitude", latitude);
		model.addObject("electric", electrombile.getElectrombileElectric());
		model.addObject("user", user);
		model.setViewName("vehicle/vehicle_location");
		return model;
	}
	
	/**
	 * 异常报警
	 * */
	@RequestMapping("mbileMoveList")
	public ModelAndView mbileMoveList(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombile = new ElectrombileInfo();
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(electrombile);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_warn_list");
		return model;
	}
	
	/**
	 * 页面跳转修改页面
	 * */
	@RequestMapping("goMbileUpdate")
	public ModelAndView mbileMoveList(HttpServletRequest request,@RequestParam("mbileId")String mbileId){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo mbile = mbileService.loadElectrombileInfo(Integer.valueOf(mbileId));
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.addObject("mbile", mbile);
		model.setViewName("vehicle/vehicle_update");
		return model;
	}
	
	/**
	 * 修改
	 * */
	@RequestMapping("mbileUpdate")
	public ModelAndView mbileUpdateInfo(HttpServletRequest request,@PathParam("electrombile")Electrombile electrombile){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo mbile = new ElectrombileInfo();
		BeanUtils.copyProperties(electrombile, mbile);
		int num = mbileService.updateElectrombileInfo(mbile);
		if (num > 0) {
			model.addObject("msg", "修改成功！");
		}else {
			model.addObject("msg", "修改失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		mbile = new ElectrombileInfo();
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(mbile);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_list");
		return model;
	}
	
	/**
	 * 页面跳转新增页面
	 * */
	@RequestMapping("goMbileAdd")
	public ModelAndView goMbileAdd(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		model.setViewName("vehicle/vehicle_add");
		return model;
	}
	
	/**
	 * 新增
	 * */
	@RequestMapping("mbileAdd")
	public ModelAndView mbileAddInfo(HttpServletRequest request,@PathParam("electrombile")Electrombile electrombile){
		ModelAndView model = new ModelAndView();
		ElectrombileInfo electrombileInfo = new ElectrombileInfo();
		List<ElectrombileInfo> mbileList = mbileService.queryPageList(electrombileInfo);
		if (null != mbileList && mbileList.size() > 0) {
			model.addObject("msg", "车辆已存在！请先删除相同车辆再进行添加操作！");
			model.setViewName("vehicle/vehicle_add");
		}else {
			ElectrombileInfo mbile = new ElectrombileInfo();
			BeanUtils.copyProperties(electrombile, mbile);
			int num = mbileService.insertElectrombileInfo(mbile);
			if (num > 0) {
				model.addObject("msg", "添加成功！");
			}else {
				model.addObject("msg", "添加失败！");
			}
			mbile = new ElectrombileInfo();
			List<ElectrombileInfo> electrombiles = mbileService.queryPageList(mbile);
			model.addObject("electrombiles", electrombiles);
			model.setViewName("vehicle/vehicle_list");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		return model;
	}
	
	/**
	 * 修改
	 * */
	@RequestMapping("mbileDelete")
	public ModelAndView mbileDeleteInfo(HttpServletRequest request,@RequestParam("mbileId")String mbileId){
		ModelAndView model = new ModelAndView();
		int num = mbileService.deleteElectrombileInfo(Integer.valueOf(mbileId));
		if (num > 0) {
			model.addObject("msg", "删除成功！");
		}else {
			model.addObject("msg", "删除失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		model.addObject("user", user);
		ElectrombileInfo mbile = new ElectrombileInfo();
		List<ElectrombileInfo> electrombiles = mbileService.queryPageList(mbile);
		model.addObject("electrombiles", electrombiles);
		model.setViewName("vehicle/vehicle_list");
		return model;
	}
	
}
