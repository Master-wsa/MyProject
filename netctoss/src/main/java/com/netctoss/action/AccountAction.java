package com.netctoss.action;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netctoss.entity.Account;
import com.netctoss.entity.Buss;
import com.netctoss.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountAction {
	@Resource
	private AccountService accountService;
	
	@RequestMapping("getAllAccount")
	public String getAllAccount(Model model){
		Account account = new Account();
		account.setAcc_state(-1);
		Map map =  new HashMap();
		map.put("account", account);
		map.put("start", 0);
		map.put("pagesize",8);
		List<Account> la = accountService.getAccountByCondition(map);
		int count = accountService.getAccCount(map);
		int all = count; //所有的记录
		if(count%8==0){
			count=count/8;
		}else{
			count=count/8+1;
		}
		model.addAttribute("accountlist", la);	
		model.addAttribute("count",count);
		model.addAttribute("all",all);
		model.addAttribute("curPage",1);
		model.addAttribute("acc_state",-1);
		return "/WEB-INF/view/account/account_list";
	}
	/**
	 * 通过条件查询账务账号
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/getAccountByCondition")
	public String getAccountByCondition(HttpServletRequest request,Model model){
		String acc_idc = request.getParameter("acc_idc");
		String acc_name = request.getParameter("acc_name");
		String acc_login = request.getParameter("acc_login");
		String yn = request.getParameter("yn");
		int curPage=1;
		if(request.getParameter("curPage")!=null){
			curPage = Integer.parseInt(request.getParameter("curPage"));
			/*System.out.println(curPage+"aa");*/
		}
		int acc_state = -1;
		if(request.getParameter("acc_state")!=null){			
			acc_state = Integer.parseInt(request.getParameter("acc_state"));
		}
		Account account = new Account();
		account.setAcc_idc(acc_idc);
		account.setAcc_name(acc_name);
		account.setAcc_login(acc_login);
		account.setAcc_state(acc_state);
		Map map =  new HashMap();
		map.put("account", account);
		map.put("start", (curPage-1)*8);
		map.put("pagesize",8);
		List<Account> la = accountService.getAccountByCondition(map);
		int count = accountService.getAccCount(map);
		int all = count;	//所有的记录
		if(count%8==0){
			count=count/8;
		}else{
			count=count/8+1;
		}
		if(count==0){
			count=1;
		}
		model.addAttribute("accountlist", la);
		model.addAttribute("acc_idc",acc_idc);
		model.addAttribute("acc_name",acc_name);
		model.addAttribute("acc_login",acc_login);
		model.addAttribute("acc_state",acc_state);
		model.addAttribute("count",count);
		model.addAttribute("all",all);
		model.addAttribute("curPage",curPage);
		request.setAttribute("yn", yn);
		return "/WEB-INF/view/account/account_list";
	}
	/**
	 * 跳转到添加account的界面
	 * @return
	 */
	@RequestMapping("/addAccJsp")
	public String addAccJsp(){
		return "/WEB-INF/view/account/account_add";
	}
	/**
	 * 添加新的账务账号
	 * @param request
	 * @return
	 */
	@RequestMapping("/addAccount")
	public void addAccount(HttpServletRequest request,PrintWriter out){
		Account account = new Account();
		String acc_name = request.getParameter("acc_name");
		String acc_idc = request.getParameter("acc_idc");
		String acc_login = request.getParameter("acc_login");
		String acc_psw = request.getParameter("acc_psw");
		String acc_tel = request.getParameter("acc_tel");
		String acc_inidc = request.getParameter("acc_inidc");
		String acc_email = request.getParameter("acc_email");
		String acc_job = request.getParameter("acc_job");
		String acc_addr = request.getParameter("acc_addr");
		String acc_post = request.getParameter("acc_post");
		String acc_qq = request.getParameter("acc_qq");
		account.setAcc_name(acc_name);
		account.setAcc_idc(acc_idc);
		account.setAcc_login(acc_login);
		account.setAcc_psw(acc_psw);  //密码需要比较
		account.setAcc_tel(acc_tel);
		account.setAcc_inidc(acc_inidc);		
		account.setAcc_email(acc_email);
		account.setAcc_job(acc_job);
		account.setAcc_addr(acc_addr);
		account.setAcc_post(acc_post);
		account.setQq(acc_qq);
		account.setAcc_state(1);		
		
		account.setAcc_sex(Integer.parseInt(request.getParameter("acc_sex")));
		Timestamp stime = new Timestamp(System.currentTimeMillis());//获取系统当前时间
		String str = request.getParameter("acc_birth");  
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  
	    java.util.Date dd = null;  
        try {  
            dd = format.parse(str);  
        } catch (Exception ee) {  
            ee.printStackTrace();  
        }  
        java.sql.Date birth = new java.sql.Date(dd.getTime());  
		account.setAcc_stime(stime);
		account.setAcc_ctime(stime);
		account.setAcc_birth(birth);
		int i = accountService.addAccount(account);
		if(i>0){
			out.println("1");
		}else{
			out.println("2");
		}
	}
	
	/**
	 * 跳转到account_detail的界面
	 * @return
	 */
	@RequestMapping("/detailAccount")
	public String detailAccount(HttpServletRequest request){
		int acc_id = Integer.parseInt(request.getParameter("acc_id"));
		Account account = new Account(acc_id);
		Account account2 = accountService.getAccountByAccId(account);
		request.setAttribute("account", account2);
		return "/WEB-INF/view/account/account_detail";
	}
	
	/**
	 * 跳转到添加account_modi的界面
	 * @return
	 */
	@RequestMapping("/modiAccount")
	public String modiAccount(HttpServletRequest request){
		int acc_id = Integer.parseInt(request.getParameter("acc_id"));
		Account account = new Account(acc_id);
		Account account2 = accountService.getAccountByAccId(account);
		request.setAttribute("account", account2);
		return "/WEB-INF/view/account/account_modi";
	}
	/**
	 * 修改账务账号信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/changAccount")
	public void changeAccount(HttpServletRequest request,PrintWriter out){
		Account account = new Account();
		account.setAcc_id(Integer.parseInt(request.getParameter("acc_id")));
		account.setAcc_name(request.getParameter("acc_name"));
		account.setAcc_psw(request.getParameter("newpsw1"));
		account.setAcc_tel(request.getParameter("acc_tel"));
		account.setAcc_inidc(request.getParameter("acc_inidc"));		
		account.setAcc_email(request.getParameter("acc_email"));
		account.setAcc_job(request.getParameter("acc_job"));
		account.setAcc_sex(Integer.parseInt(request.getParameter("radSex")));
		account.setAcc_addr(request.getParameter("acc_addr"));
		account.setAcc_post(request.getParameter("acc_post"));
		account.setQq(request.getParameter("qq"));
		int i = accountService.updateAccountByAccId(account);
		if(i>0){
			out.println("1");
			/*return "redirect:getAccountByCondition.do";*/
		}else{
			out.println("2");
		}
	}
	@RequestMapping("/changeAccountState")
	public String  changeAccountState(HttpServletRequest request){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //定义格式
		Timestamp ctime = new Timestamp(System.currentTimeMillis());//获取系统当前时间
		String ser_ctime = df.format(ctime);	 //时间转为字符串
		int acc_id = Integer.parseInt(request.getParameter("id"));
		int state = Integer.parseInt(request.getParameter("sta"));
		Account account  = new Account();
		account.setAcc_id(acc_id);
		account.setAcc_state(state);
		account.setAcc_ctime(ctime);
		Buss buss = new Buss();
		buss.setAcc_id(acc_id);
		buss.setSer_state(state);
		buss.setSer_ctime(ser_ctime);	
		String acc_idc = request.getParameter("acc_idc");
		String acc_name = request.getParameter("acc_name");
		String acc_login = request.getParameter("acc_login");
		String acc_state = request.getParameter("acc_state");
		String curPage = request.getParameter("curPage");
		String yn = "";
		if(state==1){
			accountService.updateAccountState(account);
			yn="1";
		}else if(state==0){
			accountService.updateAccountState(account);
			accountService.updateBussState(buss);
			yn="3";
		}else if(state==2){
			int i = accountService.getSerByAccId(account);
			System.out.println(i);
			if(i>0){
				yn="4";
			}else{
				accountService.updateAccountState(account);
				accountService.updateBussState(buss);
				yn="2";
			}
		}
		return "redirect:getAccountByCondition.do?acc_idc="+acc_idc+"&acc_name="+acc_name+"&acc_login="+acc_login+"&acc_state="+acc_state+"&curPage="+curPage+"&yn="+yn;
	}
	
	@RequestMapping("/getAccountByidc")
	public void getAccountByidc(HttpServletRequest request,PrintWriter out){
		String acc_idc = request.getParameter("acc_idc");
		Account account = new Account();
		account.setAcc_idc(acc_idc);
		Account account2 = accountService.getAccByIDCard(account);
		if(account2!=null){
			out.println("1");
		}else{
			out.println("0");
		}
	}
	@RequestMapping("/getAccountByLogin")
	public void getAccountByLogin(HttpServletRequest request,PrintWriter out){
		String acc_login = request.getParameter("acc_login");
		/*System.out.println(acc_login);*/
		Account account = new Account();
		account.setAcc_login(acc_login);
		Account account2 = accountService.getAccByLogin(account);
		if(account2!=null){
			out.println("1");
		}else{
			out.println("0");
		}
	}
}
