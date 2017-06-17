package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.MemberInfo;

/**
 * @author admin
 *
 */
@Repository
public interface MemberInfoDao{

	/**
	 * @param memberInfo
	 * @return int
	 */
	public int insertMemberInfo(MemberInfo memberInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteMemberInfo(Integer id);

	/**
	 * @param memberInfo
	 * @return int
	 */
	public int updateMemberInfo(MemberInfo memberInfo);

	/**
	 * @param id
	 * @return MemberInfo
	 */
	public MemberInfo loadMemberInfo(Integer id);
	
	
	/**
	 * @param openId
	 * @return MemberInfo
	 */
	public MemberInfo findMemberInfoByOpenId(String openId);

	/**
	 * @param memberInfo
	 * @return List<MemberInfo>
	 */
	public List<MemberInfo> queryList(MemberInfo memberInfo);

	/**
	 * @param memberInfo
	 * @return List<MemberInfo>
	 */
	public List<MemberInfo> queryPageList(MemberInfo memberInfo);

	/**
	 * @param memberInfo
	 * @return int
	 */
	public int queryCount(MemberInfo memberInfo);

}
