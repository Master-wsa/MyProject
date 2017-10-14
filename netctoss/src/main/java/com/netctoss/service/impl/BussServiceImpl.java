package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.BussDao;
import com.netctoss.entity.Buss;
import com.netctoss.entity.BussPage;
import com.netctoss.service.BussService;
@Service("bussService")
public class BussServiceImpl implements BussService {
	@Resource
	private BussDao bussDao;
	@Override
	public int addBuss(Buss buss) {
		return bussDao.insertBuss(buss);
	}

	@Override
	public List<Buss> getAllBuss() {
		return bussDao.selectAllBuss();
	}

	@Override
	public Buss getBussById(Buss buss) {
		return bussDao.selectBussById(buss);
	}

	@Override
	public List<Buss> getBussByCondition(Buss buss) {
		return bussDao.selectBussByCondition(buss);
	}

	@Override
	public int modifyBussById(Buss buss) {
		return bussDao.updateBussById(buss);
	}

	@Override
	public int modifyBussState0(Buss buss) {
		return bussDao.updateBussState0(buss);
	}

	@Override
	public int modifyBussState1(Buss buss) {
		return bussDao.updateBussState1(buss);
	}

	@Override
	public int modifyBussState2(Buss buss) {
		return bussDao.updateBussState2(buss);
	}

	@Override
	public int getCount(Map map) {
		return bussDao.selectCount(map);
	}


	@Override
	public List<Buss> getByPageCondition(Map map) {
		return bussDao.selectByPageCondition(map);
	}

	@Override
	public Buss getBussByOsname(String osname) {
		return bussDao.selectBussByOsname(osname);
	}

	@Override
	public Buss getBussBySip(String sip) {
		return bussDao.selectBussBySip(sip);
	}





}
