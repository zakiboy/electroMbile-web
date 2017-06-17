package com.electrombile.response;

import java.util.Date;

public class AbnormalMoveResponse {
	
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
	/**
	 * @return the abnormalId
	 */
	public Integer getAbnormalId() {
		return abnormalId;
	}
	/**
	 * @param abnormalId the abnormalId to set
	 */
	public void setAbnormalId(Integer abnormalId) {
		this.abnormalId = abnormalId;
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
	 * @return the departmentElectric
	 */
	public String getDepartmentElectric() {
		return departmentElectric;
	}
	/**
	 * @param departmentElectric the departmentElectric to set
	 */
	public void setDepartmentElectric(String departmentElectric) {
		this.departmentElectric = departmentElectric;
	}
	/**
	 * @return the departmentCoordinate
	 */
	public String getDepartmentCoordinate() {
		return departmentCoordinate;
	}
	/**
	 * @param departmentCoordinate the departmentCoordinate to set
	 */
	public void setDepartmentCoordinate(String departmentCoordinate) {
		this.departmentCoordinate = departmentCoordinate;
	}
	/**
	 * @return the abnormalDate
	 */
	public Date getAbnormalDate() {
		return abnormalDate;
	}
	/**
	 * @param abnormalDate the abnormalDate to set
	 */
	public void setAbnormalDate(Date abnormalDate) {
		this.abnormalDate = abnormalDate;
	}
	/**
	 * @return the moveCoordinate
	 */
	public String getMoveCoordinate() {
		return moveCoordinate;
	}
	/**
	 * @param moveCoordinate the moveCoordinate to set
	 */
	public void setMoveCoordinate(String moveCoordinate) {
		this.moveCoordinate = moveCoordinate;
	}
	/**
	 * @return the disposeDate
	 */
	public Date getDisposeDate() {
		return disposeDate;
	}
	/**
	 * @param disposeDate the disposeDate to set
	 */
	public void setDisposeDate(Date disposeDate) {
		this.disposeDate = disposeDate;
	}
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
	 * @return the disposeResult
	 */
	public String getDisposeResult() {
		return disposeResult;
	}
	/**
	 * @param disposeResult the disposeResult to set
	 */
	public void setDisposeResult(String disposeResult) {
		this.disposeResult = disposeResult;
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
