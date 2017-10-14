package com.netctoss.util;

import java.util.HashSet;
import java.util.Set;

public class PageUtil {
	//总数据量
	private int totalSize;
	//每页显示的数据量
	private int pageSize;
	//当前页数
	private int curPage;
	//起始位置
	int startRecored;
	//总页数
	int totalPage;
	
	
	public PageUtil() {
		super();
	}
	public PageUtil(int totalSize, int pageSize, int curPage) {
		super();
		this.totalSize = totalSize;
		this.pageSize = pageSize;
		this.curPage = curPage;
	}
	public int getStartRecored(int curPage,int pageSize){
		startRecored=(curPage-1)*pageSize;
		return startRecored;
	}
	public int getStartRecored(){
		startRecored=(curPage-1)*pageSize;
		return startRecored;
	}
	public int getTotalPage(int totalSize,int pageSize){
		totalPage=(totalSize%pageSize==0)?(totalSize/pageSize):(totalSize/pageSize+1);
		return totalPage;
	}
	public int getTotalPage(){
		totalPage=(totalSize%pageSize==0)?(totalSize/pageSize):(totalSize/pageSize+1);
		return totalPage;
		
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	
}
