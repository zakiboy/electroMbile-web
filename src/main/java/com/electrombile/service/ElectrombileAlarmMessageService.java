package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.ElectrombileAlarmMessageDao;
import com.electrombile.model.ElectrombileAlarmMessage;

@Service
@Transactional
public class ElectrombileAlarmMessageService {
	
	@Autowired
	private ElectrombileAlarmMessageDao alarmMessageDao;

	public int insertElectrombileAlarmMessage(ElectrombileAlarmMessage electrombileAlarmMessage){
		return alarmMessageDao.insertElectrombileAlarmMessage(electrombileAlarmMessage);
	}

	public int deleteElectrombileAlarmMessage(Integer id){
		return alarmMessageDao.deleteElectrombileAlarmMessage(id);
	}

	public int updateElectrombileAlarmMessage(ElectrombileAlarmMessage electrombileAlarmMessage){
		return alarmMessageDao.updateElectrombileAlarmMessage(electrombileAlarmMessage);
	}

	public ElectrombileAlarmMessage loadElectrombileAlarmMessage(Integer id){
		return alarmMessageDao.loadElectrombileAlarmMessage(id);
	}

	public List<ElectrombileAlarmMessage> queryList(ElectrombileAlarmMessage electrombileAlarmMessage){
		return alarmMessageDao.queryList(electrombileAlarmMessage);
	}

	public List<ElectrombileAlarmMessage> queryPageList(ElectrombileAlarmMessage electrombileAlarmMessage){
		return alarmMessageDao.queryPageList(electrombileAlarmMessage);
	}

	public int queryCount(ElectrombileAlarmMessage electrombileAlarmMessage){
		return alarmMessageDao.queryCount(electrombileAlarmMessage);
	}
}
