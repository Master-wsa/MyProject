package com.netctoss.util;


import javax.annotation.Resource;
import com.netctoss.service.BillService;
import com.netctoss.service.ItemService;
public class MyJob  {
	@Resource
	private BillService billService;
	@Resource
	private ItemService itemService;
	public void run(){
		boolean a = false;
		boolean b = false;
		do{
			a = itemService.countDetail();
		}while(!a);
		do{
			b=billService.countItem();
		}while(!b);
	}

}

