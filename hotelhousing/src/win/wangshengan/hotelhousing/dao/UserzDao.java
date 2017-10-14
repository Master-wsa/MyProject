package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Userz;

public interface UserzDao {

	/**
	 * ��ѯ�ͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public int insertUserz(Userz userz);
	/**
	 * �޸Ŀͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public int updateUserz(Userz userz);
	/**
	 * ɾ���ͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public int deleteUserz(Userz userz);
	/**
	 * ��ѯ���Կͻ���Ϣ
	 * @return
	 */
	public List<Userz> selectAllUserz();
	/**
	 * ��ѯ�ͻ�������Ϣ
	 * @return
	 */
	public Userz selectUserzById(String id);
	/**
	 * ͨ���ͻ����֤�ź������ѯ
	 * @param userz
	 * @return
	 */
	public Userz selectUserzByIdPsw(Userz userz);
}
