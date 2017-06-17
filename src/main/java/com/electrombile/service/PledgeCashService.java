package com.electrombile.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electrombile.dao.PledgeCashDao;
import com.electrombile.model.PledgeCash;

@Service
public class PledgeCashService {

	@Autowired
	private PledgeCashDao pledgeDao;
	
	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int insertPledgeCash(PledgeCash pledgeCash){
		return pledgeDao.insertPledgeCash(pledgeCash);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deletePledgeCash(Integer id){
		return pledgeDao.deletePledgeCash(id);
	}

	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int updatePledgeCash(PledgeCash pledgeCash){
		return pledgeDao.updatePledgeCash(pledgeCash);
	}

	/**
	 * @param id
	 * @return PledgeCash
	 */
	public PledgeCash loadPledgeCash(Integer id){
		return pledgeDao.loadPledgeCash(id);
	}

	/**
	 * @param pledgeCash
	 * @return List<PledgeCash>
	 */
	public List<PledgeCash> queryList(PledgeCash pledgeCash){
		return pledgeDao.queryList(pledgeCash);
	}

	/**
	 * @param pledgeCash
	 * @return List<PledgeCash>
	 */
	public List<PledgeCash> queryPageList(PledgeCash pledgeCash){
		return pledgeDao.queryPageList(pledgeCash);
	}

	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int queryCount(PledgeCash pledgeCash){
		return pledgeDao.queryCount(pledgeCash);
	}
	
}
