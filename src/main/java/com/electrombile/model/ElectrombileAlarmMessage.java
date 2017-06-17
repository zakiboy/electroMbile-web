package com.electrombile.model;

import java.io.Serializable;

public class ElectrombileAlarmMessage implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**报警信息ID**/
	private Integer alarmId;
	/**状态0未处理1处理中2已处理**/
	private Integer alarmStatus;
	/**处理结果**/
	private String alarmHandleResult;
	/**报警原因**/
	private String alarmCause;
	/**信息类型**/
	private Integer alarmType;
	/**备注字段**/
	private String remark;
	/**备注字段1**/
	private String remark1;
	
	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}
	
	public Integer getAlarmId() {
		return this.alarmId;
	}
	
	public void setAlarmStatus(Integer alarmStatus) {
		this.alarmStatus = alarmStatus;
	}
	
	public Integer getAlarmStatus() {
		return this.alarmStatus;
	}
	
	public void setAlarmHandleResult(String alarmHandleResult) {
		this.alarmHandleResult = alarmHandleResult;
	}
	
	public String getAlarmHandleResult() {
		return this.alarmHandleResult;
	}
	
	public void setAlarmCause(String alarmCause) {
		this.alarmCause = alarmCause;
	}
	
	public String getAlarmCause() {
		return this.alarmCause;
	}
	
	public void setAlarmType(Integer alarmType) {
		this.alarmType = alarmType;
	}
	
	public Integer getAlarmType() {
		return this.alarmType;
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
