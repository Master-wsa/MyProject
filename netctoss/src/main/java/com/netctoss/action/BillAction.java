package com.netctoss.action;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netctoss.entity.Account;
import com.netctoss.entity.Bill;
import com.netctoss.entity.Detail;
import com.netctoss.entity.Item;
import com.netctoss.service.AccountService;
import com.netctoss.service.BillService;
import com.netctoss.service.DetailService;
import com.netctoss.service.ItemService;

@Controller
@RequestMapping("/bill")
public class BillAction {
	@Resource
	private BillService billService;
	@Resource
	private ItemService itemService;
	@Resource
	private DetailService detailService;
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/getAllBill")
	public String getBillByCond(Bill bill,Model model,HttpSession session){
		Account acc = new Account();
		String searchon="";
		acc.setAcc_idc("");
		acc.setAcc_ids("");
		acc.setAcc_name("");
		bill.setAcc(acc);
		session.setAttribute("bill", bill);
		System.out.println(bill.getAcc().getAcc_ids());
		session.setAttribute("year", "2017");
		session.setAttribute("month", "-1");
		Map map = new HashMap();
		map.put("bill", bill);
		map.put("start", 0);
	    map.put("pageSize", 8);
		List<Bill> lb = billService.getBillByCond(map);
		int count = billService.getBillCount(map);
		model.addAttribute("count", count/8+1);
		model.addAttribute("billList",lb);
		model.addAttribute("curPage", 1);
		model.addAttribute("searchon", searchon);
		model.addAttribute("totalRecord", count);
		return "/WEB-INF/view/bill/bill_list";
	}
	
	@RequestMapping("/searchBill")
	public String serachBill(Bill bill,Model model,String acc_id,String acc_idc,String acc_name,String year,String month,String curPage,String searchon,HttpSession session){
		Account acc = new Account();
		List<Bill> lb = new ArrayList<Bill>();
		int page = 1;
		if(!"".equals(curPage)){
			page = Integer.parseInt(curPage);
		}
	    if("1".equals(searchon)){
			Map map = new HashMap();
			acc.setAcc_ids(acc_id);
			acc.setAcc_idc(acc_idc);
			acc.setAcc_name(acc_name);
			bill.setAcc(acc);
		    java.util.Date date = null;
		    Date bil_time = null;
		    session.setAttribute("month", month);
		    if(!"-1".equals(month)){
		    	SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM");
				try {
					if(!"10".equals(month)||!"11".equals(month)||!"12".equals(month)){
						month = "0"+month;
					}
					date = formatter.parse(year+"-"+month);
					map.put("type", 0);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			    bil_time = new Date(date.getTime());
		    }
		    if("-1".equals(month)){
		    	SimpleDateFormat formatter=new SimpleDateFormat("yyyy");
				try {
					month = null;
					date = formatter.parse(year);
					map.put("type", 1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			    bil_time = new Date(date.getTime());
		    }	
		    bill.setBil_time(bil_time);
		    session.setAttribute("bill", bill);
		    map.put("bill", bill);
		    map.put("start", (page-1)*8);
		    map.put("pageSize", 8);
	    	lb = billService.getBillByCond(map);
	    	int count = billService.getBillCount(map);
			/*System.out.println(count+"11");*/
			model.addAttribute("count", count/8+1);
			model.addAttribute("billList",lb);
			model.addAttribute("searchBill",bill);
			model.addAttribute("year", year);
			session.setAttribute("year", year);
			model.addAttribute("searchon","0");
			model.addAttribute("month", month);
			if(!"".equals(curPage)){
				model.addAttribute("curPage", curPage);
			}else{
				model.addAttribute("curPage", 1);
			}
		}
	    else{
	    	Bill bill1 = new Bill();
	    	Account acc1 = new Account();
	    	bill1.setAcc(acc1);
		    Map map1 = new HashMap();
		    map1.put("bill", session.getAttribute("bill"));
		    map1.put("start", (page-1)*8);
		    map1.put("pageSize", 8);
	    	lb = billService.getBillByCond(map1);
	    	int count = billService.getBillCount(map1);
	    	model.addAttribute("count", count/8+1);
	    	model.addAttribute("totalRecord", count);
	    	model.addAttribute("searchon",searchon);
	    	model.addAttribute("billList",lb);
			if(!"".equals(curPage)){
				model.addAttribute("curPage", curPage);
			}else{
				model.addAttribute("curPage", 1);
			}	
	    }
	
		return "/WEB-INF/view/bill/bill_list";
	}
	
	@RequestMapping("/itemList")
	public String itemList(int acc_id,String time,Model model,String curPage,String bil_fee){
		int page = 1;
		if(!"".equals(curPage)){
			page = Integer.parseInt(curPage);
		}
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
		Date bil_time = null;
		try {
			java.util.Date temp = sdf.parse(time);
			bil_time = new Date(temp.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Bill bill = new Bill();
		Account acc = new Account();
		acc.setAcc_id(acc_id);
		bill.setAcc(accountService.getAccountByAccId(acc));
		bill.setBil_time(bil_time);
		Map map = new HashMap();
		map.put("start", (page-1)*8);
		map.put("pageSize", 8);
		map.put("bill", bill);
		map.put("type", 0);
		List<Bill> lb = billService.getBillByCond(map);
		model.addAttribute("nowBill",bill);
		Item item = new Item();
		item.setAcc(acc);
		item.setIte_time(bil_time);
		map.put("item", item);
		List<Item> li = itemService.getAllItem(map);
		int count = itemService.getItemCount(map);
		model.addAttribute("count", count/8+1);
		model.addAttribute("totalRecord", count);
		model.addAttribute("iteList", li);
		model.addAttribute("bil_fee", bil_fee);
		if(!"".equals(curPage)){
			model.addAttribute("curPage", curPage);
		}else{
			model.addAttribute("curPage", 1);
		}
		return "WEB-INF/view/bill/bill_item";
	}
	
	@RequestMapping("detailList")
	public String detailList(HttpServletRequest request,Model model,String curPage){
		int page = 1;
		if(!"".equals(curPage)){
			page = Integer.parseInt(curPage);
		}
		String time = request.getParameter("time");
		String ser_id = request.getParameter("ser_id");
		model.addAttribute("acc_id", request.getParameter("acc_id"));
		model.addAttribute("time", time);
		model.addAttribute("os", request.getParameter("os"));
		model.addAttribute("ip",request.getParameter("ip"));
		model.addAttribute("fee",request.getParameter("fee"));
		model.addAttribute("ser_id", ser_id);
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
		Date timeDate = null;
		try {
			java.util.Date temp = sdf.parse(time);
			timeDate = new Date(temp.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = new HashMap();
		map.put("timeDate", timeDate);
		map.put("ser_id", ser_id);
		map.put("start", (page-1)*8);
	    map.put("pageSize", 8);
	    map.put("type", 0);
	    if(!"".equals(curPage)){
			model.addAttribute("curPage", curPage);
		}else{
			model.addAttribute("curPage", 1);
		}
		List<Detail> ld = detailService.getAllDetail(map);
		int count = itemService.getItemCount(map);
		model.addAttribute("count", count/8+1);
		model.addAttribute("totalRecord", count);
		model.addAttribute("detailList",ld);
		return "/WEB-INF/view/bill/bill_service_detail";
	}
}
