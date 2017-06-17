package com.electrombile.model;

import java.io.Serializable;

/**
 * DepartmentInfo
 * 
 * */
public class DepartmentInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1113540072150375252L;
	/**部门ID**/
	private Integer departmentId;
	/**部门名称**/
	private String departmentName;
	/**部门编号**/
	private String departmentNo;
	/**部门状态**/
	private Integer departmentStatus;
	/**
	 * 获取departmentId
	 * @return departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * 设置departmentId
	 * @param departmentId
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * 获取departmentName
	 * @return departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * 设置departmentName
	 * @param departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * 获取departmentNo
	 * @return departmentNo
	 */
	public String getDepartmentNo() {
		return departmentNo;
	}
	/**
	 * 设置departmentNo
	 * @param departmentNo
	 */
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	/**
	 * 获取departmentStatus
	 * @return departmentStatus
	 */
	public Integer getDepartmentStatus() {
		return departmentStatus;
	}
	/**
	 * 设置departmentStatus
	 * @param departmentStatus
	 */
	public void setDepartmentStatus(Integer departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	
}
