package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Admit;

public interface AdmitDao {

	/**
	 * 添加管理员信息
	 * @param admit
	 * @return
	 */
	public int insertAdmit(Admit admit);
	/**
	 * 修改管理员信息
	 * @param admit
	 * @return
	 */
	public int updateAdmit(Admit admit);
	/**
	 * 删除管理员信息
	 * @param admit
	 * @return
	 */
	public int deleteAdmit(Admit admit);
	/**
	 * 查询所有管理员信息
	 * @return
	 */
	public List<Admit> selectAllAdmits();
	/**
	 * 查询单个管理员信息
	 * @param admit
	 * @return
	 */
	public Admit selectAdmit(Admit admit);
	/**
	 * 根据ID和密码查询
	 * @param admit
	 * @return
	 */
	public Admit selectAdmitByIdPsw(Admit admit);
}
