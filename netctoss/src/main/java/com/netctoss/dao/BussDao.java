package com.netctoss.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.netctoss.entity.Buss;
import com.netctoss.entity.BussPage;

public interface BussDao {
	/**
	 * 增加新业务
	 * @return
	 */
	public int insertBuss(Buss buss);
	/**
	 * 查询所有业务信息
	 * @return
	 */
	public List<Buss> selectAllBuss();
	/**
	 * 通过业务id查询业务信息
	 * @param buss
	 * @return
	 */
	public Buss selectBussById(Buss buss);
	/**
	 * 根据条件查询业务信息
	 * @param buss
	 * @return
	 */
	public List<Buss> selectBussByCondition(Buss buss);
	/**
	 * 通过业务id修改自费id
	 * @param buss
	 * @return
	 */
	public int updateBussById(Buss buss);
	/**
	 * 修改业务状态为删除
	 * @param buss
	 * @return
	 */
	public int updateBussState0(Buss buss); //0表示改变后的状态为删除
	/**
	 * 修改业务状态为暂停
	 * @param buss
	 * @return
	 */
	public int updateBussState1(Buss buss); //1表示改变后的状态为暂停
	/**
	 * 修改业务状态为开通
	 * @param buss
	 * @return
	 */
	public int updateBussState2(Buss buss); //0表示改变后的状态为开通
	
	/**
	 * 查询总条数
	 * @return
	 * @throws SQLException 
	 */
	public int selectCount(Map map);
	
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	
	public List<Buss> findBussByPage(BussPage buss);
	
	public List<Buss> selectByPageCondition(Map map);
	
	public Buss selectBussByOsname(@Param("osname")String osname);
	
	public Buss selectBussBySip(@Param("sip")String sip);
}
