package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.DepartmentInfo;

/**
 * @author admin
 *
 */
@Repository
public interface DepartmentInfoDao{

	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int insertDepartmentInfo(DepartmentInfo departmentInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteDepartmentInfo(Integer id);

	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int updateDepartmentInfo(DepartmentInfo departmentInfo);

	/**
	 * @param id
	 * @return DepartmentInfo
	 */
	public DepartmentInfo loadDepartmentInfo(Integer id);

	/**
	 * @param departmentInfo
	 * @return List<DepartmentInfo>
	 */
	public List<DepartmentInfo> queryList(DepartmentInfo departmentInfo);

	/**
	 * @param departmentInfo
	 * @return List<DepartmentInfo>
	 */
	public List<DepartmentInfo> queryPageList(DepartmentInfo departmentInfo);

	/**
	 * @param departmentInfo
	 * @return int
	 */
	public int queryCount(DepartmentInfo departmentInfo);

}
