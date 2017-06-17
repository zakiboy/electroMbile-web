package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.ElectrombileAlarmMessage;


@Repository
public interface ElectrombileAlarmMessageDao {

	
	public int insertElectrombileAlarmMessage(ElectrombileAlarmMessage electrombileAlarmMessage);

	public int deleteElectrombileAlarmMessage(Integer id);

	public int updateElectrombileAlarmMessage(ElectrombileAlarmMessage electrombileAlarmMessage);

	public ElectrombileAlarmMessage loadElectrombileAlarmMessage(Integer id);

	public List<ElectrombileAlarmMessage> queryList(ElectrombileAlarmMessage electrombileAlarmMessage);

	public List<ElectrombileAlarmMessage> queryPageList(ElectrombileAlarmMessage electrombileAlarmMessage);

	public int queryCount(ElectrombileAlarmMessage electrombileAlarmMessage);
	
}
