package com.netctoss.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.netctoss.entity.Buss;
import com.netctoss.entity.BussPage;

public interface BussService {
	/**
	 * 增加新业务
	 * @return
	 */
	public int addBuss(Buss buss);
	/**
	 * 查询所有业务信息
	 * @return
	 */
	public List<Buss> getAllBuss();
	/**
	 * 通过业务id查询业务信息
	 * @param buss
	 * @return
	 */
	public Buss getBussById(Buss buss);
	/**
	 * 根据条件查询业务信息
	 * @param buss
	 * @return
	 */
	public List<Buss> getBussByCondition(Buss buss);
	/**
	 * 通过业务id修改自费id
	 * @param buss
	 * @return
	 */
	public int modifyBussById(Buss buss);
	/**
	 * 修改业务状态为删除
	 * @param buss
	 * @return
	 */
	public int modifyBussState0(Buss buss); //0表示改变后的状态为删除
	/**
	 * 修改业务状态为暂停
	 * @param buss
	 * @return
	 */
	public int modifyBussState1(Buss buss); //1表示改变后的状态为暂停
	/**
	 * 修改业务状态为开通
	 * @param buss
	 * @return
	 */
	public int modifyBussState2(Buss buss); //0表示改变后的状态为开通
	
	/**
	 * 查询总条数
	 * @return
	 * @throws SQLException 
	 */
	public int getCount(Map map);
	
	/**
	 * 条件分页
	 * @param map
	 * @return
	 */
	public List<Buss> getByPageCondition(Map map);
	
	
	/**
	 *根据ser_os查询
	 * @param osname
	 * @return
	 */
	public Buss getBussByOsname(String osname);
	
	/**
	 * 查询是否有开通的业务是此ip
	 * @param sip
	 * @return
	 */
	public Buss getBussBySip(String sip);
}
