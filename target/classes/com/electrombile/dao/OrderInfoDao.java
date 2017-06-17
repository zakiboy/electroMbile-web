package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.OrderInfo;

/**
 * @author admin
 *
 */
@Repository
public interface OrderInfoDao{

	/**
	 * @param orderInfo
	 * @return int
	 */
	public int insertOrderInfo(OrderInfo orderInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteOrderInfo(Integer id);

	/**
	 * @param orderInfo
	 * @return int
	 */
	public int updateOrderInfo(OrderInfo orderInfo);

	/**
	 * @param id
	 * @return OrderInfo
	 */
	public OrderInfo loadOrderInfo(Integer id);

	/**
	 * @param orderInfo
	 * @return List<OrderInfo>
	 */
	public List<OrderInfo> queryList(OrderInfo orderInfo);

	/**
	 * @param orderInfo
	 * @return List<OrderInfo>
	 */
	public List<OrderInfo> queryPageList(OrderInfo orderInfo);

	/**
	 * @param orderInfo
	 * @return int
	 */
	public int queryCount(OrderInfo orderInfo);

}
