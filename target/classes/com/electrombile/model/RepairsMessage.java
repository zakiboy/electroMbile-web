package com.electrombile.model;

import java.util.Date;

public class RepairsMessage {

	/**保修表ID**/
	private Integer reparirsId;
	/**报修类型0开不开锁1电量不足2二维码损坏3车头损坏4电量不足5车胎损坏6车开不了**/
	private Integer reparirsType;
	/**报修原因描述**/
	private String reparirsDescribe;
	/**修理结果**/
	private String reparirsResult;
	/**电动车ID**/
	private Integer departmentId;
	/**当前电量**/
	private String reparirsElectric;
	/**报修人员openID**/
	private String memberOpenId;
	/**维修时间**/
	private Date reparirsDate;
	/**维修人员ID**/
	private Integer userId;
	/**维修人员登录账号**/
	private String userName;
	/**备注字段**/
	private Integer reparirsStatus;
	/**备注字段1**/
	private String remark1;
	/**车辆位置**/
	private String electrombileCoordinate;
	/**车辆电量**/
	private String electrombileElectric;
	/**电动车编号**/
	private String electrombileNo;
	
	public void setReparirsId(Integer reparirsId) {
		this.reparirsId = reparirsId;
	}
	
	public Integer getReparirsId() {
		return this.reparirsId;
	}
	
	public void setReparirsType(Integer reparirsType) {
		this.reparirsType = reparirsType;
	}
	
	public Integer getReparirsType() {
		return this.reparirsType;
	}
	
	public void setReparirsDescribe(String reparirsDescribe) {
		this.reparirsDescribe = reparirsDescribe;
	}
	
	public String getReparirsDescribe() {
		return this.reparirsDescribe;
	}
	
	public void setReparirsResult(String reparirsResult) {
		this.reparirsResult = reparirsResult;
	}
	
	public String getReparirsResult() {
		return this.reparirsResult;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	
	public void setReparirsElectric(String reparirsElectric) {
		this.reparirsElectric = reparirsElectric;
	}
	
	public String getReparirsElectric() {
		return this.reparirsElectric;
	}
	
	public void setMemberOpenId(String memberOpenId) {
		this.memberOpenId = memberOpenId;
	}
	
	public String getMemberOpenId() {
		return this.memberOpenId;
	}
	
	public void setReparirsDate(Date reparirsDate) {
		this.reparirsDate = reparirsDate;
	}
	
	public Date getReparirsDate() {
		return this.reparirsDate;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setReparirsStatus(Integer reparirsStatus) {
		this.reparirsStatus = reparirsStatus;
	}
	
	public Integer getReparirsStatus() {
		return this.reparirsStatus;
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

	/**
	 * @return the electrombileCoordinate
	 */
	public String getElectrombileCoordinate() {
		return electrombileCoordinate;
	}

	/**
	 * @param electrombileCoordinate the electrombileCoordinate to set
	 */
	public void setElectrombileCoordinate(String electrombileCoordinate) {
		this.electrombileCoordinate = electrombileCoordinate;
	}

	/**
	 * @return the electrombileElectric
	 */
	public String getElectrombileElectric() {
		return electrombileElectric;
	}

	/**
	 * @param electrombileElectric the electrombileElectric to set
	 */
	public void setElectrombileElectric(String electrombileElectric) {
		this.electrombileElectric = electrombileElectric;
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
