package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.DealInfo;

/**
 * @author admin
 *
 */
@Repository
public interface DealInfoDao{

	/**
	 * @param dealInfo
	 * @return int
	 */
	public int insertDealInfo(DealInfo dealInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteDealInfo(Integer id);

	/**
	 * @param dealInfo
	 * @return int
	 */
	public int updateDealInfo(DealInfo dealInfo);

	/**
	 * @param id
	 * @return DealInfo
	 */
	public DealInfo loadDealInfo(Integer id);

	/**
	 * @param dealInfo
	 * @return List<DealInfo>
	 */
	public List<DealInfo> queryList(DealInfo dealInfo);

	/**
	 * @param dealInfo
	 * @return List<DealInfo>
	 */
	public List<DealInfo> queryPageList(DealInfo dealInfo);

	/**
	 * @param dealInfo
	 * @return int
	 */
	public int queryCount(DealInfo dealInfo);

}
