package com.electrombile.cxf.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "OrderBack")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderBack  implements Serializable{

	private static final long serialVersionUID = -5557471448876282094L;

	/**订单号**/
	private String orderNo;
	/**订单类型**/
	private Integer orderType;
	/**订单金额**/
	private BigDecimal orderMoney;
	/**订单日期**/
	private Date orderDate;
	/**交易渠道**/
	private Integer orderChannel;
	/**用户openId**/
	private String openId;
	
	private List<OrderMessage> orderList;
	
	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * @return the orderType
	 */
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	/**
	 * @return the orderMoney
	 */
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}
	/**
	 * @param orderMoney the orderMoney to set
	 */
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}
	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the orderChannel
	 */
	public Integer getOrderChannel() {
		return orderChannel;
	}
	/**
	 * @param orderChannel the orderChannel to set
	 */
	public void setOrderChannel(Integer orderChannel) {
		this.orderChannel = orderChannel;
	}
	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * @return the orders
	 */
	public List<OrderMessage> getOrders() {
		return orderList;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<OrderMessage> orderList) {
		this.orderList = orderList;
	}
	
}
