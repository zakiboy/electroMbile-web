package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.UserInfo;

/**
 * @author admin
 *
 */
@Repository
public interface UserInfoDao{

	/**
	 * @param userInfo
	 * @return int
	 */
	public int insertUserInfo(UserInfo userInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteUserInfo(Integer id);

	/**
	 * @param userInfo
	 * @return int
	 */
	public int updateUserInfo(UserInfo userInfo);

	/**
	 * @param id
	 * @return int
	 */
	public UserInfo loadUserInfo(Integer id);

	/**
	 * @param userInfo
	 * @return int
	 */
	public List<UserInfo> queryList(UserInfo userInfo);

	/**
	 * @param userInfo
	 * @return int
	 */
	public List<UserInfo> queryPageList(UserInfo userInfo);

	/**
	 * @param userInfo
	 * @return int
	 */
	public int queryCount(UserInfo userInfo);
	
	/**
	 * @param userName
	 * @return UserInfo
	 */
	public UserInfo findUserByName(String userName);

}