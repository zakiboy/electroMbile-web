package com.electrombile.response;

import java.math.BigDecimal;

public class DealResponse {
	
	/**交易ID**/
	private Integer dealId;
	/**交易号**/
	private String dealNo;
	/**交易类型**/
	private Integer dealType;
	/**交易日期**/
	private String dealDate;
	/**交易金额**/
	private BigDecimal dealMoney;
	/**交易状态**/
	private Integer dealStatus;
	/**订单号**/
	private String orderNo;
	
	/**
	 * @return the dealId
	 */
	public Integer getDealId() {
		return dealId;
	}
	/**
	 * @param dealId the dealId to set
	 */
	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}
	/**
	 * @return the dealNo
	 */
	public String getDealNo() {
		return dealNo;
	}
	/**
	 * @param dealNo the dealNo to set
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
	 * @return the dealMoney
	 */
	public BigDecimal getDealMoney() {
		return dealMoney;
	}
	/**
	 * @param dealMoney the dealMoney to set
	 */
	public void setDealMoney(BigDecimal dealMoney) {
		this.dealMoney = dealMoney;
	}
	/**
	 * @return the dealStatus
	 */
	public Integer getDealStatus() {
		return dealStatus;
	}
	/**
	 * @param dealStatus the dealStatus to set
	 */
	public void setDealStatus(Integer dealStatus) {
		this.dealStatus = dealStatus;
	}
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
	 * @return the dealDate
	 */
	public String getDealDate() {
		return dealDate;
	}
	/**
	 * @param dealDate the dealDate to set
	 */
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	
}
