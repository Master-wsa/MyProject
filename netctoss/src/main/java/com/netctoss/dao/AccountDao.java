package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Account;
import com.netctoss.entity.Buss;

public interface AccountDao {
	/**
	 * 通过条件查询账务账号
	 * @param account
	 * @return
	 */
	public List<Account> selectAccountByCondition(Map map);
	/**
	 * 添加新的账务账号
	 * @param account
	 * @return
	 */
	public int insertAccount(Account account);
	/**
	 * 通过id查询账务账号
	 * @param account
	 * @return
	 */
	public Account selectAccountByAccId(Account account);
	/**
	 * 更新账务账号
	 * @param account
	 * @return
	 */
	public int updateAccountByAccId(Account account);
	/**
	 * 更新账务账号状态
	 * @param account
	 * @return
	 */
	public int updateAccountState(Account account);
	/**
	 * 同步更新业务状态
	 * @param buss
	 * @return
	 */
	public int updateBussState(Buss buss);
	/**
	 * 根据身份证ID查询账务账号
	 * @param account
	 * @return
	 */
	public  Account selectAccByIDCard(Account account);
	/**
	 * 查询所有的条数
	 * @return
	 */
	public int selectAccCount(Map map);
	/**
	 * 通过登录账号
	 * @return
	 */
	public Account selectAccByLogin(Account account);
	/**
	 * 查询账务账号下的业务账号条数
	 * @param account
	 * @return
	 */
	public int selectSerByAccId(Account account);
}
