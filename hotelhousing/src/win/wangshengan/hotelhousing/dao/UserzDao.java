package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Userz;

public interface UserzDao {

	/**
	 * 查询客户信息
	 * @param userz
	 * @return
	 */
	public int insertUserz(Userz userz);
	/**
	 * 修改客户信息
	 * @param userz
	 * @return
	 */
	public int updateUserz(Userz userz);
	/**
	 * 删除客户信息
	 * @param userz
	 * @return
	 */
	public int deleteUserz(Userz userz);
	/**
	 * 查询所以客户信息
	 * @return
	 */
	public List<Userz> selectAllUserz();
	/**
	 * 查询客户个人信息
	 * @return
	 */
	public Userz selectUserzById(String id);
	/**
	 * 通过客户身份证号和密码查询
	 * @param userz
	 * @return
	 */
	public Userz selectUserzByIdPsw(Userz userz);
}
