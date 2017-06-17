package com.electrombile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.MemberInfoDao;
import com.electrombile.model.MemberInfo;

/**
 * @author admin
 *
 */
@Service
@Transactional
public class MemberinfoService {
	
	@Autowired
	private MemberInfoDao memberDao;
	
	/**
	 * @param memberInfo
	 * @return int
	 */
	public int insertMemberInfo(MemberInfo memberInfo){
		return memberDao.insertMemberInfo(memberInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteMemberInfo(Integer id){
		return memberDao.deleteMemberInfo(id);
	}

	/**
	 * @param memberInfo
	 * @return int
	 */
	public int updateMemberInfo(MemberInfo memberInfo){
		return memberDao.updateMemberInfo(memberInfo);
	}

	/**
	 * @param id
	 * @return MemberInfo
	 */
	public MemberInfo loadMemberInfo(Integer id){
		return memberDao.loadMemberInfo(id);
	}
	
	/**
	 * @param openId
	 * @return MemberInfo
	 */
	public MemberInfo findMemberInfoByOpenId(String openId){
		return memberDao.findMemberInfoByOpenId(openId);
	}

	/**
	 * @param memberInfo
	 * @return List<MemberInfo>
	 */
	public List<MemberInfo> queryList(MemberInfo memberInfo){
		return memberDao.queryList(memberInfo);
	}

	/**
	 * @param memberInfo
	 * @return List<MemberInfo>
	 */
	public List<MemberInfo> queryPageList(MemberInfo memberInfo){
		return memberDao.queryPageList(memberInfo);
	}

	/**
	 * @param memberInfo
	 * @return int
	 */
	public int queryCount(MemberInfo memberInfo){
		return memberDao.queryCount(memberInfo);
	}
	
}
