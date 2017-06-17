package com.electrombile.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electrombile.dao.DepartmentInfoDao;
import com.electrombile.model.DepartmentInfo;

/**
 * @author admin
 *
 */
@Service
@Transactional
public class DepartmentInfoService {

	@Resource
	private DepartmentInfoDao departmentInfoDao;
	
	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int insertDepartmentInfo(DepartmentInfo departmentInfo) {
		// TODO Auto-generated method stub
		return departmentInfoDao.insertDepartmentInfo(departmentInfo);
	}

	/**
	 * @param id
	 * @return
	 */
	/**
	 * @param id
	 * @return int
	 */
	public int deleteDepartmentInfo(Integer id) {
		// TODO Auto-generated method stub
		return departmentInfoDao.deleteDepartmentInfo(id);
	}

	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int updateDepartmentInfo(DepartmentInfo departmentInfo) {
		// TODO Auto-generated method stub
		return departmentInfoDao.updateDepartmentInfo(departmentInfo);
	}

	/**
	 * @param id
	 * @return DepartmentInfo
	 */
	public DepartmentInfo loadDepartmentInfo(Integer id) {
		// TODO Auto-generated method stub
		return departmentInfoDao.loadDepartmentInfo(id);
	}

	/**
	 * @param departmentInfo
	 * @return List<DepartmentInfo>
	 */
	public List<DepartmentInfo> queryList(DepartmentInfo departmentInfo) {
		// TODO Auto-generated method stub
		return departmentInfoDao.queryList(departmentInfo);
	}

	/**
	 * @param departmentInfo
	 * @return List<DepartmentInfo>
	 */
	public List<DepartmentInfo> queryPageList(DepartmentInfo departmentInfo) {
		// TODO Auto-generated method stub
		return departmentInfoDao.queryPageList(departmentInfo);
	}

	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int queryCount(DepartmentInfo departmentInfo) {
		// TODO Auto-generated method stub
		return departmentInfoDao.queryCount(departmentInfo);
	}

}
