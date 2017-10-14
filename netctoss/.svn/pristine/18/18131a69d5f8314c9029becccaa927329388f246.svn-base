package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.DetailDao;
import com.netctoss.entity.Detail;
import com.netctoss.service.DetailService;
/**
 * detail业务层实现类
 * @author wdh
 *
 */
@Service("detailService")
public class DetailServiceImpl implements DetailService {
	@Resource
	private DetailDao detailDao;
	
	@Override
	public List<Detail> getAllDetail(Map map) {
		// TODO Auto-generated method stub
		return detailDao.selectAllDetail(map);
	}

	@Override
	public int DetailCount(Map map) {
		// TODO Auto-generated method stub
		return detailDao.selectDetailCount(map);
	}

}
