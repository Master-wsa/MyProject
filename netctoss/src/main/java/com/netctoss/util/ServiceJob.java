package com.netctoss.util;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import com.netctoss.entity.Buss;
import com.netctoss.service.BussService;

public class ServiceJob {
	@Resource
	private BussService bussService;
	private static ArrayList<Buss> busslist = new ArrayList<Buss>(); 
	public static boolean addService(Buss buss){
		boolean i = ServiceJob.busslist.add(buss);
		for(Buss bus:busslist){
			System.out.println("将业务ID为"+bus.getSer_id()+"的资费ID更改为"+bus.getFee_id());
		}
		return i;
	}

	public void addServiceByCondition() {
		if(busslist.size()>0){
			for(int i = 0;i < busslist.size();i++){
				System.out.println("正在启动"+busslist);
				bussService.modifyBussById(busslist.get(i));
				String date=new Date().toLocaleString();
				System.out.println(date+"修改成功！");		
			}
			busslist.clear();
		}
	}
}
