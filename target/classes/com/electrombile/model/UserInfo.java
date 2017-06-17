package com.electrombile.model;

import java.util.Date;
import java.util.List;

/**
 * UserInfo
 *
 */
public class UserInfo {

	/**用户ID**/
	private Integer userId;
	/**用户性别**/
	private String userSex;
	/**用户名称**/
	private String userName;
	/**用户密码**/
	private String userPassword;
	/**联系方式**/
	private String userPhone;
	/**用户生日**/
	private Date userBirthday;
	/**用户工号**/
	private String userJobNumber;
	/**入职日期**/
	private Date userEntryDate;
	/**用户角色 0 超级管理员(查询所有菜单) 1 其他管理员 **/
	private Integer userRuleBelong;
	/**用户状态**/
	private Integer userStatus;
	/**用户部门ID**/
	private Integer departmentId;
	/**职位名称**/
	private String departmentName;
	/**用户菜单**/
	private List<UserMenu> menus;
	
	/**
	 * 获取userId
	 * @return userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置userId
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取userSex
	 * @return userSex
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * 设置userSex
	 * @param userSex
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * 获取userName
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取userPassword
	 * @return userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * 设置userPassword
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * 获取userPhone
	 * @return userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}
	/**
	 * 设置userPhone
	 * @param userPhone
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	 * 获取userBirthday
	 * @return userBirthday
	 */
	public Date getUserBirthday() {
		return userBirthday;
	}
	/**
	 * 设置userBirthday
	 * @param userBirthday
	 */
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	/**
	 * 获取userJobNumber
	 * @return userJobNumber
	 */
	public String getUserJobNumber() {
		return userJobNumber;
	}
	/**
	 * 设置userJobNumber
	 * @param userJobNumber
	 */
	public void setUserJobNumber(String userJobNumber) {
		this.userJobNumber = userJobNumber;
	}
	/**
	 * 获取userEntryDate
	 * @return userEntryDate
	 */
	public Date getUserEntryDate() {
		return userEntryDate;
	}
	/**
	 * 设置userEntryDate
	 * @param userEntryDate
	 */
	public void setUserEntryDate(Date userEntryDate) {
		this.userEntryDate = userEntryDate;
	}
	/**
	 * 获取userRuleBelong
	 * @return userRuleBelong
	 */
	public Integer getUserRuleBelong() {
		return userRuleBelong;
	}
	/**
	 * 设置userRuleBelong
	 * @param userRuleBelong
	 */
	public void setUserRuleBelong(Integer userRuleBelong) {
		this.userRuleBelong = userRuleBelong;
	}
	/**
	 * 获取userStatus
	 * @return userStatus
	 */
	public Integer getUserStatus() {
		return userStatus;
	}
	/**
	 * 设置userStatus
	 * @param userStatus
	 */
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
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
	 * @return the menus
	 */
	public List<UserMenu> getMenus() {
		return menus;
	}
	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<UserMenu> menus) {
		this.menus = menus;
	}
	
}
