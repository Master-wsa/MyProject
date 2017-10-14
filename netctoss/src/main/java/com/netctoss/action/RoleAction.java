package com.netctoss.action;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.netctoss.entity.Admin;
import com.netctoss.entity.Adminrole;
import com.netctoss.entity.Powers;
import com.netctoss.entity.Role;
import com.netctoss.entity.Rolepower;
import com.netctoss.service.AdminService;
import com.netctoss.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleAction {

	@Resource
	private RoleService roleService;
	@Resource
	private AdminService adminService;
	
	@RequestMapping("/rediectIndex")
	public String redirectIndex(){
		return "WEB-INF/view/index";
	}
	

	//ajax验证新建角色名是否存在
	@RequestMapping("/validate")
	public void validate(Role role,String rolName,PrintWriter out){
		Role rol = roleService.getRoleByName(role);
		if(rol == null){
			out.print("yes");
		}
		else if(rolName.equals(rol.getRol_name())){
			out.print("yyy");
		}
		else{
			out.print("no");
		}
	}
	
	//初始化角色页面
	@RequestMapping("/selectAllRole")
	public String selectAllRole(Model model){
		List<Role> lr = roleService.selectAllRole();
		model.addAttribute("l_all_role", lr);
		return "WEB-INF/view/role/role_list";
	}
	
	//删除角色
	@RequestMapping("/deleteRole")
	public void deleteRole(int del_id,PrintWriter out){
		Admin admin = new Admin();
		admin.setRol_id(del_id);
		List<Admin> listA = adminService.getAdminByRoleId(admin);
		if(listA.size() == 0){
			Role role = new Role();
			Adminrole admrol = new Adminrole();
			role.setRol_id(del_id);
			admrol.setRol_id(del_id);
			boolean b = roleService.delRole(role,admrol);
			if(b){
				out.print(1);
			}else{
				out.print(0);
			}
		}else{
			out.print(2);
		}
	}
	
	@RequestMapping("/selectAllRolesToAdmin")
	public String selectAllRolesToAdmin(HttpSession session){
		List<Role> lr = roleService.selectAllRole();
		session.setAttribute("allRole", lr);
		return "WEB-INF/view/admin/admin_add";
	}
	
	/*
	 * 跳转到添加角色页面
	 */
	@RequestMapping("/toAddRole")
	public String toAddRole(){
		return "WEB-INF/view/role/role_add";
	}
	
	/*
	 * 添加角色信息
	 */
	@RequestMapping("/addRole")
	public String addRole(Role role,@RequestParam("jur")int[] pow,Model model){
		boolean b = roleService.addRole(role);
		boolean b1 = false;
		if(b == true){
			int rol_id = roleService.getRoleByName(role).getRol_id();
			for(int i=0; i<pow.length; i++){
				Rolepower rolepower = new Rolepower();
				rolepower.setRol_id(rol_id);
				rolepower.setPow_id(pow[i]);
				b1 = roleService.addRolPow(rolepower);
			}
		}
		model.addAttribute("success", b1);
		return "redirect:/role/selectAllRole.do";
	}
	
	/*
	 * 跳转修改角色页面
	 */
	@RequestMapping("/toUpdateRole")
	public String toUpdateRole(HttpServletRequest request,Model model){
		int rol_id = Integer.valueOf(request.getParameter("upd_id"));
		Role role = new Role();
		role.setRol_id(rol_id);
		Role role1 = roleService.getRoleById(role);
		List<Powers> lp = role1.getList_powers();
		for(int i=0; i<lp.size(); i++){
			int pow_id = lp.get(i).getPow_id();
			model.addAttribute("jur"+pow_id, "checked='checked'");
		}
		model.addAttribute("role", role1);
		return "WEB-INF/view/role/role_modi";
	}
	
	/*
	 * 修改角色信息
	 */
	@RequestMapping("/updateRole")
	public String updateRole(Role role,@RequestParam("juridt")int[] pow,Model model){
		int id = role.getRol_id();
		String name = role.getRol_name();
		boolean b2 = false;
		boolean b = roleService.updRole(role);
		if(b == true){
			boolean b1 = roleService.delRolPow(role);
			for(int i=0; i<pow.length; i++){
				Rolepower rolepower = new Rolepower();
				rolepower.setRol_id(id);
				rolepower.setPow_id(pow[i]);
				b2 = roleService.addRolPow(rolepower);
			}
		}
		model.addAttribute("success", b2);
		return "redirect:/role/selectAllRole.do";
	}
}
