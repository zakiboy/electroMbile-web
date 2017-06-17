package com.electrombile.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DealInfo
 *
 */
public class DealInfo {
	
	/**交易ID**/
	private Integer dealId;
	/**交易号**/
	private String dealNo;
	/**交易类型**/
	private Integer dealType;
	/**交易日期**/
	private Date dealDate;
	/**交易金额**/
	private BigDecimal dealMoney;
	/**交易状态**/
	private Integer dealStatus;
	/**订单号**/
	private String orderNo;
	
	/**
	 * 获取dealId
	 * @return dealId
	 */
	public Integer getDealId() {
		return dealId;
	}
	/**
	 * 设置dealId
	 * @param dealId
	 */
	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}
	/**
	 * 获取dealNo
	 * @return dealNo
	 */
	public String getDealNo() {
		return dealNo;
	}
	/**
	 * 设置dealNo
	 * @param dealNo
	 */
	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	/**
	 * @return the dealType
	 */
	public Integer getDealType() {
		return dealType;
	}
	/**
	 * @param dealType the dealType to set
	 */
	public void setDealType(Integer dealType) {
		this.dealType = dealType;
	}
	/**
	 * @param dealStatus the dealStatus to set
	 */
	public void setDealStatus(Integer dealStatus) {
		this.dealStatus = dealStatus;
	}
	/**
	 * 获取dealDate
	 * @return dealDate
	 */
	public Date getDealDate() {
		return dealDate;
	}
	/**
	 * 设置dealDate
	 * @param dealDate
	 */
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}
	/**
	 * 获取dealMoney
	 * @return dealMoney
	 */
	public BigDecimal getDealMoney() {
		return dealMoney;
	}
	/**
	 * 设置dealMoney
	 * @param dealMoney
	 */
	public void setDealMoney(BigDecimal dealMoney) {
		this.dealMoney = dealMoney;
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
	 * @return the dealStatus
	 */
	public Integer getDealStatus() {
		return dealStatus;
	}
	
}
