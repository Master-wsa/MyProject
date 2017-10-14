package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.FeeDao;
import com.netctoss.entity.Fee;
import com.netctoss.service.FeeService;

@Service("feeService")
public class FeeServiceImpl implements FeeService {

	@Resource
	private FeeDao feeDao;

	/**
	 * 通过Fee_id查找资费信息
	 */
	@Override
	public Fee getFeeById(Fee fee) {
		return feeDao.selectFeeById(fee);
	}

	/**
	 * 修改资费详细信息
	 */
	@Override
	public boolean updFee(Fee fee) {
		int i = feeDao.updateFee(fee);
		if(i > 0) return true;
		return false;
	}

	/**
	 * 通过Fee_id修改fee_state资费状态
	 */
	@Override
	public boolean updFeeStateById(Fee fee) {
		int i = feeDao.updateFeeStateById(fee);
		if(i > 0) return true;
		return false;
	}

	/**
	 * 排序
	 */
	@Override
	public List<Fee> getFeeSort(Map map) {
		return feeDao.selectFeeSort(map);
	}

	/**
	 * 添加资费
	 */
	@Override
	public boolean addFee(Fee fee) {
		int i = feeDao.insertFee(fee);
		if(i > 0) return true;
		return false;
	}
	/**
	 * 计算资费总数
	 */
	@Override
	public int countFee() {
		// TODO Auto-generated method stub
		return feeDao.countFee();
	}

	@Override
	public boolean getFeeByName(Fee fee) {
		// TODO Auto-generated method stub
		Fee fee1 =feeDao.selectFeeByName(fee);
		if(fee1!=null) return false;
		return true;
	}

	@Override
	public List<Fee> getAllFee() {
		// TODO Auto-generated method stub
		return feeDao.selectAllFee();
	}

}
