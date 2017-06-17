package com.electrombile.model;


/**
 * UserMenu
 *
 */
public class UserMenu {
	
	/**用户id**/
	private Integer userId;
	/**菜单id**/
	private Integer menuId;
	/**菜单url**/
	private String menuUrl;
	/**备注字段1**/
	private String remark1;
	/**备注字段2**/
	private String remark2;
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
	 * @return the menuId
	 */
	public Integer getMenuId() {
		return menuId;
	}
	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	/**
	 * @return the menuUrl
	 */
	public String getMenuUrl() {
		return menuUrl;
	}
	/**
	 * @param menuUrl the menuUrl to set
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	/**
	 * @return the remark1
	 */
	public String getRemark1() {
		return remark1;
	}
	/**
	 * @param remark1 the remark1 to set
	 */
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	/**
	 * @return the remark2
	 */
	public String getRemark2() {
		return remark2;
	}
	/**
	 * @param remark2 the remark2 to set
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
	
}
