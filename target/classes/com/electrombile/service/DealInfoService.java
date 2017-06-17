package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electrombile.dao.DealInfoDao;
import com.electrombile.model.DealInfo;


@Service
public class DealInfoService {

	@Autowired
	private DealInfoDao dealInfoDao;
	
	
	/**
	 * @param dealInfo
	 * @return int
	 */
	public int insertDealInfo(DealInfo dealInfo){
		return dealInfoDao.insertDealInfo(dealInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteDealInfo(Integer id){
		return dealInfoDao.deleteDealInfo(id);
	}

	/**
	 * @param dealInfo
	 * @return int
	 */
	public int updateDealInfo(DealInfo dealInfo){
		return dealInfoDao.updateDealInfo(dealInfo);
	}

	/**
	 * @param id
	 * @return DealInfo
	 */
	public DealInfo loadDealInfo(Integer id){
		return dealInfoDao.loadDealInfo(id);
	}

	/**
	 * @param dealInfo
	 * @return List<DealInfo>
	 */
	public List<DealInfo> queryList(DealInfo dealInfo){
		return dealInfoDao.queryList(dealInfo);
	}

	/**
	 * @param dealInfo
	 * @return List<DealInfo>
	 */
	public List<DealInfo> queryPageList(DealInfo dealInfo){
		return dealInfoDao.queryPageList(dealInfo);
	}

	/**
	 * @param dealInfo
	 * @return int
	 */
	public int queryCount(DealInfo dealInfo){
		return dealInfoDao.queryCount(dealInfo);
	}	
	
}
