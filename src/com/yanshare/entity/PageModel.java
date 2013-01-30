package com.yanshare.entity;
/**
 * 分类模型
 * @author Yanshare
 *
 */
public class PageModel {
	private int totalRecord;//记录总条数
	private int pageSize;//每页条数
	private int pageNum;//查询页数
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
}
