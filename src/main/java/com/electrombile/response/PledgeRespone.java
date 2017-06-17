package com.electrombile.response;

import java.math.BigDecimal;

public class PledgeRespone {

	/**会员名称**/
	private String memberName;
	/**会员openId**/
	private String memberOpenId;
	/**会员手机号**/
	private String memberPhone;
	/**押金金额**/
	private BigDecimal pledgeMoney;
	/**可用金额**/
	private BigDecimal pledgeUsable;
	/**押金日期**/
	private String pledgeDate;
	
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
	/**
	 * @return the pledgeMoney
	 */
	public BigDecimal getPledgeMoney() {
		return pledgeMoney;
	}
	/**
	 * @param pledgeMoney the pledgeMoney to set
	 */
	public void setPledgeMoney(BigDecimal pledgeMoney) {
		this.pledgeMoney = pledgeMoney;
	}
	/**
	 * @return the pledgeUsable
	 */
	public BigDecimal getPledgeUsable() {
		return pledgeUsable;
	}
	/**
	 * @param pledgeUsable the pledgeUsable to set
	 */
	public void setPledgeUsable(BigDecimal pledgeUsable) {
		this.pledgeUsable = pledgeUsable;
	}
	/**
	 * @return the pledgeDate
	 */
	public String getPledgeDate() {
		return pledgeDate;
	}
	/**
	 * @param pledgeDate the pledgeDate to set
	 */
	public void setPledgeDate(String pledgeDate) {
		this.pledgeDate = pledgeDate;
	}
	
}
