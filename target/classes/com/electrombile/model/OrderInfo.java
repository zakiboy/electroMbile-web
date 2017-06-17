package com.electrombile.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * OrderInfo
 *
 */
public class OrderInfo {

	/**订单ID**/
	private Integer orderId;
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
	/**订单状态**/
	private Integer orderStatus;
	/**会员ID**/
	private Integer memberId;
	/**会员名称**/
	private String memberName;
	/**电车编号**/
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
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * 设置orderType
	 * @param orderType
	 */
	public void setOrderType(Integer orderType) {
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
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * 设置orderDate
	 * @param orderDate
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * 获取orderChannel
	 * @return orderChannel
	 */
	public Integer getOrderChannel() {
		return orderChannel;
	}
	/**
	 * 设置orderChannel
	 * @param orderChannel
	 */
	public void setOrderChannel(Integer orderChannel) {
		this.orderChannel = orderChannel;
	}
	/**
	 * 获取orderStatus
	 * @return orderStatus
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置orderStatus
	 * @param orderStatus
	 */
	public void setOrderStatus(Integer orderStatus) {
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
