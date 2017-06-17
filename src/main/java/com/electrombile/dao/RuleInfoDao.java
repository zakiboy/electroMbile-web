package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.RuleInfo;

/**
 * @author admin
 *
 */
@Repository
public interface RuleInfoDao{

	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int insertRuleInfo(RuleInfo ruleInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteRuleInfo(Integer id);

	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int updateRuleInfo(RuleInfo ruleInfo);

	/**
	 * @param id
	 * @return RuleInfo
	 */
	public RuleInfo loadRuleInfo(Integer id);

	/**
	 * @param ruleInfo
	 * @return List<DealInfo>
	 */
	public List<RuleInfo> queryList(RuleInfo ruleInfo);

	/**
	 * @param ruleInfo
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryPageList(RuleInfo ruleInfo);

	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int queryCount(RuleInfo ruleInfo);
	
	//根据用户角色查询菜单
	/**
	 * @param id
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByRuleId(List ids);
	
	//根据父级菜单查询子菜单
	/**
	 * @param id
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByBelong(Integer id);
	
	//根据父级菜单查询非管理员用户的子菜单
	/**
	 * @param id
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByRuleCode(RuleInfo ruleInfo);
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryListForMenu();
	
	/**查询所有菜单
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryAllListForMenu();
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryListForMenuByUser(Integer userId);
}
