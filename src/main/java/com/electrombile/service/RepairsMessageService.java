package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electrombile.dao.RepairsMessageDao;
import com.electrombile.model.RepairsMessage;

@Service
public class RepairsMessageService {
	
	@Autowired
	private RepairsMessageDao repairsDao;
	
	public int insertRepairsMessage(RepairsMessage repairsMessage){
		return repairsDao.insertRepairsMessage(repairsMessage);
	}

	public int deleteRepairsMessage(Integer id){
		return repairsDao.deleteRepairsMessage(id);
	}

	public int updateRepairsMessage(RepairsMessage repairsMessage){
		return repairsDao.updateRepairsMessage(repairsMessage);
	}

	public RepairsMessage loadRepairsMessage(Integer id){
		return repairsDao.loadRepairsMessage(id);
	}

	public List<RepairsMessage> queryList(RepairsMessage repairsMessage){
		return repairsDao.queryList(repairsMessage);
	}

	public List<RepairsMessage> queryPageList(RepairsMessage repairsMessage){
		return repairsDao.queryPageList(repairsMessage);
	}

	public int queryCount(RepairsMessage repairsMessage){
		return repairsDao.queryCount(repairsMessage);
	}
	
}
