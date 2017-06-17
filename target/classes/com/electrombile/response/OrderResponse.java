package com.electrombile.response;

import java.math.BigDecimal;

/**
 * OrderInfo
 *
 */
public class OrderResponse{
	
	/**订单ID**/
	private Integer orderId;
	/**订单号**/
	private String orderNo;
	/**订单类型**/
	private String orderType;
	/**订单金额**/
	private BigDecimal orderMoney;
	/**订单日期**/
	private String orderDate;
	/**交易渠道**/
	private String orderChannel;
	/**订单状态**/
	private String orderStatus;
	/**会员ID**/
	private Integer memberId;
	/**会员名称**/
	private String memberName;
	/**电动车编号**/
	private String electrombileNo;
	
	/**
	 * 获取orderId
	 * @return orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * 设置orderId
	 * @param orderId
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取orderNo
	 * @return orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置orderNo
	 * @param orderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取orderType
	 * @return orderType
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * 设置orderType
	 * @param orderType
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取orderMoney
	 * @return orderMoney
	 */
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}
	/**
	 * 设置orderMoney
	 * @param orderMoney
	 */
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}
	/**
	 * 获取orderDate
	 * @return orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * 设置orderDate
	 * @param orderDate
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * 获取orderChannel
	 * @return orderChannel
	 */
	public String getOrderChannel() {
		return orderChannel;
	}
	/**
	 * 设置orderChannel
	 * @param orderChannel
	 */
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}
	/**
	 * 获取orderStatus
	 * @return orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置orderStatus
	 * @param orderStatus
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取memberId
	 * @return memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * 设置memberId
	 * @param memberId
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * @return the electrombileNo
	 */
	public String getElectrombileNo() {
		return electrombileNo;
	}
	/**
	 * @param electrombileNo the electrombileNo to set
	 */
	public void setElectrombileNo(String electrombileNo) {
		this.electrombileNo = electrombileNo;
	}
	
}

