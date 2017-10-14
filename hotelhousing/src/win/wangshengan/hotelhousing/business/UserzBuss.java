/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Userz;

/**
 * �ͻ�ҵ��Business�ӿ�
 * @author AnJia
 *
 */
public interface UserzBuss {

	/**
	 * ��ѯ�ͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public boolean addUserz(Userz userz);
	/**
	 * �޸Ŀͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public boolean updateUserz(Userz userz);
	/**
	 * ɾ���ͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public boolean delUserz(Userz userz);
	/**
	 * ��ѯ���Կͻ���Ϣ
	 * @return
	 */
	public List<Userz> getAllUserz();
	/**
	 * ��ѯ�ͻ�������Ϣ
	 * @return
	 */
	public Userz getUserzById(String id);
	/**
	 * ͨ��ID�������ѯ�ͻ���Ϣ
	 * @param userz
	 * @return
	 */
	public boolean getUserzByIdPsw(Userz userz);
}
