package com.electrombile.model;

import java.util.Date;

public class RidingRecord {
	
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
	/**骑行起始坐标**/
	private String ridingStart;
	/**骑行结束坐标**/
	private String ridingEnd;
	/**备注字段**/
	private String remark;
	/**备注字段1**/
	private String remark1;
	
	public void setRidingId(Integer ridingId) {
		this.ridingId = ridingId;
	}
	
	public Integer getRidingId() {
		return this.ridingId;
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

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	
	public void setRidingStartDate(Date ridingStartDate) {
		this.ridingStartDate = ridingStartDate;
	}
	
	public Date getRidingStartDate() {
		return this.ridingStartDate;
	}
	
	public void setRidingEndDate(Date ridingEndDate) {
		this.ridingEndDate = ridingEndDate;
	}
	
	public Date getRidingEndDate() {
		return this.ridingEndDate;
	}
	
	public void setRidingStart(String ridingStart) {
		this.ridingStart = ridingStart;
	}
	
	public String getRidingStart() {
		return this.ridingStart;
	}
	
	public void setRidingEnd(String ridingEnd) {
		this.ridingEnd = ridingEnd;
	}
	
	public String getRidingEnd() {
		return this.ridingEnd;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	
	public String getRemark1() {
		return this.remark1;
	}
}
