package com.netctoss.dao;

import java.util.List;

import com.netctoss.entity.Role;
import com.netctoss.entity.Rolepower;

public interface RoleDao {
	/**
	 * 查询所有角色信息（初始化角色页面）
	 * @return
	 */
	public List<Role> selectAllRole();
	
	/**
	 * 删除角色
	 * @param role
	 * @return
	 */
	public int deleteRole(Role role);
	
	/**
	 * 删除角色权限
	 * @param role
	 * @return
	 */
	public int deleteRolPow(Role role);
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	public int updateRole(Role role);
	
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public int insertRole(Role role);
	
	/**
	 * 添加角色权限
	 * @param role
	 * @return
	 */
	public int insertRolPow(Rolepower rolepower);
	
	/**
	 * 通过rol_name查找rol_id
	 * @param role
	 * @return
	 */
	public Role selectRoleByName(Role role);
	
	/**
	 * 通过rol_id查找Role
	 * @param role
	 * @return
	 */
	public Role selectRoleById(Role role);
}
