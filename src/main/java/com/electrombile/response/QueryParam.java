package com.electrombile.response;


/**
 * 查询公用对象
 * **/
public class QueryParam {
	
	/**类型**/
	private String type;
	/**编号**/
	private String number;
	/**电量**/
	private String electric;
	
	/**
	 * @return the electric
	 */
	public String getElectric() {
		return electric;
	}
	/**
	 * @param electric the electric to set
	 */
	public void setElectric(String electric) {
		this.electric = electric;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
}
