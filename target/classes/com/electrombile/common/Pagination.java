package com.electrombile.common;

import java.util.ArrayList;
import java.util.List;

import com.electrombile.core.SystemConstant;

/**
 * 分页对象
 * @param <T>
 */
public class Pagination {
	
	private final static int paginationNum = 5;//每次页面显示的页码数
	
	private int pageSize;
	private List<String> paginationlist;
	private int totalCount;
	private int pageNo;
	private int totalPages;

	public Pagination() {

	}

	public Pagination(int totalCount,int pageNo,int pageSize){
		setPageNo(pageNo);
		setPageSize(pageSize);
		setTotalCount(totalCount);
	}

	public int getTotalPages() {
		return this.totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public List<String> getPaginationlist() {
		return paginationlist;
	}
	
	public void setPaginationlist(int totalPage) {
		if (totalPage < 1) {
			totalPage = 1;
		}else {
			totalPage = totalPage % paginationNum == 0 ? totalPage
					/ paginationNum : (totalPage / paginationNum + 1);
		}
		int startPagination = pageNo;//起始页码
		List<String> paginations = new ArrayList<String>();
		for (int i = 0; i < totalPage; i++) {
			paginations.add(String.valueOf(startPagination));
			startPagination++;
		}
		this.paginationlist = paginations;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getTotalCount() {
		return this.totalCount;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		setTotalPages(totalCount);
	}

	public void setTotalPages(int totalCount) {
		setPageSize(SystemConstant.PAGESIZE);
		if (totalCount < 0) {
			this.totalPages = 0;
		} else {
			this.totalPages = totalCount % pageSize == 0 ? totalCount
					/ pageSize : (totalCount / pageSize + 1);
		}
		setPaginationlist(this.totalPages);
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
