package com.electrombile.response;

import java.util.Date;

public class RepairsMessageResponse {
	
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
	/**
	 * @return the reparirsId
	 */
	public Integer getReparirsId() {
		return reparirsId;
	}
	/**
	 * @param reparirsId the reparirsId to set
	 */
	public void setReparirsId(Integer reparirsId) {
		this.reparirsId = reparirsId;
	}
	/**
	 * @return the reparirsType
	 */
	public Integer getReparirsType() {
		return reparirsType;
	}
	/**
	 * @param reparirsType the reparirsType to set
	 */
	public void setReparirsType(Integer reparirsType) {
		this.reparirsType = reparirsType;
	}
	/**
	 * @return the reparirsDescribe
	 */
	public String getReparirsDescribe() {
		return reparirsDescribe;
	}
	/**
	 * @param reparirsDescribe the reparirsDescribe to set
	 */
	public void setReparirsDescribe(String reparirsDescribe) {
		this.reparirsDescribe = reparirsDescribe;
	}
	/**
	 * @return the reparirsResult
	 */
	public String getReparirsResult() {
		return reparirsResult;
	}
	/**
	 * @param reparirsResult the reparirsResult to set
	 */
	public void setReparirsResult(String reparirsResult) {
		this.reparirsResult = reparirsResult;
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
	 * @return the reparirsElectric
	 */
	public String getReparirsElectric() {
		return reparirsElectric;
	}
	/**
	 * @param reparirsElectric the reparirsElectric to set
	 */
	public void setReparirsElectric(String reparirsElectric) {
		this.reparirsElectric = reparirsElectric;
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
	 * @return the reparirsDate
	 */
	public Date getReparirsDate() {
		return reparirsDate;
	}
	/**
	 * @param reparirsDate the reparirsDate to set
	 */
	public void setReparirsDate(Date reparirsDate) {
		this.reparirsDate = reparirsDate;
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
