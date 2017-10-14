package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Fee;

public interface FeeDao {
	/**
	 * 通过Fee_id查找资费信息
	 * @param fee_id
	 * @return
	 */
	public Fee selectFeeById(Fee fee);
	/**
	 * 修改资费详细信息
	 * @param fee
	 * @return
	 */
	public int updateFee(Fee fee);
	/**
	 * 通过Fee_id修改fee_state资费状态
	 * @param fee
	 * @return
	 */
	public int updateFeeStateById(Fee fee);
	/**
	 * 对资费排序
	 * @param fee
	 * @return
	 */
	public List<Fee> selectFeeSort(Map map);
	/**
	 * 添加资费信息
	 * @param fee
	 * @return
	 */
	public int insertFee(Fee fee);
	/**
	 * 计算资费总数
	 * 
	 * 
	 */
	public int countFee();
	
	public Fee selectFeeByName(Fee fee);
	
	public List<Fee> selectAllFee();
}
