package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.RepairsMessage;

@Repository
public interface RepairsMessageDao {

	public int insertRepairsMessage(RepairsMessage repairsMessage);

	public int deleteRepairsMessage(Integer id);

	public int updateRepairsMessage(RepairsMessage repairsMessage);

	public RepairsMessage loadRepairsMessage(Integer id);

	public List<RepairsMessage> queryList(RepairsMessage repairsMessage);

	public List<RepairsMessage> queryPageList(RepairsMessage repairsMessage);

	public int queryCount(RepairsMessage repairsMessage);
	
}
