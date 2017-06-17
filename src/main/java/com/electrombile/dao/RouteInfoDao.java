package com.electrombile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.electrombile.model.RouteInfo;

/**
 * @author admin
 *
 */
@Repository
public interface RouteInfoDao{

	/**
	 * @param routeInfo
	 * @return int
	 */
	public int insertRouteInfo(RouteInfo routeInfo);

	/**
	 * @param id
	 * @return int
	 */
	public int deleteRouteInfo(Integer id);

	/**
	 * @param routeInfo
	 * @return int
	 */
	public int updateRouteInfo(RouteInfo routeInfo);

	/**
	 * @param id
	 * @return RouteInfo
	 */
	public RouteInfo loadRouteInfo(Integer id);

	/**
	 * @param routeInfo
	 * @return List<RouteInfo>
	 */
	public List<RouteInfo> queryList(RouteInfo routeInfo);

	/**
	 * @param routeInfo
	 * @return List<RouteInfo>
	 */
	public List<RouteInfo> queryPageList(RouteInfo routeInfo);

	/**
	 * @param routeInfo
	 * @return int
	 */
	public int queryCount(RouteInfo routeInfo);

}