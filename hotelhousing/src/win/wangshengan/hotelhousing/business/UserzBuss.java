/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Userz;

/**
 * 客户业务Business接口
 * @author AnJia
 *
 */
public interface UserzBuss {

	/**
	 * 查询客户信息
	 * @param userz
	 * @return
	 */
	public boolean addUserz(Userz userz);
	/**
	 * 修改客户信息
	 * @param userz
	 * @return
	 */
	public boolean updateUserz(Userz userz);
	/**
	 * 删除客户信息
	 * @param userz
	 * @return
	 */
	public boolean delUserz(Userz userz);
	/**
	 * 查询所以客户信息
	 * @return
	 */
	public List<Userz> getAllUserz();
	/**
	 * 查询客户个人信息
	 * @return
	 */
	public Userz getUserzById(String id);
	/**
	 * 通过ID和密码查询客户信息
	 * @param userz
	 * @return
	 */
	public boolean getUserzByIdPsw(Userz userz);
}
