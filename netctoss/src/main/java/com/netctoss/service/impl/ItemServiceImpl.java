package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.ItemDao;
import com.netctoss.entity.Item;
import com.netctoss.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	@Resource
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItem(Map map) {
		// TODO Auto-generated method stub
		return itemDao.selectALlItem(map);
	}
	
	@Override
	public int getItemCount(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean countDetail() {
		// TODO Auto-generated method stub
		if(itemDao.countDetail()>0){
			return true;
		}
		return false;
	}

}
