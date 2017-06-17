package com.electrombile.request;

import java.util.List;

public class RuleSession {
	
	/**角色ID**/
	private Integer ruleId;
	/**角色名称**/
	private String ruleName;
	/**角色菜单连接地址**/
	private String ruleUrl;
	/**角色代码**/
	private Integer ruleCode;
	/**子级菜单**/
	private List<ChildrenRule> childrens;
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
	 * @return the ruleCode
	 */
	public Integer getRuleCode() {
		return ruleCode;
	}
	/**
	 * @param ruleCode the ruleCode to set
	 */
	public void setRuleCode(Integer ruleCode) {
		this.ruleCode = ruleCode;
	}
	/**
	 * @return the childrens
	 */
	public List<ChildrenRule> getChildrens() {
		return childrens;
	}
	/**
	 * @param childrens the childrens to set
	 */
	public void setChildrens(List<ChildrenRule> childrens) {
		this.childrens = childrens;
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
