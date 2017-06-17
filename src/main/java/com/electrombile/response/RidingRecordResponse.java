package com.electrombile.response;

import java.util.Date;

public class RidingRecordResponse {

	/**记录表**/
	private Integer ridingId;
	/**会员ID**/
	private String memberOpenId;
	/**车辆ID**/
	private Integer departmentId;
	/**骑行开始时间**/
	private Date ridingStartDate;
	/**骑行结束时间**/
	private Date ridingEndDate;
	/**骑行起始位置**/
	private String ridingStart;
	/**骑行结束位置**/
	private String ridingEnd;
	
	/**
	 * @return the ridingId
	 */
	public Integer getRidingId() {
		return ridingId;
	}
	/**
	 * @param ridingId the ridingId to set
	 */
	public void setRidingId(Integer ridingId) {
		this.ridingId = ridingId;
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
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the ridingStartDate
	 */
	public Date getRidingStartDate() {
		return ridingStartDate;
	}
	/**
	 * @param ridingStartDate the ridingStartDate to set
	 */
	public void setRidingStartDate(Date ridingStartDate) {
		this.ridingStartDate = ridingStartDate;
	}
	/**
	 * @return the ridingEndDate
	 */
	public Date getRidingEndDate() {
		return ridingEndDate;
	}
	/**
	 * @param ridingEndDate the ridingEndDate to set
	 */
	public void setRidingEndDate(Date ridingEndDate) {
		this.ridingEndDate = ridingEndDate;
	}
	/**
	 * @return the ridingStart
	 */
	public String getRidingStart() {
		return ridingStart;
	}
	/**
	 * @param ridingStart the ridingStart to set
	 */
	public void setRidingStart(String ridingStart) {
		this.ridingStart = ridingStart;
	}
	/**
	 * @return the ridingEnd
	 */
	public String getRidingEnd() {
		return ridingEnd;
	}
	/**
	 * @param ridingEnd the ridingEnd to set
	 */
	public void setRidingEnd(String ridingEnd) {
		this.ridingEnd = ridingEnd;
	}
	
}
