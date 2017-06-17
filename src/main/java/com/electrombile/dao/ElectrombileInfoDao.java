package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.ElectrombileInfo;

/**
 * @author admin
 *
 */
@Repository
public interface ElectrombileInfoDao{

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int insertElectrombileInfo(ElectrombileInfo electrombileInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteElectrombileInfo(Integer id);

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int updateElectrombileInfo(ElectrombileInfo electrombileInfo);

	/**
	 * @param id
	 * @return ElectrombileInfo
	 */
	public ElectrombileInfo loadElectrombileInfo(Integer id);

	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryList(ElectrombileInfo electrombileInfo);

	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryScopeMbilePageList(ElectrombileInfo electrombileInfo);
	
	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryPageList(ElectrombileInfo electrombileInfo);

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int queryCount(ElectrombileInfo electrombileInfo);

}