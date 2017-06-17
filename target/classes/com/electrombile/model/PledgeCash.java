package com.electrombile.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PledgeCash
 *
 */
public class PledgeCash {

	/**押金表ID**/
	private Integer pledgeId;
	/**押金金额**/
	private BigDecimal pledgeMoney;
	/**可用金额**/
	private BigDecimal pledgeUsable;
	/**押金日期**/
	private Date pledgeDate;
	/**会员ID**/
	private Integer memberId;
	/**操作人员**/
	private Integer userId;
	/**会员名称**/
	private String memberName;
	/**会员openId**/
	private String memberOpenId;
	/**会员手机号**/
	private String memberPhone;
	
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取pledgeId
	 * @return pledgeId
	 */
	public Integer getPledgeId() {
		return pledgeId;
	}
	/**
	 * 设置pledgeId
	 * @param pledgeId
	 */
	public void setPledgeId(Integer pledgeId) {
		this.pledgeId = pledgeId;
	}
	/**
	 * 获取pledgeMoney
	 * @return pledgeMoney
	 */
	public BigDecimal getPledgeMoney() {
		return pledgeMoney;
	}
	/**
	 * 设置pledgeMoney
	 * @param pledgeMoney
	 */
	public void setPledgeMoney(BigDecimal pledgeMoney) {
		this.pledgeMoney = pledgeMoney;
	}
	/**
	 * 获取pledgeUsable
	 * @return pledgeUsable
	 */
	public BigDecimal getPledgeUsable() {
		return pledgeUsable;
	}
	/**
	 * 设置pledgeUsable
	 * @param pledgeUsable
	 */
	public void setPledgeUsable(BigDecimal pledgeUsable) {
		this.pledgeUsable = pledgeUsable;
	}
	/**
	 * 获取pledgeDate
	 * @return pledgeDate
	 */
	public Date getPledgeDate() {
		return pledgeDate;
	}
	/**
	 * 设置pledgeDate
	 * @param pledgeDate
	 */
	public void setPledgeDate(Date pledgeDate) {
		this.pledgeDate = pledgeDate;
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
	 * @return the memberOpenId
	 */
	public String getMemberOpenId() {
		return memberOpenId;
	}
	/**
	 * @param memberOpenId the memberOpenId to set
	 */
	public void setMemberOpenId(String memberOpenId) {
		this.memberOpenId = memberOpenId;
	}
	/**
	 * @return the memberPhone
	 */
	public String getMemberPhone() {
		return memberPhone;
	}
	/**
	 * @param memberPhone the memberPhone to set
	 */
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
}
