package com.netctoss.service;

import java.util.List;

import com.netctoss.entity.Admin;
import com.netctoss.entity.Adminrole;
import com.netctoss.entity.Role;
import com.netctoss.entity.Rolepower;

public interface RoleService {
	/**
	 * 查找所有角色RoleService
	 * @return
	 */
	public List<Role> selectAllRole();
	
	/**
	 * 删除角色
	 * @param role
	 * @return
	 */
	public boolean delRole(Role role,Adminrole admrol);
	
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public boolean addRole(Role role);
	
	/**
	 * 通过rol_name查找
	 * @param role
	 * @return
	 */
	public Role getRoleByName(Role role);
	
	/**
	 * 添加角色权限
	 * @param rolepower
	 * @return
	 */
	public boolean addRolPow(Rolepower rolepower);
	
	/**
	 * 通过rol_id查找role
	 * @param role
	 * @return
	 */
	public Role getRoleById(Role role);
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	public boolean updRole(Role role);
	
	/**
	 * 删除角色权限
	 * @param role
	 * @return
	 */
	public boolean delRolPow(Role role);
}
