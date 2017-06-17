package com.electrombile.response;

public class Electrombile {
	
	/**电动车ID**/
	private Integer electrombileId;
	/**电动车编号**/
	private String electrombileNo;
	/**有效状态0有效1无效**/
	private Integer electrombileStatus;
	/**电动车类型**/
	private Integer electrombileType;
	/**电动车坐标**/
	private String electrombileCoordinate;
	/**电动车电机**/
	private String electrombileElectrical;
	/**电动车电量**/
	private String electrombileElectric;
	/**报警状态0正常1已报警2处理中**/
	private String electrombileAlarmStatus;
	/**报修状态0正常1已报修2修理中3无法修复**/
	private Integer electrombileRepairStatus;
	/**
	 * 获取electrombileId
	 * @return electrombileId
	 */
	public Integer getElectrombileId() {
		return electrombileId;
	}
	/**
	 * 设置electrombileId
	 * @param electrombileId
	 */
	public void setElectrombileId(Integer electrombileId) {
		this.electrombileId = electrombileId;
	}
	/**
	 * 获取electrombileNo
	 * @return electrombileNo
	 */
	public String getElectrombileNo() {
		return electrombileNo;
	}
	/**
	 * 设置electrombileNo
	 * @param electrombileNo
	 */
	public void setElectrombileNo(String electrombileNo) {
		this.electrombileNo = electrombileNo;
	}
	/**
	 * 获取electrombileStatus
	 * @return electrombileStatus
	 */
	public Integer getElectrombileStatus() {
		return electrombileStatus;
	}
	/**
	 * 设置electrombileStatus
	 * @param electrombileStatus
	 */
	public void setElectrombileStatus(Integer electrombileStatus) {
		this.electrombileStatus = electrombileStatus;
	}
	/**
	 * 获取electrombileType
	 * @return electrombileType
	 */
	public Integer getElectrombileType() {
		return electrombileType;
	}
	/**
	 * 设置electrombileType
	 * @param electrombileType
	 */
	public void setElectrombileType(Integer electrombileType) {
		this.electrombileType = electrombileType;
	}
	/**
	 * 获取electrombileCoordinate
	 * @return electrombileCoordinate
	 */
	public String getElectrombileCoordinate() {
		return electrombileCoordinate;
	}
	/**
	 * 设置electrombileCoordinate
	 * @param electrombileCoordinate
	 */
	public void setElectrombileCoordinate(String electrombileCoordinate) {
		this.electrombileCoordinate = electrombileCoordinate;
	}
	/**
	 * 获取electrombileElectrical
	 * @return electrombileElectrical
	 */
	public String getElectrombileElectrical() {
		return electrombileElectrical;
	}
	/**
	 * 设置electrombileElectrical
	 * @param electrombileElectrical
	 */
	public void setElectrombileElectrical(String electrombileElectrical) {
		this.electrombileElectrical = electrombileElectrical;
	}
	/**
	 * 获取electrombileElectric
	 * @return electrombileElectric
	 */
	public String getElectrombileElectric() {
		return electrombileElectric;
	}
	/**
	 * 设置electrombileElectric
	 * @param electrombileElectric
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
	
}
