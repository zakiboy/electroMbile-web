package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.ElectrombileInfoDao;
import com.electrombile.model.ElectrombileInfo;


/**
 * @author admin
 *
 */
@Service
@Transactional
public class ElectrombileInfoService {
	
	@Autowired
	private ElectrombileInfoDao mbileInfoDao;

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int insertElectrombileInfo(ElectrombileInfo electrombileInfo){
		return mbileInfoDao.insertElectrombileInfo(electrombileInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteElectrombileInfo(Integer id){
		return mbileInfoDao.deleteElectrombileInfo(id);
	}

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int updateElectrombileInfo(ElectrombileInfo electrombileInfo){
		return mbileInfoDao.updateElectrombileInfo(electrombileInfo);
	}

	/**
	 * @param id
	 * @return ElectrombileInfo
	 */
	public ElectrombileInfo loadElectrombileInfo(Integer id){
		return mbileInfoDao.loadElectrombileInfo(id);
	}

	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryList(ElectrombileInfo electrombileInfo){
		return mbileInfoDao.queryList(electrombileInfo);
	}

	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryPageList(ElectrombileInfo electrombileInfo){
		return mbileInfoDao.queryPageList(electrombileInfo);
	}

	/**
	 * @param electrombileInfo
	 * @return int
	 */
	public int queryCount(ElectrombileInfo electrombileInfo){
		return mbileInfoDao.queryCount(electrombileInfo);
	}
	/**
	 * @param electrombileInfo
	 * @return List<ElectrombileInfo>
	 */
	public List<ElectrombileInfo> queryScopeMbilePageList(ElectrombileInfo electrombileInfo){
		List<ElectrombileInfo> elects = mbileInfoDao.queryScopeMbilePageList(electrombileInfo);
		for (ElectrombileInfo elect:elects) {
			elect.setElectrombileCoordinate(elect.getElectrombileLongitude()+","+elect.getElectrombileLatitude());
		}
		return elects;
	}
	
}
