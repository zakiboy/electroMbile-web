package com.electrombile.request;

public class ChildrenRule {

	/**角色ID**/
	private Integer ruleId;
	/**角色名称**/
	private String ruleName;
	/**角色菜单连接地址**/
	private String ruleUrl;
	/**角色父级**/
	private Integer ruleBelong;
	/**角色排名**/
	private Integer ruleRank;
	/**用户是否已拥有此菜单 0 是 1否**/
	private Integer owner;
	/**
	 * @return the ruleName
	 */
	public String getRuleName() {
		return ruleName;
	}
	/**
	 * @param ruleName the ruleName to set
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	/**
	 * @return the ruleUrl
	 */
	public String getRuleUrl() {
		return ruleUrl;
	}
	/**
	 * @param ruleUrl the ruleUrl to set
	 */
	public void setRuleUrl(String ruleUrl) {
		this.ruleUrl = ruleUrl;
	}
	/**
	 * @return the ruleBelong
	 */
	public Integer getRuleBelong() {
		return ruleBelong;
	}
	/**
	 * @param ruleBelong the ruleBelong to set
	 */
	public void setRuleBelong(Integer ruleBelong) {
		this.ruleBelong = ruleBelong;
	}
	/**
	 * @return the ruleRank
	 */
	public Integer getRuleRank() {
		return ruleRank;
	}
	/**
	 * @param ruleRank the ruleRank to set
	 */
	public void setRuleRank(Integer ruleRank) {
		this.ruleRank = ruleRank;
	}
	/**
	 * @return the ruleId
	 */
	public Integer getRuleId() {
		return ruleId;
	}
	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
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
	
}
