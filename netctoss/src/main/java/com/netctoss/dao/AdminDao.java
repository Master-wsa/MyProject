package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Admin;
import com.netctoss.entity.Adminrole;

/**
 * 管理员数据访问层
 * @author anjia
 *
 */
public interface AdminDao {
	/**
	 * 添加管理员信息
	 * @param admin
	 * @return
	 */
	public int insertAdmin(Admin admin);
	/**
	 * 添加管理员角色信息
	 * @param admin
	 * @return
	 */
	public int insertAdmrol(Admin admin);
	/**
	 * 修改管理员信息
	 * @param admin
	 * @return
	 */
	public int updateAdminInfo(Admin admin);
	/**
	 * 在管理员模块修改信息
	 * @param admin
	 * @return
	 */
	public int updateInfoByAdmin(Admin admin);
	/**
	 * 给管理员重置密码
	 * @param listI
	 * @return
	 */
	public int updateResetPsw(List<Integer> listI);
	/**
	 * 修改管理员密码
	 * @param admin
	 * @return
	 */
	public int updateAdminPsw(Admin admin);
	/**
	 * 修改管理员的头像
	 * @param admin
	 * @return
	 */
	public int updateImage(Admin admin);
	/**
	 * 删除管理员
	 * @param admin
	 * @return
	 */
	public int deleteAdmin(Admin admin);
	/**
	 * 删除管理员角色信息
	 * @param admin
	 * @return
	 */
	public int deleteAdmrol(Admin admin);
	/**
	 * 删除管理员角色（fcy）
	 * @param admrol
	 * @return
	 */
	public int delectAdminRole(Adminrole admrol);
	/**
	 * 登录
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin);
	/**
	 * 根据角色ID查询管理员
	 * @param admin
	 * @return
	 */
	public List<Admin> selectAdminByRoleId(Admin admin);
	/**
	 * 根据管理员账号查询管理员信息
	 * @param admin
	 * @return
	 */
	public Admin selectAdminByAccount(Admin admin);
	/**
	 * 查询所有管理员
	 * @param admin
	 * @return
	 */
	public List<Admin> selectAllAdmins(List<Integer> listI);
	/**
	 * 查询所有管理员id
	 * @param map
	 * @return
	 */
	public List<Integer> selectAllAdmid(Map<String,Object> map);
	/**
	 * 通过id查找管理员
	 * @param admin
	 * @return
	 */
	public Admin selectAdminById(Admin admin);
	/**
	 * 查询管理员总个数
	 * @return
	 */
	public int selectAdminCount(Map<String,Object> map);
}
