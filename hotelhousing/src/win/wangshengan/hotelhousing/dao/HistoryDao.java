/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.History;

/**
 * ��ʷ��¼���ݷ��ʲ�
 * @author AnJia
 *
 */
public interface HistoryDao {
	/**
	 * �����ʷ��¼��Ϣ
	 * @param history
	 * @return
	 */
	public int insertHistory(History history);
	/**
	 * �޸���ʷ��¼��Ϣ
	 * @param history
	 * @return
	 */
	public int updateHistory(History history);
	/**
	 * ɾ����ʷ��¼��Ϣ
	 * @param history
	 * @return
	 */
	public int deleteHistory(History history);
	/**
	 * ��ѯ������ʷ��¼
	 * @return
	 */
	public List<History> selectAllHistoryByCondition(History history);
}
