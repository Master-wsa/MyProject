package com.netctoss.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netctoss.entity.Fee;
import com.netctoss.service.FeeService;
import com.netctoss.util.PageUtil;

@Controller
@RequestMapping("/fee")
public class FeeAction {
	
	@Resource
	private FeeService feeService;
	
	/*
	 * 鏌ョ湅鎵�鏈夎祫璐逛俊鎭�
	 */
	@RequestMapping("/getAllFee")
	public String getAllFee(HttpServletRequest request,Model model){
		String descOrAsc = request.getParameter("descOrAsc");	//sort_asc  sort_desc
		String da = "asc";
		int fee_time=0;
		int fee_bfee=0;
		int fee_ufee=0;
		int curPage=1;
		String field=null;
		if(!"".equals(request.getParameter("field"))&&request.getParameter("field")!=null){
				field = request.getParameter("field");
		}
		int totalSize=feeService.countFee();
		if(!"".equals(request.getParameter("curPage"))&&request.getParameter("curPage")!=null){
			curPage=Integer.parseInt(request.getParameter("curPage"));
		}
		PageUtil pu = new PageUtil(totalSize,8,curPage);
		Map map= new HashMap();
		if("sort_asc".equals(descOrAsc)) {
			da = "asc";
		}
		else{ 
			da = "desc";
		}
		int startRecored=0;
		int pageSzie=0;
		if(totalSize-8*curPage>=0){
			 startRecored =totalSize-8*curPage;
			 pageSzie=8;
		}else{
			 startRecored =0;
			 pageSzie=totalSize%8;
		}
		map.put("descOrAsc", da);
		map.put("field", field);
		map.put("pageSize", pageSzie);
		map.put("startRecored", startRecored);
		List<Fee> lf = feeService.getFeeSort(map);
		List<Fee> lf1 = new ArrayList<Fee>();
		for(int i=lf.size()-1;i>=0;i--){
			lf1.add(lf.get(i));
		}
		model.addAttribute("l_all_fee", lf1);
		model.addAttribute("descOrAsc", da);
		model.addAttribute("field", field);
		model.addAttribute("curPage",curPage);
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage",pu.getTotalPage());
		return "WEB-INF/view/fee/fee_list";
	}
	
	/*
	 * 鏌ョ湅璧勮垂鍏蜂綋淇℃伅
	 */
	@RequestMapping("/getFeeDetail")
	public String getFeeDetail(HttpServletRequest request,Model model){
		int fee_id = Integer.valueOf(request.getParameter("fee_id"));
		Fee fee1 = new Fee();
		fee1.setFee_id(fee_id);
		Fee fee2 = feeService.getFeeById(fee1);
		model.addAttribute("fee", fee2);
		return "WEB-INF/view/fee/fee_detail";
	}
	
	/*
	 * 杞埌淇敼璧勮垂
	 */
	@RequestMapping("/toUpdateFee")
	public String toUpdateFee(HttpServletRequest request,Model model){
		int fee_id = Integer.valueOf(request.getParameter("fee_id"));
		Fee fee1 = new Fee();
		fee1.setFee_id(fee_id);
		Fee fee2 = feeService.getFeeById(fee1);
		model.addAttribute("fee", fee2);
		return "WEB-INF/view/fee/fee_modi";
	}
	
	/*
	 * 淇敼璧勮垂璇︾粏淇℃伅
	 */
	@RequestMapping("/updateFee")
	@ResponseBody
	public String updateFee(int fee_id,String fee_name,int fee_time,double fee_bfee,double fee_ufee,String fee_des,int fee_type){
		Fee fee =new Fee();
		fee.setFee_id(fee_id);
		fee.setFee_name(fee_name);
		fee.setFee_time(fee_time);
		fee.setFee_bfee(fee_bfee);
		fee.setFee_ufee(fee_ufee);
		fee.setFee_des(fee_des);
		fee.setFee_type(fee_type);
		boolean b = feeService.updFee(fee);
		if(b){
			return "yes";
		}
		return "no";
	}
	
	/*
	 * 鍒犻櫎璧勮垂
	 */
	@RequestMapping("/deleteFee")
	@ResponseBody
	public String deleteFee(HttpServletRequest request){
		int delete_id = Integer.valueOf(request.getParameter("delete_id")); 
		Fee fee = new Fee();
		fee.setFee_state(2);
		fee.setFee_id(delete_id);
		boolean b = feeService.updFeeStateById(fee);
		if(b){
			return "yes";
		}
		return "no";
	}
	
	/*
	 * 寮�鍚祫璐�
	 */
	@RequestMapping("/startFee")
	@ResponseBody
	public String startFee(HttpServletRequest request){
		int start_id = Integer.valueOf(request.getParameter("start_id"));
		Fee fee = new Fee();
		fee.setFee_state(1);
		fee.setFee_id(start_id);
		boolean b = feeService.updFeeStateById(fee);
		Map map=new HashMap();
		if(b){
			Fee fee1 = feeService.getFeeById(new Fee(start_id));
			/*map.put("s", "yes");*/
			String s2=fee1.getFee_stime()+"";
			
			return s2;
		}
		return "no";
	}
	
	/*
	 * 杞埌娣诲姞璧勮垂
	 */
	@RequestMapping("/toAddFee")
	public String toAddFee(){
		return "WEB-INF/view/fee/fee_add";
	}
	
	/*
	 * 娣诲姞璧勮垂
	 */
	@RequestMapping("/addFee")
	@ResponseBody
	public String addFee(String fee_name,int fee_time,double fee_bfee,double fee_ufee,String fee_des,int fee_type){
		/*String fee_name = fee.getFee_name();
		int fee_type = Integer.valueOf(request.getParameter("type"));
		int fee_time = fee.getFee_time();
		double fee_bfee = fee.getFee_bfee();
		double fee_ufee = fee.getFee_ufee();
		String fee_des = fee.getFee_des();*/
		Fee fee1 = new Fee();
		fee1.setFee_name(fee_name);
		fee1.setFee_type(fee_type);
		fee1.setFee_time(fee_time);
		fee1.setFee_bfee(fee_bfee);
		fee1.setFee_ufee(fee_ufee);
		fee1.setFee_des(fee_des);
		boolean b = feeService.addFee(fee1);
		if(b){
			return "yes";
		}
		return "no";
		
	}
	@RequestMapping("/equalsName")
	@ResponseBody
	public String equalsName(String fee_name){
		Fee fee = new Fee();
		fee.setFee_name(fee_name);
		String s ;
		if(feeService.getFeeByName(fee)){
			s="yes";
		}else{
			s="no";
		}
		return s;
	}
}
