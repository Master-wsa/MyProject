package com.netctoss.service;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Item;

/**
 * 月详细账单item
 * @author wdh
 *
 */
public interface ItemService {
	/**
	 * 获取月详细账单
	 * @param item
	 * @return
	 */
	public List<Item> getAllItem(Map map);
	/**
	 * 获取记录条数
	 * @param map
	 * @return
	 */
	public int getItemCount(Map map);
	/**
	 * 自动统计Detail
	 * @return
	 */
	public boolean countDetail();
}
