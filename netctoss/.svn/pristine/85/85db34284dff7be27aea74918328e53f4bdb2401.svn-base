package com.netctoss.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netctoss.entity.Report;
import com.netctoss.service.AccountService;
import com.netctoss.service.ReportService;
import com.netctoss.util.PageUtil;

@Controller
@RequestMapping("report")
public class ReportAction {
	@Resource
	private ReportService reportService;
	@RequestMapping("report")
	public String reportList(Model model,HttpServletRequest requset){
			int  startRecored =0;
			int  pageSize=8;
			Map<String, Integer> map =new  HashMap<String,Integer>();
			map.put("startRecored",startRecored);
			map.put("pageSize",8);
			Map mp= new HashMap();
			mp.put("startRecored", -1);
			int totalSize =reportService.getAllReport(mp).size();
			int totalSize2=reportService.getAllReport2(mp).size();
			int totalSize3=reportService.getAllReport3(mp).size();
			int totalPage=(totalSize%pageSize==0)?(totalSize/pageSize):(totalSize/pageSize+1);
			int totalPage2=(totalSize2%pageSize==0)?(totalSize2/pageSize):(totalSize2/pageSize+1);
			int totalPage3=(totalSize3%pageSize==0)?(totalSize3/pageSize):(totalSize3/pageSize+1);
			model.addAttribute("totalPage",totalPage);
			model.addAttribute("totalPage2",totalPage2);
			model.addAttribute("totalPage3",totalPage3);
			model.addAttribute("totalSize",totalSize);
			model.addAttribute("totalSize2",totalSize2);
			model.addAttribute("totalSize3",totalSize3);
			model.addAttribute("curPage",1);
			model.addAttribute("report",reportService.getAllReport(map));
			model.addAttribute("report1",reportService.getAllReport2(map));
			model.addAttribute("report2",reportService.getAllReport3(map));
			return "WEB-INF/view/report/report_list";
	}
	@RequestMapping("list")
	@ResponseBody
	public List<Report> list1(int curPage){
			int  pageSize=8;
			Map mp= new HashMap();
			mp.put("startRecored", -1);
			int  totalSize=reportService.getAllReport(mp).size();
			PageUtil pu = new PageUtil(totalSize,pageSize,curPage);
			Map map= new HashMap();
			map.put("startRecored",pu.getStartRecored());
			map.put("pageSize",8);
			return reportService.getAllReport(map);
	}
	@RequestMapping("list2")
	@ResponseBody
	public List<Report> list12(int curPage){
		int  pageSize=8;
		Map mp= new HashMap();
		mp.put("startRecored", -1);
		int  totalSize=reportService.getAllReport2(mp).size();
		PageUtil pu = new PageUtil(totalSize,pageSize,curPage);
		Map map= new HashMap();
		map.put("startRecored",pu.getStartRecored());
		map.put("pageSize",8);
		return reportService.getAllReport2(map);
	}
	@RequestMapping("list3")
	@ResponseBody
	public List<Report> list3(int curPage){
		int  pageSize=8;
		Map mp= new HashMap();
		mp.put("startRecored", -1);
		int  totalSize=reportService.getAllReport3(mp).size();
		PageUtil pu = new PageUtil(totalSize,pageSize,curPage);
		Map map= new HashMap();
		map.put("startRecored",pu.getStartRecored());
		map.put("pageSize",8);
		return reportService.getAllReport3(map);
	}
}
