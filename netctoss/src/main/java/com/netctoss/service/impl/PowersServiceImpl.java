package com.netctoss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.PowersDao;
import com.netctoss.entity.Powers;
import com.netctoss.service.PowersService;

@Service("powersService")
public class PowersServiceImpl implements PowersService {

	@Resource
	private PowersDao powersDao;
	
	@Override
	public List<Powers> getAllPowers() {
		// TODO Auto-generated method stub
		return powersDao.selectAllPowers();
	}

}
