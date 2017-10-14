package com.netctoss.action;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netctoss.entity.Account;
import com.netctoss.entity.Buss;
import com.netctoss.entity.BussPage;
import com.netctoss.entity.Fee;
import com.netctoss.service.AccountService;
import com.netctoss.service.BussService;
import com.netctoss.service.FeeService;
import com.netctoss.util.ServiceJob;

@Controller
@RequestMapping("/service")
public class BussAction {
	@Resource
	private BussService bussService;
	@Resource
	private FeeService feeService;
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/toAddService")
	public String toAddService(HttpServletRequest request){
		HttpSession session=request.getSession();
		List<Fee> allFee = feeService.getAllFee();
		session.setAttribute("allFee", allFee);
		return "/WEB-INF/view/service/service_add";
	}
	@RequestMapping("/addService")
	public String addService(HttpServletRequest request,PrintWriter out){
		Buss buss=new Buss();
		int accid=Integer.parseInt(request.getParameter("accountid"));
		buss.setAcc_id(accid);
		int feeid=Integer.parseInt(request.getParameter("fee"));
		String bussip=request.getParameter("sip");
		String osname=request.getParameter("osname");
		String pwd=request.getParameter("pwd");
		@SuppressWarnings("deprecation")
		String  datetime=new Date().toLocaleString();
		buss.setFee_id(feeid);
		buss.setSer_pwd(pwd);
		buss.setSer_ctime(datetime);
		buss.setSer_state(1);
		buss.setSer_ip(bussip);
		buss.setSer_os(osname);
		bussService.addBuss(buss);
		return "redirect:/service/getByPageCondition.do";
	}
	@RequestMapping("/clearService")
	public void clearService(HttpServletRequest request,PrintWriter out){
		int bussid = Integer.parseInt(request.getParameter("finId"));
		String datetime=new Date().toLocaleString();
		Buss buss=new Buss();
		buss.setSer_id(bussid);
		buss.setSer_ctime(datetime);
		int i = bussService.modifyBussState0(buss);
		if(i>0){
			out.print("yes");
		}else{
			out.print("no");
		}
		out.flush();
		out.close();
		
		/*return "redirect:/service/getByPageCondition.do";*/
	}
	@RequestMapping("/detailService")
	public String detailService(HttpServletRequest request){
		HttpSession session=request.getSession();
		int bussid=Integer.parseInt(request.getParameter("id"));
		Buss buss1=new Buss();
		buss1.setSer_id(bussid);
		Buss buss = bussService.getBussById(buss1);
		session.setAttribute("buss", buss);
		return "/WEB-INF/view/service/service_detail";
	}

	@RequestMapping("/modifyService")
	public String modifyService(HttpServletRequest request){
		HttpSession session=request.getSession();
		List<Fee> allFee = feeService.getAllFee();
		session.setAttribute("allFee", allFee);
		String string =request.getParameter("id");
		int buss_id=Integer.parseInt(string);
		Buss buss1=new Buss();
		buss1.setSer_id(buss_id);
		Buss buss = bussService.getBussById(buss1);
		session.setAttribute("buss", buss);
		return "/WEB-INF/view/service/service_modi";
	}
	@RequestMapping("/modifyOverService")
	public String modifyOverService(HttpServletRequest request){
		int buss_id=Integer.parseInt(request.getParameter("bussid"));
		int tar_id=Integer.parseInt(request.getParameter("fee_id"));
		Buss buss=new Buss();
		buss.setSer_id(buss_id);
		buss.setFee_id(tar_id);
		/*bussService.modifyBussById(buss);*/
		ServiceJob.addService(buss);
		return "redirect:/service/getByPageCondition.do";
	}
	@RequestMapping("/openService")
	public void openService(HttpServletRequest request,PrintWriter out){
		int bussid=Integer.parseInt(request.getParameter("finId"));
		String buss_ctime=new Date().toLocaleString();
		Buss buss1=new Buss();
		buss1.setSer_ctime(buss_ctime);
		buss1.setSer_id(bussid);
		int i = bussService.modifyBussState2(buss1);
		if(i>0){
			out.print("yes");
		}else{
			out.print("no");
		}
		out.flush();
		out.close();
		
	}
	@RequestMapping("/pauseService")
	public void pauseService(HttpServletRequest request,PrintWriter out){		
		int bussid=Integer.parseInt(request.getParameter("finId"));
		String buss_ctime=new Date().toLocaleString();
		Buss buss1=new Buss();
		buss1.setSer_ctime(buss_ctime);
		buss1.setSer_id(bussid);
		int i=bussService.modifyBussState1(buss1);
		if(i>0){
			out.print("yes");
		}else{
			out.print("no");
		}
		out.flush();
		out.close();
	}
	@RequestMapping("/searchService")
	public String searchService(HttpServletRequest request){
		String os=request.getParameter("os");
		String ip=request.getParameter("serverip");
		String idc=request.getParameter("idc");
		Buss buss=new Buss();
		buss.setSer_os(os);
		buss.setSer_ip(ip);
		Account account=new Account();
		account.setAcc_idc(idc);
		Account acc = accountService.getAccByIDCard(account);
		if(acc!=null){
			buss.setAcc_id(acc.getAcc_id());
		}
		List<Buss> busses = bussService.getBussByCondition(buss);
		request.setAttribute("busses", busses);
		return "/WEB-INF/view/service/service_list";
	}
	@RequestMapping("/searchAccountByIdCard")
	public void searchAccountByIdCard(HttpServletRequest request,PrintWriter out){
		String idcard=request.getParameter("idcard");
		Account acc=new Account();
		acc.setAcc_idc(idcard);
		Account account = accountService.getAccByIDCard(acc);
		if(account!=null&&account.getAcc_state()==1){
			int acc_id=account.getAcc_id();
			out.print(acc_id);
		}else{
			out.print("aaaaaaaaa");
		}
		out.flush();
		out.close();
	}
	
	@RequestMapping("/getByPageCondition")
	public String getByPageCondition(HttpServletRequest request,BussPage page) throws SQLException{
		String os=request.getParameter("os");
		String ip=request.getParameter("ip");
		String idc=request.getParameter("idc");
		String state=request.getParameter("state");
		Buss bus=new Buss();
		bus.setSer_os(os);
		bus.setSer_ip(ip);
		if(state!=null&&state!=""){
			bus.setSer_state(Integer.parseInt(state));
		}
		/*Account account=new Account();
		account.setAcc_idc(idc);
		Account acc = accountService.getAccByIDCard(account);
		if(acc!=null){
			bus.setAcc_id(acc.getAcc_id());
		}*/
		String s=request.getParameter("currPage");
		int startPage;
	    int currPage=1;
		if(s==null){
			startPage=(page.getCurrPage()-1)*(page.getPageSize());
			page.setStartPage(startPage);
		}else{
			currPage=Integer.parseInt(s);
			startPage=(Integer.parseInt(s)-1)*(page.getPageSize());
			page.setStartPage(startPage);
		}
		Map<String,Object> map1=new HashMap<String,Object>();
		map1.put("bus", bus);
		map1.put("idc", idc);
		int count=bussService.getCount(map1);
		page.setTotalCount(count);
		int a=(int) Math.ceil(page.getTotalCount()*1.0/page.getPageSize());
		page.setTotalPage(a);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("bus", bus);
		map.put("page", page);
		map.put("idc", idc);
		List<Buss> busses=bussService.getByPageCondition(map);
		request.setAttribute("busses", busses);
		request.setAttribute("totalPage", a);
		request.setAttribute("currPage",currPage);
		request.setAttribute("os", os);
		request.setAttribute("ip",ip);
		request.setAttribute("idc", idc);
		request.setAttribute("totalCount", count);
		if(state!=null&state!=""){
			request.setAttribute("state", Integer.parseInt(state));
		}
		return "/WEB-INF/view/service/service_list";
	}
	@RequestMapping("/searchOsname")
	public void searchOsname(HttpServletRequest request,PrintWriter out){
		String osname = request.getParameter("osname");
		Buss buss=null;
		if(osname!=""){
			buss = bussService.getBussByOsname(osname);
		}	
		if(buss!=null){
			out.print("yes");
		}else{
			out.println("no");
		}
		out.flush();
		out.close();
	}
	@RequestMapping("/searchSip")
	public void searchSip(HttpServletRequest request,PrintWriter out){
		String sip = request.getParameter("sip");
		Buss buss=null;
		if(sip!=""){
			buss = bussService.getBussBySip(sip);
		}	
		if(buss!=null){
			out.print("yes");
		}else{
			out.println("no");
		}
		out.flush();
		out.close();
	}
	@RequestMapping("/checkService")
	public void checkService(HttpServletRequest request,PrintWriter out){
		String sip = request.getParameter("sip");
		String idcard=request.getParameter("idcard");
		String osname = request.getParameter("osname");
		Account acc=new Account();
		acc.setAcc_idc(idcard);
		Account account = accountService.getAccByIDCard(acc);
	/*	if(account!=null&&account.getAcc_state()==1){
			int acc_id=account.getAcc_id();
			out.print(acc_id);
		}else{
			out.print("不存在该id!!");
		}*/
		Buss buss=null;
		if(sip!=""){
			buss = bussService.getBussBySip(sip);
		}
		Buss buss1=null;
		if(osname!=""){
			buss1 = bussService.getBussByOsname(osname);
		}
		if(buss==null&&buss1==null&&account!=null&&account.getAcc_state()==1){
			int acc_id=account.getAcc_id();
			out.print(acc_id);
		}else{
			out.println("这是一个没啥用的字符串，单纯为了判断 ");
		}
		out.flush();
		out.close();
	}
	
	
}
