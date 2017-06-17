package com.electrombile.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.RuleInfoDao;
import com.electrombile.model.RuleInfo;

/**
 * @author admin
 *
 */
@Service
@Transactional
public class RuleInfoService {

	@Resource
	private RuleInfoDao ruleInfoDao;
	
	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int insertRuleInfo(RuleInfo ruleInfo) {
		// TODO Auto-generated method stub
		return ruleInfoDao.insertRuleInfo(ruleInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteRuleInfo(Integer id) {
		// TODO Auto-generated method stub
		return ruleInfoDao.deleteRuleInfo(id);
	}

	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int updateRuleInfo(RuleInfo ruleInfo) {
		// TODO Auto-generated method stub
		return ruleInfoDao.updateRuleInfo(ruleInfo);
	}

	/**
	 * @param id
	 * @return RuleInfo
	 */
	public RuleInfo loadRuleInfo(Integer id) {
		// TODO Auto-generated method stub
		return ruleInfoDao.loadRuleInfo(id);
	}
	
	/**
	 * @param id
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByRuleId(List ids) {
		// TODO Auto-generated method stub
		return ruleInfoDao.findRuleListByRuleId(ids);
	}

	/**
	 * @param ruleInfo
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryList(RuleInfo ruleInfo) {
		// TODO Auto-generated method stub
		return ruleInfoDao.queryList(ruleInfo);
	}

	/**
	 * @param ruleInfo
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryPageList(RuleInfo ruleInfo) {
		// TODO Auto-generated method stub
		return ruleInfoDao.queryPageList(ruleInfo);
	}

	/**
	 * @param ruleInfo
	 * @return int
	 */
	public int queryCount(RuleInfo ruleInfo) {
		// TODO Auto-generated method stub
		return ruleInfoDao.queryCount(ruleInfo);
	}

	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryListForMenu(){
		return ruleInfoDao.queryListForMenu();
	}
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryAllListForMenu(){
		return ruleInfoDao.queryAllListForMenu();
	}
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> queryListForMenuByUser(Integer userId){
		return ruleInfoDao.queryListForMenuByUser(userId);
	}
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByBelong(Integer id){
		return ruleInfoDao.findRuleListByBelong(id);
	}
	
	/**
	 * @return List<RuleInfo>
	 */
	public List<RuleInfo> findRuleListByRuleCode(RuleInfo ruleInfo){
		return ruleInfoDao.findRuleListByRuleCode(ruleInfo);
	}
	
}
