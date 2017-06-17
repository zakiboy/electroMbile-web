package com.electrombile.common;

import java.io.Serializable;

public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer firstRow;
	private Integer rowSize;
	private String orderBy;
	/**
	 * @return the firstRow
	 */
	public Integer getFirstRow() {
		return firstRow;
	}
	/**
	 * @param firstRow the firstRow to set
	 */
	public void setFirstRow(Integer firstRow) {
		this.firstRow = firstRow;
	}
	/**
	 * @return the rowSize
	 */
	public Integer getRowSize() {
		return rowSize;
	}
	/**
	 * @param rowSize the rowSize to set
	 */
	public void setRowSize(Integer rowSize) {
		this.rowSize = rowSize;
	}
	/**
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return orderBy;
	}
	/**
	 * @param orderBy the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
