package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.RidingRecord;

@Repository
public interface RidingRecordDao {

	public int insertRidingRecord(RidingRecord ridingRecord);

	public int deleteRidingRecord(Integer id);

	public int updateRidingRecord(RidingRecord ridingRecord);

	public RidingRecord loadRidingRecord(Integer id);

	public List<RidingRecord> queryList(RidingRecord ridingRecord);

	public List<RidingRecord> queryPageList(RidingRecord ridingRecord);

	public int queryCount(RidingRecord ridingRecord);
	
}
