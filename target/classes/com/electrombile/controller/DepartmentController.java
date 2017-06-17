package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.DepartmentInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.DepartResponse;
import com.electrombile.service.DepartmentInfoService;

@Controller
@RequestMapping(value = "depart")
public class DepartmentController {
	
	@Autowired
	private DepartmentInfoService departmentService;
	
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryDepartList")
	public ModelAndView queryOrderList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		List<DepartmentInfo> departList = departmentService.queryList(new DepartmentInfo());
		List<DepartResponse> departs = null;
		if (null != departList && departList.size() > 0) {
			departs = new ArrayList<DepartResponse>();
			for (DepartmentInfo depart:departList) {
				DepartResponse de = new DepartResponse();
				BeanUtils.copyProperties(depart, de);
				de.setDepartmentStatus(depart.getDepartmentStatus().toString());
				departs.add(de);
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("departs", departs);
		modelAndView.setViewName("depart/depart_list");
		return modelAndView;
	}
	
    /**
     * @return String
     */
    @RequestMapping(value = "addDepart")
    public ModelAndView addDepart(HttpServletRequest request) {
    	ModelAndView modelAndView = new ModelAndView();
    	UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
    	modelAndView.addObject("user", user);
    	modelAndView.setViewName("depart/depart_add");
        return modelAndView;
    }
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "addDepartInfo")
	public ModelAndView addDepartInfo(HttpServletRequest request,@Param("depart")DepartResponse depart){
		ModelAndView modelAndView = new ModelAndView();
		DepartmentInfo departInfo = new DepartmentInfo();
		BeanUtils.copyProperties(depart, departInfo);
		departInfo.setDepartmentStatus(Integer.valueOf(depart.getDepartmentStatus()));
		int num = departmentService.insertDepartmentInfo(departInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "添加成功！");
		}else {
			modelAndView.addObject("msg", "添加失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("depart/queryDepartList");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "findDepartInfo")
	public ModelAndView findOderInfo(HttpServletRequest request,@RequestParam("departId")String departId){
		ModelAndView modelAndView = new ModelAndView();
		DepartmentInfo departInfo = departmentService.loadDepartmentInfo(Integer.valueOf(departId));
		DepartResponse depart = new DepartResponse();
		BeanUtils.copyProperties(departInfo, depart);
		depart.setDepartmentStatus(departInfo.getDepartmentStatus().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("depart", depart);
		modelAndView.setViewName("depart/depart_info");
		return modelAndView;
	}
	
	/**
	 * @param orderId
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryDepart")
	public ModelAndView queryOrder(HttpServletRequest request,@Param("departId")String departId){
		ModelAndView modelAndView = new ModelAndView();
		DepartmentInfo departInfo = departmentService.loadDepartmentInfo(Integer.valueOf(departId));
		DepartResponse depart = new DepartResponse();
		BeanUtils.copyProperties(departInfo, depart);
		depart.setDepartmentStatus(departInfo.getDepartmentStatus().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("depart", depart);
		modelAndView.setViewName("depart/depart_update");
		return modelAndView;
	}
	
	/**
	 * @param order
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateOrder")
	public ModelAndView updateOrder(HttpServletRequest request,@Param("depart")DepartResponse depart){
		ModelAndView modelAndView = new ModelAndView();
		DepartmentInfo departInfo = new DepartmentInfo();
		BeanUtils.copyProperties(depart, departInfo);
		departInfo.setDepartmentStatus(Integer.valueOf(depart.getDepartmentStatus()));
		int num = departmentService.updateDepartmentInfo(departInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "更新成功！");
		}else{
			modelAndView.addObject("msg", "更新失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("depart", depart);
		modelAndView.setViewName("order/order_info");
		return modelAndView;
	}
	
	/**
	 * @param orderId
	 * @return ModelAndView
	 */
	@RequestMapping(value = "deleteOrder")
	public ModelAndView deleteOrder(HttpServletRequest request,@Param("departId")String departId){
		ModelAndView modelAndView = new ModelAndView();
		int num = departmentService.deleteDepartmentInfo(Integer.valueOf(departId));
		if (num > 0) {
			modelAndView.addObject("msg", "删除成功！");
		}else{
			modelAndView.addObject("msg", "删除失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("depart/depart_list");
		return modelAndView;
	}

}
