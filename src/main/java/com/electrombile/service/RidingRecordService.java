package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electrombile.dao.RidingRecordDao;
import com.electrombile.model.RidingRecord;


@Service
public class RidingRecordService {
	
	@Autowired
	private RidingRecordDao recordDao;

	public int insertRidingRecord(RidingRecord ridingRecord){
		return recordDao.insertRidingRecord(ridingRecord);
	}

	public int deleteRidingRecord(Integer id){
		return recordDao.deleteRidingRecord(id);
	}

	public int updateRidingRecord(RidingRecord ridingRecord){
		return recordDao.updateRidingRecord(ridingRecord);
	}

	public RidingRecord loadRidingRecord(Integer id){
		return recordDao.loadRidingRecord(id);
	}

	public List<RidingRecord> queryList(RidingRecord ridingRecord){
		return recordDao.queryList(ridingRecord);
	}

	public List<RidingRecord> queryPageList(RidingRecord ridingRecord){
		return recordDao.queryPageList(ridingRecord);
	}

	public int queryCount(RidingRecord ridingRecord){
		return recordDao.queryCount(ridingRecord);
	}
	
}
