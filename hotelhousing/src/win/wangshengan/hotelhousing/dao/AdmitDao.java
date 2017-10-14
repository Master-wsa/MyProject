package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Admit;

public interface AdmitDao {

	/**
	 * ��ӹ���Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public int insertAdmit(Admit admit);
	/**
	 * �޸Ĺ���Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public int updateAdmit(Admit admit);
	/**
	 * ɾ������Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public int deleteAdmit(Admit admit);
	/**
	 * ��ѯ���й���Ա��Ϣ
	 * @return
	 */
	public List<Admit> selectAllAdmits();
	/**
	 * ��ѯ��������Ա��Ϣ
	 * @param admit
	 * @return
	 */
	public Admit selectAdmit(Admit admit);
	/**
	 * ����ID�������ѯ
	 * @param admit
	 * @return
	 */
	public Admit selectAdmitByIdPsw(Admit admit);
}
