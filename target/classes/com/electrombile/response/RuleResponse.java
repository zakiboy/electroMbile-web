package com.electrombile.response;

import java.util.List;

import com.electrombile.model.RuleInfo;

public class RuleResponse {

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
	/**角色状态**/
	private Integer ruleStatus;
	/**角色代码**/
	private Integer ruleCode;
	
	private List<RuleInfo> childrens;
	
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
	 * @return the ruleStatus
	 */
	public Integer getRuleStatus() {
		return ruleStatus;
	}
	/**
	 * @param ruleStatus the ruleStatus to set
	 */
	public void setRuleStatus(Integer ruleStatus) {
		this.ruleStatus = ruleStatus;
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
	public List<RuleInfo> getChildrens() {
		return childrens;
	}
	/**
	 * @param childrens the childrens to set
	 */
	public void setChildrens(List<RuleInfo> childrens) {
		this.childrens = childrens;
	}

}
