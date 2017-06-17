package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.OrderInfoDao;
import com.electrombile.model.OrderInfo;


/**
 * @author admin
 *
 */
@Service
@Transactional
public class OrderInfoService {

	@Autowired
	private OrderInfoDao orderDao;
	
	/**
	 * @param orderInfo
	 * @return int
	 */
	public int insertOrderInfo(OrderInfo orderInfo){
		return orderDao.insertOrderInfo(orderInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteOrderInfo(Integer id){
		return orderDao.deleteOrderInfo(id);
	}

	/**
	 * @param orderInfo
	 * @return int
	 */
	public int updateOrderInfo(OrderInfo orderInfo){
		return orderDao.updateOrderInfo(orderInfo);
	}

	/**
	 * @param id
	 * @return OrderInfo
	 */
	public OrderInfo loadOrderInfo(Integer id){
		return orderDao.loadOrderInfo(id);
	}

	/**
	 * @param orderInfo
	 * @return List<OrderInfo>
	 */
	public List<OrderInfo> queryList(OrderInfo orderInfo){
		return orderDao.queryList(orderInfo);
	}

	/**
	 * @param orderInfo
	 * @return List<OrderInfo>
	 */
	public List<OrderInfo> queryPageList(OrderInfo orderInfo){
		return orderDao.queryPageList(orderInfo);
	}

	/**
	 * @param orderInfo
	 * @return int
	 */
	public int queryCount(OrderInfo orderInfo){
		return orderDao.queryCount(orderInfo);
	}
}
