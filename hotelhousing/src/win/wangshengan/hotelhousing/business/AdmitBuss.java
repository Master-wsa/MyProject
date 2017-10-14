package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Admit;

/**
 * ����Աҵ��ӿ�
 * @author AnJia
 *
 */
public interface AdmitBuss {
	/**
	 * ��ӹ���Ա��Ϣ
	 * @return
	 */
	public int addAdmit();
	/**
	 * �޸Ĺ���Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public boolean updateAdmit(Admit admit);
	/**
	 * ɾ������Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public int delAdmit(Admit admit);
	/**
	 * ��ѯ���й���Ա��Ϣ
	 * @return
	 */
	public List<Admit> getAllAdmits();
	/**
	 * ��ѯ��������Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public Admit getAdmit(Admit admit);
	/**
	 * ͨ������ԱID�������ѯ����Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public boolean getAdmitByIdPsw(Admit admit);
}
