package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Detail;

/**
 * 详单Dao层
 * @author wdh
 *
 */
public interface DetailDao {
	/**
	 * 查询详单
	 * @param detail
	 * @return
	 */
	public List<Detail> selectAllDetail(Map map);
	/**
	 * 查询条数
	 * @param map
	 * @return
	 */
	public int selectDetailCount(Map map);
}
