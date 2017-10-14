package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.AccountDao;
import com.netctoss.entity.Account;
import com.netctoss.entity.Buss;
import com.netctoss.service.AccountService;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Resource
	private AccountDao accountDao;
	
	@Override
	public List<Account> getAccountByCondition(Map map) {
		// TODO Auto-generated method stub
		return accountDao.selectAccountByCondition(map);
	}

	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.insertAccount(account);
	}

	@Override
	public Account getAccountByAccId(Account account) {
		// TODO Auto-generated method stub
		return accountDao.selectAccountByAccId(account);
	}

	@Override
	public int updateAccountByAccId(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccountByAccId(account);
	}

	@Override
	public int updateAccountState(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccountState(account);
	}

	@Override
	public int updateBussState(Buss buss) {
		// TODO Auto-generated method stub
		return accountDao.updateBussState(buss);
	}

	@Override
	public Account getAccByIDCard(Account account) {
		// TODO Auto-generated method stub
		return accountDao.selectAccByIDCard(account);
	}

	@Override
	public int getAccCount(Map map) {
		// TODO Auto-generated method stub
		return accountDao.selectAccCount(map);
	}


	@Override
	public Account getAccByLogin(Account account) {
		// TODO Auto-generated method stub
		return accountDao.selectAccByLogin(account);
	}

	@Override
	public int getSerByAccId(Account account) {
		// TODO Auto-generated method stub
		return accountDao.selectSerByAccId(account);
	}

}
