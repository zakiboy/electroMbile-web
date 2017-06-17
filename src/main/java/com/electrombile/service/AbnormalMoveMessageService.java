package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electrombile.dao.AbnormalMoveMessageDao;
import com.electrombile.model.AbnormalMoveMessage;


@Service
public class AbnormalMoveMessageService {

	@Autowired
	private AbnormalMoveMessageDao abnormalDao;
	
	public int insertAbnormalMoveMessage(AbnormalMoveMessage abnormalMoveMessage){
		return abnormalDao.insertAbnormalMoveMessage(abnormalMoveMessage);
	}

	public int deleteAbnormalMoveMessage(Integer id){
		return abnormalDao.deleteAbnormalMoveMessage(id);
	}

	public int updateAbnormalMoveMessage(AbnormalMoveMessage abnormalMoveMessage){
		return abnormalDao.updateAbnormalMoveMessage(abnormalMoveMessage);
	}

	public AbnormalMoveMessage loadAbnormalMoveMessage(Integer id){
		return abnormalDao.loadAbnormalMoveMessage(id);
	}

	public List<AbnormalMoveMessage> queryList(AbnormalMoveMessage abnormalMoveMessage){
		return abnormalDao.queryList(abnormalMoveMessage);
	}

	public List<AbnormalMoveMessage> queryPageList(AbnormalMoveMessage abnormalMoveMessage){
		return abnormalDao.queryPageList(abnormalMoveMessage);
	}

	public int queryCount(AbnormalMoveMessage abnormalMoveMessage){
		return abnormalDao.queryCount(abnormalMoveMessage);
	}
}
