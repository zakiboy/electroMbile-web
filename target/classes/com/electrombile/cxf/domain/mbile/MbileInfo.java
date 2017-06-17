package com.electrombile.cxf.domain.mbile;

import java.io.Serializable;



public class MbileInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	/**电动车编号**/
	private String electrombileNo;
	/**有效状态0有效1无效**/
	private Integer electrombileStatus;
	/**电动车类型0未骑行1骑行中**/
	private Integer electrombileType;
	/**电动车电机**/
	private String electrombileElectrical;
	/**电动车电量**/
	private String electrombileElectric;
	/**报警状态0正常1已报警2处理中**/
	private String electrombileAlarmStatus;
	/**报修状态0正常1已报修2修理中3无法修复**/
	private Integer electrombileRepairStatus;
	/**电动车坐标**/
	private String electrombileCoordinate;
	/**
	 * @return the electrombileNo
	 */
	public String getElectrombileNo() {
		return electrombileNo;
	}
	/**
	 * @param electrombileNo the electrombileNo to set
	 */
	public void setElectrombileNo(String electrombileNo) {
		this.electrombileNo = electrombileNo;
	}
	/**
	 * @return the electrombileStatus
	 */
	public Integer getElectrombileStatus() {
		return electrombileStatus;
	}
	/**
	 * @param electrombileStatus the electrombileStatus to set
	 */
	public void setElectrombileStatus(Integer electrombileStatus) {
		this.electrombileStatus = electrombileStatus;
	}
	/**
	 * @return the electrombileType
	 */
	public Integer getElectrombileType() {
		return electrombileType;
	}
	/**
	 * @param electrombileType the electrombileType to set
	 */
	public void setElectrombileType(Integer electrombileType) {
		this.electrombileType = electrombileType;
	}
	/**
	 * @return the electrombileElectrical
	 */
	public String getElectrombileElectrical() {
		return electrombileElectrical;
	}
	/**
	 * @param electrombileElectrical the electrombileElectrical to set
	 */
	public void setElectrombileElectrical(String electrombileElectrical) {
		this.electrombileElectrical = electrombileElectrical;
	}
	/**
	 * @return the electrombileElectric
	 */
	public String getElectrombileElectric() {
		return electrombileElectric;
	}
	/**
	 * @param electrombileElectric the electrombileElectric to set
	 */
	public void setElectrombileElectric(String electrombileElectric) {
		this.electrombileElectric = electrombileElectric;
	}
	/**
	 * @return the electrombileAlarmStatus
	 */
	public String getElectrombileAlarmStatus() {
		return electrombileAlarmStatus;
	}
	/**
	 * @param electrombileAlarmStatus the electrombileAlarmStatus to set
	 */
	public void setElectrombileAlarmStatus(String electrombileAlarmStatus) {
		this.electrombileAlarmStatus = electrombileAlarmStatus;
	}
	/**
	 * @return the electrombileRepairStatus
	 */
	public Integer getElectrombileRepairStatus() {
		return electrombileRepairStatus;
	}
	/**
	 * @param electrombileRepairStatus the electrombileRepairStatus to set
	 */
	public void setElectrombileRepairStatus(Integer electrombileRepairStatus) {
		this.electrombileRepairStatus = electrombileRepairStatus;
	}
	/**
	 * @return the electrombileCoordinate
	 */
	public String getElectrombileCoordinate() {
		return electrombileCoordinate;
	}
	/**
	 * @param electrombileCoordinate the electrombileCoordinate to set
	 */
	public void setElectrombileCoordinate(String electrombileCoordinate) {
		this.electrombileCoordinate = electrombileCoordinate;
	}
	
}
