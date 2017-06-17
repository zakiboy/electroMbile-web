package com.electrombile.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * RouteInfo
 *
 */
public class RouteInfo {
	/**行程ID**/
	private Integer routeId;
	/**行程公里数**/
	private BigDecimal routeCount;
	/**行程起点**/
	private String routeStart;
	/**行程终点**/
	private String routeEnd;
	/**开始时间**/
	private Date startDate;
	/**结束时间**/
	private Date endDate;
	/**行程使用时间**/
	private BigDecimal routeTime;
	/**会员ID**/
	private Integer memberId;
	/**
	 * 获取routeId
	 * @return routeId
	 */
	public Integer getRouteId() {
		return routeId;
	}
	/**
	 * 设置routeId
	 * @param routeId
	 */
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	/**
	 * 获取routeCount
	 * @return routeCount
	 */
	public BigDecimal getRouteCount() {
		return routeCount;
	}
	/**
	 * 设置routeCount
	 * @param routeCount
	 */
	public void setRouteCount(BigDecimal routeCount) {
		this.routeCount = routeCount;
	}
	/**
	 * 获取routeStart
	 * @return routeStart
	 */
	public String getRouteStart() {
		return routeStart;
	}
	/**
	 * 设置routeStart
	 * @param routeStart
	 */
	public void setRouteStart(String routeStart) {
		this.routeStart = routeStart;
	}
	/**
	 * 获取routeEnd
	 * @return routeEnd
	 */
	public String getRouteEnd() {
		return routeEnd;
	}
	/**
	 * 设置routeEnd
	 * @param routeEnd
	 */
	public void setRouteEnd(String routeEnd) {
		this.routeEnd = routeEnd;
	}
	/**
	 * 获取startDate
	 * @return startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置startDate
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取endDate
	 * @return endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置endDate
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取routeTime
	 * @return routeTime
	 */
	public BigDecimal getRouteTime() {
		return routeTime;
	}
	/**
	 * 设置routeTime
	 * @param routeTime
	 */
	public void setRouteTime(BigDecimal routeTime) {
		this.routeTime = routeTime;
	}
	/**
	 * 获取memberId
	 * @return memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * 设置memberId
	 * @param memberId
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
}
