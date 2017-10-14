package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Item;

/**
 * 月详细账单dao
 * @author wdh
 *
 */
public interface ItemDao {
	/**
	 * 条件查询item
	 * @param item
	 * @return
	 */
	public List<Item> selectALlItem(Map map);
	/**
	 * 查询记录条数
	 * @param map
	 * @return
	 */
	public List selectItemCount(Map map);
	/**
	 * 自动统计detail
	 * @return
	 */
	public int countDetail();
}
