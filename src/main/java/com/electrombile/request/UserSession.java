package com.electrombile.request;

import java.util.List;

public class UserSession {
	
	private Integer userId;
	
	private String userName;
	
	private Integer userRuleBelong;
	
	private List<RuleSession> ruleList;

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

	/**
	 * @return the userRuleBelong
	 */
	public Integer getUserRuleBelong() {
		return userRuleBelong;
	}

	/**
	 * @param userRuleBelong the userRuleBelong to set
	 */
	public void setUserRuleBelong(Integer userRuleBelong) {
		this.userRuleBelong = userRuleBelong;
	}

	/**
	 * @return the ruleList
	 */
	public List<RuleSession> getRuleList() {
		return ruleList;
	}

	/**
	 * @param ruleList the ruleList to set
	 */
	public void setRuleList(List<RuleSession> ruleList) {
		this.ruleList = ruleList;
	}
	
}
