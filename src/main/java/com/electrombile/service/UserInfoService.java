package com.electrombile.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.UserInfoDao;
import com.electrombile.model.UserInfo;


/**
 * @author admin
 *
 */
@Service
@Transactional
public class UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;
	
	/**
	 * @param userInfo
	 * @return int
	 */
	public int insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.insertUserInfo(userInfo);
	}

	/**
	 * @param id
	 * @return int
	 */
	public int deleteUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return userInfoDao.deleteUserInfo(id);
	}

	/**
	 * @param userInfo
	 * @return int
	 */
	public int updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.updateUserInfo(userInfo);
	}

	/**
	 * @param id
	 * @return UserInfo
	 */
	public UserInfo loadUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return userInfoDao.loadUserInfo(id);
	}

	/**
	 * @param userInfo
	 * @return List<UserInfo>
	 */
	public List<UserInfo> queryList(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.queryList(userInfo);
	}

	/**
	 * @param userInfo
	 * @return List<UserInfo>
	 */
	public List<UserInfo> queryPageList(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.queryPageList(userInfo);
	}

	/**
	 * @param userInfo
	 * @return int
	 */
	public int queryCount(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.queryCount(userInfo);
	}

	/**
	 * @param userName
	 * @return UserInfo
	 */
	public UserInfo findUserByName(String userName) {
		// TODO Auto-generated method stub
		return userInfoDao.findUserByName(userName);
	}

}
