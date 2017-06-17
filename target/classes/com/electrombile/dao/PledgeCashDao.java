package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.PledgeCash;

/**
 * @author admin
 *
 */
@Repository
public interface PledgeCashDao{

	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int insertPledgeCash(PledgeCash pledgeCash);

	/**
	 * @param id
	 * @return int
	 */
	public int deletePledgeCash(Integer id);

	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int updatePledgeCash(PledgeCash pledgeCash);

	/**
	 * @param id
	 * @return PledgeCash
	 */
	public PledgeCash loadPledgeCash(Integer id);

	/**
	 * @param pledgeCash
	 * @return List<PledgeCash>
	 */
	public List<PledgeCash> queryList(PledgeCash pledgeCash);

	/**
	 * @param pledgeCash
	 * @return List<PledgeCash>
	 */
	public List<PledgeCash> queryPageList(PledgeCash pledgeCash);

	/**
	 * @param pledgeCash
	 * @return int
	 */
	public int queryCount(PledgeCash pledgeCash);

}
