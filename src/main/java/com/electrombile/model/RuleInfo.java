package com.electrombile.model;

/**
 * RuleInfo
 *
 */
public class RuleInfo {
	
	/**角色ID**/
	private Integer ruleId;
	/**角色名称**/
	private String ruleName;
	/**角色菜单连接地址**/
	private String ruleUrl;
	/**角色菜单地址集合**/
	private String ruleUrlMenu;
	/**角色父级**/
	private Integer ruleBelong;
	/**角色排名**/
	private Integer ruleRank;
	/**角色状态**/
	private Integer ruleStatus;
	/**角色代码**/
	private Integer ruleCode;
	/**用户是否已拥有此菜单 0 是 1否**/
	private Integer owner;
	/**用户ID**/
	private Integer userId;
	/**
	 * 获取ruleId
	 * @return ruleId
	 */
	public Integer getRuleId() {
		return ruleId;
	}
	/**
	 * 设置ruleId
	 * @param ruleId
	 */
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	/**
	 * 获取ruleName
	 * @return ruleName
	 */
	public String getRuleName() {
		return ruleName;
	}
	/**
	 * 设置ruleName
	 * @param ruleName
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	/**
	 * 获取ruleUrl
	 * @return ruleUrl
	 */
	public String getRuleUrl() {
		return ruleUrl;
	}
	/**
	 * 设置ruleUrl
	 * @param ruleUrl
	 */
	public void setRuleUrl(String ruleUrl) {
		this.ruleUrl = ruleUrl;
	}
	/**
	 * @return the ruleUrlMenu
	 */
	public String getRuleUrlMenu() {
		return ruleUrlMenu;
	}
	/**
	 * @param ruleUrlMenu the ruleUrlMenu to set
	 */
	public void setRuleUrlMenu(String ruleUrlMenu) {
		this.ruleUrlMenu = ruleUrlMenu;
	}
	/**
	 * 获取ruleBelong
	 * @return ruleBelong
	 */
	public Integer getRuleBelong() {
		return ruleBelong;
	}
	/**
	 * 设置ruleBelong
	 * @param ruleBelong
	 */
	public void setRuleBelong(Integer ruleBelong) {
		this.ruleBelong = ruleBelong;
	}
	/**
	 * 获取ruleRank
	 * @return ruleRank
	 */
	public Integer getRuleRank() {
		return ruleRank;
	}
	/**
	 * 设置ruleRank
	 * @param ruleRank
	 */
	public void setRuleRank(Integer ruleRank) {
		this.ruleRank = ruleRank;
	}
	/**
	 * 获取ruleStatus
	 * @return ruleStatus
	 */
	public Integer getRuleStatus() {
		return ruleStatus;
	}
	/**
	 * 设置ruleStatus
	 * @param ruleStatus
	 */
	public void setRuleStatus(Integer ruleStatus) {
		this.ruleStatus = ruleStatus;
	}
	/**
	 * 获取ruleCode
	 * @return ruleCode
	 */
	public Integer getRuleCode() {
		return ruleCode;
	}
	/**
	 * 设置ruleCode
	 * @param ruleCode
	 */
	public void setRuleCode(Integer ruleCode) {
		this.ruleCode = ruleCode;
	}
	/**
	 * @return the owner
	 */
	public Integer getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Integer owner) {
		this.owner = owner;
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
	
}
