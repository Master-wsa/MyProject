package com.netctoss.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.netctoss.entity.Admin;
import com.netctoss.entity.Powers;
import com.netctoss.entity.Role;
import com.netctoss.service.AdminService;
import com.netctoss.service.PowersService;
import com.netctoss.service.RoleService;

@Controller
@RequestMapping("/admin")
public class AdminAction {
	
	@Resource
	private AdminService adminService;
	@Resource
	private RoleService roleService;
	@Resource
	private PowersService powersService;
	
	@RequestMapping("/login")
	public String login(Admin admin,HttpServletRequest request){
		Admin adm = adminService.login(admin);
		if(adm == null){
			request.setAttribute("admin", admin);
			request.setAttribute("error", "对不起！账号或密码输入错误！");
			return "login";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("adm", adm);
			return "WEB-INF/view/index";
		}
	}
	
	@RequestMapping("/testImage")
	public void testImage(HttpServletRequest request,PrintWriter out){
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
		MultiValueMap<String, MultipartFile> multiValueMap = multipartRequest.getMultiFileMap();
		MultipartFile file = multiValueMap.getFirst("input-b9[]");
		try {
			BufferedImage image = ImageIO.read(file.getInputStream());
			int width = image.getWidth();
			int height = image.getHeight();
			if(width<=400&&height<=400){
				out.print("yes");
			}
			else{
				out.print("no");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//修改图片
	@RequestMapping("/getImg")
    public String getImg(@RequestParam("input-b9[]")MultipartFile file,Admin admin,HttpServletRequest request){
    	String path = request.getServletContext().getRealPath("/");
		try {
			file.transferTo(new File(path+"/fileImage/"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		admin.setAdm_img("fileImage/"+file.getOriginalFilename());
		int i = adminService.updateImage(admin);
		Admin adm = (Admin)request.getSession().getAttribute("adm");
		adm.setAdm_img("fileImage/"+file.getOriginalFilename());
		return "redirect:/admin/adminAllAdmins.do";
    }
	
	//添加管理员信息
	@RequestMapping("/addAdmin")
	public String addAdmin(@RequestParam("role")int[] role,@RequestParam("input-b9[]")MultipartFile file,HttpServletRequest request,Admin admin,Model model){
		String path = request.getServletContext().getRealPath("/");
		try {
			file.transferTo(new File(path+"/fileImage/"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//把图片的地址存入到数据库中
		admin.setAdm_img("fileImage/"+file.getOriginalFilename());
		//把前台角色装入集合中
		List<Role> listR = new ArrayList<Role>();
		for(int i=0;i<role.length;i++){
			Role rol = new Role();
			rol.setRol_id(role[i]);
			listR.add(rol);
		}
		admin.setLr(listR);
		//获取当前时间
		Timestamp time = new Timestamp(System.currentTimeMillis());
		admin.setAdm_date(time);
		int i = adminService.addAdmin(admin);
		if(i == 0){
			model.addAttribute("addAdminError", "添加失败！");
			return "WEB-INF/view/admin/admin_add";
		}
		else{
			return "redirect:/admin/adminAllAdmins.do";
		}
	}
	
	//搜索与分页功能
	@RequestMapping("/selectAdminsByCondition")
	public String selectAdminsByCondition(@RequestParam("power_sel")int power_sel,@RequestParam("rol_id")int rol_id,@RequestParam("currentPage")int currentPage,Model model,HttpSession session){
		Admin adm = (Admin)session.getAttribute("adm");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pow_id", power_sel);
		map.put("rol_id", rol_id);
		map.put("currentPage", currentPage);
		List<Admin> listA = adminService.getAllAdmins(map);
		int i = adminService.getAdminCount(map);
		model.addAttribute("listA", listA);
		model.addAttribute("powerId", power_sel);
		model.addAttribute("rolId", rol_id);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalRecord", i);
		model.addAttribute("adminId", adm.getAdm_id());
		model.addAttribute("totlePage", (i%8==0)?((i==0)?1:(i/8)):(i/8+1));
		return "WEB-INF/view/admin/admin_list";
	}
	
	
	//修改用户信息
	@RequestMapping("/updateAdminInfo")
	public void updateAdminInfo(Admin admin,PrintWriter out,HttpSession session){
		boolean b = adminService.updateAdminInfo(admin);
		if(b){
			session.setAttribute("adm", adminService.getAdminById(admin));
			out.print(true);
		}else{
			out.print(false);
		}
	}
	
	//在管理员模块修改信息
	@RequestMapping("/updateInfoByAdmin")
	public String updateInfoByAdmin(@RequestParam("roleInfo")int[] roleInfo,Admin admin){
		List<Role> listR = new ArrayList<Role>();
		for(int i=0;i<roleInfo.length;i++){
			Role rol = new Role();
			rol.setRol_id(roleInfo[i]);
			listR.add(rol);
		}
		admin.setLr(listR);
		adminService.updateInfoByAdmin(admin);
		return "redirect:/admin/adminAllAdmins.do";
	}
	
	//重置密码
	@RequestMapping("/updateResetPsw")
	@ResponseBody
	public int updateResetPsw(@RequestParam("chk_value")int[] chk_value,HttpSession session){
		int j = 0;
		Admin admin = (Admin)session.getAttribute("adm");
		List<Integer> listI = new ArrayList<Integer>();
		for(int i=0;i<chk_value.length;i++){
			//判断重置管理员中有没有当前用户
			if(chk_value[i]==admin.getAdm_id()){
				j++;
			}
			listI.add(chk_value[i]);
		}
		int i = adminService.updateResetPsw(listI);
		//返回结果为2时，有当前用户，为1时，无当前用户，为0时重置没成功
		if(i > 0){
			if(j > 0) return 2;
			else return 1;
		}
		else return 0;
	}
	

	//跳转用户信息修改
	@RequestMapping("/adminInfo")
	public String adminInfo(){
		return "WEB-INF/view/user/user_info";
	}
	
	//跳转用户密码界面
	@RequestMapping("/adminPsw")
	public String adminPsw(){
		return "WEB-INF/view/user/user_modi_pwd";
	}
	
	//修改管理员密码
	@RequestMapping("/updateAdminPsw")
	public void updateAdminPsw(HttpServletRequest request,HttpSession session,PrintWriter out){
		Admin admin = (Admin) session.getAttribute("adm");
		String oldpsw = request.getParameter("oldpsw");
		String newpsw = request.getParameter("newpsw1");
		if(admin.getAdm_pwd().equals(oldpsw)){
			admin.setAdm_pwd(oldpsw);
			if(adminService.login(admin)!=null){
				admin.setAdm_pwd(newpsw);		
				out.print(adminService.updateAdminPsw(admin));
			}else{
				out.print(false);
			}
		}else{
			out.print(false);
		}
	}
	
	//点击删除按钮
	@RequestMapping("/deleteAdmin")
	public void deleteAdmin(Admin admin,PrintWriter out,HttpSession session){
		Admin adm = (Admin)session.getAttribute("adm");
		if(admin.getAdm_id()==adm.getAdm_id()){
			out.print(-1);
		}else{
			int i = adminService.delAdmin(admin);
			out.print(i);
		}
	}
	
	//点击修改按钮
	@RequestMapping("/modifyAdmin")
	public String modifyAdmin(@RequestParam int id,Model model,HttpSession session){
		Admin admin = new Admin();
		admin.setAdm_id(id);
		List<Role> allRole = roleService.selectAllRole();
		Admin adm = adminService.getAdminById(admin);
		model.addAttribute("admin_id", adm);
		model.addAttribute("allRole", allRole);
		return "WEB-INF/view/admin/admin_modi";
	}
	
	@RequestMapping("/selectAdminByAccount")
	public void selectAdminByAccount(Admin admin,PrintWriter out){
		Admin adm = adminService.getAdminByAccount(admin);
		if(adm == null){
			out.print("yes");
		}
		else{
			out.print("no");
		}
	}
	
	//初始化管理员界面
	@RequestMapping("/adminAllAdmins")
	public String selectAllAdmins(Model model,HttpSession session){
		Admin adm = (Admin)session.getAttribute("adm");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("currentPage", 1);
		List<Admin> listA = adminService.getAllAdmins(map);
		List<Powers> listP = powersService.getAllPowers();
		List<Role> listR = roleService.selectAllRole();
		int i = adminService.getAdminCount(map);
		model.addAttribute("listA", listA);
		model.addAttribute("totalRecord", i);
		model.addAttribute("totlePage", (i%8==0)?((i==0)?1:(i/8)):(i/8+1));
		model.addAttribute("currentPage", 1);
		model.addAttribute("adminId", adm.getAdm_id());
		session.setAttribute("listP", listP);
		session.setAttribute("listR", listR);
		return "WEB-INF/view/admin/admin_list";
	}

	@RequestMapping("/exit")
	public String exitLogin(HttpSession session){
		session.invalidate();
		return "redirect:../login.jsp";
	}
}
