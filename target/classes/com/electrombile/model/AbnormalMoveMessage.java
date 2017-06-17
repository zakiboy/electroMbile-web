package com.electrombile.model;

import java.util.Date;

public class AbnormalMoveMessage {

	/**异常移动信息表ID**/
	private Integer abnormalId;
	/**电动车ID**/
	private Integer departmentId;
	/**车辆电量**/
	private String departmentElectric;
	/**移动前位置**/
	private String departmentCoordinate;
	/**异常时间**/
	private Date abnormalDate;
	/**移动后位置**/
	private String moveCoordinate;
	/**处理时间**/
	private Date disposeDate;
	/**处理人**/
	private Integer userId;
	/**处理人登录账号**/
	private String userName;
	/**处理结果说明**/
	private String disposeResult;
	/**备注字段**/
	private String remark;
	/**备注字段**/
	private String remark1;
	
	public void setAbnormalId(Integer abnormalId) {
		this.abnormalId = abnormalId;
	}
	
	public Integer getAbnormalId() {
		return this.abnormalId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	
	public void setDepartmentElectric(String departmentElectric) {
		this.departmentElectric = departmentElectric;
	}
	
	public String getDepartmentElectric() {
		return this.departmentElectric;
	}
	
	public void setDepartmentCoordinate(String departmentCoordinate) {
		this.departmentCoordinate = departmentCoordinate;
	}
	
	public String getDepartmentCoordinate() {
		return this.departmentCoordinate;
	}
	
	public void setAbnormalDate(Date abnormalDate) {
		this.abnormalDate = abnormalDate;
	}
	
	public Date getAbnormalDate() {
		return this.abnormalDate;
	}
	
	public void setMoveCoordinate(String moveCoordinate) {
		this.moveCoordinate = moveCoordinate;
	}
	
	public String getMoveCoordinate() {
		return this.moveCoordinate;
	}
	
	public void setDisposeDate(Date disposeDate) {
		this.disposeDate = disposeDate;
	}
	
	public Date getDisposeDate() {
		return this.disposeDate;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setDisposeResult(String disposeResult) {
		this.disposeResult = disposeResult;
	}
	
	public String getDisposeResult() {
		return this.disposeResult;
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

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
