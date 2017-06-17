package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.AbnormalMoveMessage;

@Repository
public interface AbnormalMoveMessageDao {

	public int insertAbnormalMoveMessage(AbnormalMoveMessage abnormalMoveMessage);

	public int deleteAbnormalMoveMessage(Integer id);

	public int updateAbnormalMoveMessage(AbnormalMoveMessage abnormalMoveMessage);

	public AbnormalMoveMessage loadAbnormalMoveMessage(Integer id);

	public List<AbnormalMoveMessage> queryList(AbnormalMoveMessage abnormalMoveMessage);

	public List<AbnormalMoveMessage> queryPageList(AbnormalMoveMessage abnormalMoveMessage);

	public int queryCount(AbnormalMoveMessage abnormalMoveMessage);
	
}
