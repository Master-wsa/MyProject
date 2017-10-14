package com.netctoss.service;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Bill;
/**
 * 月账单Service
 * @author wdh
 *
 */
public interface BillService {
	/**
	 * 条件查询bill
	 * @param bill
	 * @return
	 */
	public List<Bill> getBillByCond(Map map);
	/**
	 * 获取记录条数
	 * @return
	 */
	public int getBillCount(Map map);
	/**
	 * 自动统计item
	 * @return
	 */
	public boolean countItem();
}
