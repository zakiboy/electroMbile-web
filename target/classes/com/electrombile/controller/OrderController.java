package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.OrderInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.OrderResponse;
import com.electrombile.service.OrderInfoService;
import com.electrombile.utils.DateUtils;

/**
 * @author admin
 *
 */
@Controller
@RequestMapping(value = "order")
public class OrderController {
	
	@Autowired
	private OrderInfoService orderService;
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryOrderList")
	public ModelAndView queryOrderList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		OrderInfo orderInfo = new OrderInfo();
		List<OrderInfo> orderList = orderService.queryList(orderInfo);
		List<OrderResponse> orders = null;
		if (null != orderList && orderList.size() > 0) {
			orders = new ArrayList<OrderResponse>();
			for (OrderInfo order:orderList) {
				OrderResponse re = new OrderResponse();
				BeanUtils.copyProperties(order, re);
				re.setOrderDate(DateUtils.setUtilDateToString(order.getOrderDate()));
				re.setOrderType(order.getOrderType().toString());
				re.setOrderStatus(order.getOrderStatus().toString());
				re.setOrderChannel(order.getOrderChannel().toString());
				orders.add(re);
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("ordesr", orders);
		modelAndView.setViewName("order/order_list");
		return modelAndView;
	}
	
	@RequestMapping(value = "addOrder")
	public ModelAndView addOrder(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("order/order_add");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "findOderInfo")
	public ModelAndView findOderInfo(HttpServletRequest request,@RequestParam("orderId")String orderId){
		ModelAndView modelAndView = new ModelAndView();
		OrderInfo orderInfo = orderService.loadOrderInfo(Integer.valueOf(orderId));
		OrderResponse order = new OrderResponse();
		BeanUtils.copyProperties(orderInfo, order);
		order.setOrderDate(DateUtils.setUtilDateToString(orderInfo.getOrderDate()));
		order.setOrderType(orderInfo.getOrderType().toString());
		order.setOrderStatus(orderInfo.getOrderStatus().toString());
		order.setOrderChannel(orderInfo.getOrderChannel().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("order", order);
		modelAndView.setViewName("order/order_info");
		return modelAndView;
	}
	
	/**
	 * @param orderId
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryOrder")
	public ModelAndView queryOrder(HttpServletRequest request,@Param("orderId")String orderId){
		ModelAndView modelAndView = new ModelAndView();
		OrderInfo orderInfo = orderService.loadOrderInfo(Integer.valueOf(orderId));
		OrderResponse order = new OrderResponse();
		BeanUtils.copyProperties(orderInfo, order);
		order.setOrderDate(DateUtils.setUtilDateToString(orderInfo.getOrderDate()));
		order.setOrderType(orderInfo.getOrderType().toString());
		order.setOrderStatus(orderInfo.getOrderStatus().toString());
		order.setOrderChannel(orderInfo.getOrderChannel().toString());
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("order", order);
		modelAndView.setViewName("order/order_update");
		return modelAndView;
	}
	
	/**
	 * @param order
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateOrder")
	public ModelAndView updateOrder(HttpServletRequest request,@PathParam("order")OrderResponse order){
		ModelAndView modelAndView = new ModelAndView();
		OrderInfo orderInfo = new OrderInfo();
		BeanUtils.copyProperties(order, orderInfo);
		orderInfo.setOrderDate(DateUtils.setStringToUtilDate(order.getOrderDate()));
		orderInfo.setOrderDate(DateUtils.setStringToUtilDate(order.getOrderDate()));
		orderInfo.setOrderType(Integer.valueOf(order.getOrderType()));
		orderInfo.setOrderStatus(Integer.valueOf(order.getOrderStatus()));
		orderInfo.setOrderChannel(Integer.valueOf(order.getOrderChannel()));
		int num = orderService.updateOrderInfo(orderInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "更新成功！");
		}else{
			modelAndView.addObject("msg", "更新失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("order", order);
		modelAndView.setViewName("order/order_info");
		return modelAndView;
	}
	
	/**
	 * @param orderId
	 * @return ModelAndView
	 */
	@RequestMapping(value = "deleteOrder")
	public ModelAndView deleteOrder(HttpServletRequest request,@Param("orderId")String orderId){
		ModelAndView modelAndView = new ModelAndView();
		int num = orderService.deleteOrderInfo(Integer.valueOf(orderId));
		if (num > 0) {
			modelAndView.addObject("msg", "删除成功！");
		}else{
			modelAndView.addObject("msg", "删除失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("order/order_list");
		return modelAndView;
	}
		
}
