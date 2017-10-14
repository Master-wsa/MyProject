package com.netctoss.entity;

import java.util.List;

public class BussPage{
	private List<Buss> list;//当前页内容	 	查询
	private int currPage=1;//当前页码 	 	传递
	private int pageSize=8;//每页显示的条数	固定
	private int totalCount;//总条数			查询
	private int totalPage;//总页数			计算
	private int startPage;//起始页
	public int getStartPage() {
		return (currPage-1)*pageSize;
	}
	public List<Buss> getList() {
		return list;
	}
	public void setList(List<Buss> list) {
		this.list = list;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int seTTotalPage() {
		return (int) Math.ceil(totalCount*1.0/pageSize); //进一法
	}
	/*public void setTotalPage(int totalPage) {
		this.totalPage = totalPage; 
	}*/
	public BussPage(List<Buss> list, int currPage, int pageSize, int totalCount,int startPage) {
		super();
		this.list = list;
		this.currPage = currPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.startPage=startPage;
	}
	public BussPage() {
		super();
	}
	
}
