package com.netctoss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.AdminDao;
import com.netctoss.dao.PowersDao;
import com.netctoss.dao.RoleDao;
import com.netctoss.entity.Admin;
import com.netctoss.entity.Adminrole;
import com.netctoss.entity.Powers;
import com.netctoss.entity.Role;
import com.netctoss.entity.Rolepower;
import com.netctoss.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;
	@Resource
	private AdminDao adminDao;
	@Resource
	private PowersDao powersDao;
	/**
	 * 查找所有角色
	 */
	@Override
	public List<Role> selectAllRole() {
		return roleDao.selectAllRole();
	}

	/**
	 * 删除角色
	 */
	@Override
	public boolean delRole(Role role,Adminrole admrol) {
		int b = 0;
		int a = roleDao.deleteRolPow(role);
		Admin admin = new Admin();
		admin.setRol_id(role.getRol_id());
		List<Admin> listA = adminDao.selectAdminByRoleId(admin);
		if(listA.size()==0){
			b = 1;
		}else{
			b = adminDao.delectAdminRole(admrol);
		}
		int c = roleDao.deleteRole(role);
		if(a > 0 && b > 0 && c > 0) return true;
		return false;
	}

	/**
	 * 添加角色
	 */
	@Override
	public boolean addRole(Role role) {
		int a = roleDao.insertRole(role);
		if(a > 0) return true;
		return false;
	}

	/**
	 * 通过rol_name查找rol_id
	 */
	@Override
	public Role getRoleByName(Role role) {
		return roleDao.selectRoleByName(role);
	}

	/**
	 * 添加角色权限
	 */
	@Override
	public boolean addRolPow(Rolepower rolepower) {
		int i = roleDao.insertRolPow(rolepower);
		if(i > 0) return true;
		return false;
	}

	/**
	 * 通过rol_id查找role
	 */
	@Override
	public Role getRoleById(Role role) {	
		return roleDao.selectRoleById(role);
	}

	/**
	 * 修改角色
	 */
	@Override
	public boolean updRole(Role role) {
		int i = roleDao.updateRole(role);
		if(i > 0) return true;
		return false;
	}

	/**
	 * 删除角色权限
	 */
	@Override
	public boolean delRolPow(Role role) {
		int i = roleDao.deleteRolPow(role);
		System.out.println(i);
		if(i > 0) return true;
		return false;
	}


	
}
