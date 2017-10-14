package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Admit;

/**
 * 管理员业务接口
 * @author AnJia
 *
 */
public interface AdmitBuss {
	/**
	 * 添加管理员信息
	 * @return
	 */
	public int addAdmit();
	/**
	 * 修改管理员信息
	 * @param admit
	 * @return
	 */
	public boolean updateAdmit(Admit admit);
	/**
	 * 删除管理员信息
	 * @param admit
	 * @return
	 */
	public int delAdmit(Admit admit);
	/**
	 * 查询所有管理员信息
	 * @return
	 */
	public List<Admit> getAllAdmits();
	/**
	 * 查询单个管理员信息
	 * @param admit
	 * @return
	 */
	public Admit getAdmit(Admit admit);
	/**
	 * 通过管理员ID和密码查询管理员信息
	 * @param admit
	 * @return
	 */
	public boolean getAdmitByIdPsw(Admit admit);
}
