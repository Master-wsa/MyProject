/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.History;

/**
 * ��ʷ��¼ҵ���
 * @author AnJia
 *
 */
public interface HistoryBuss {
	/**
	 * �����ʷ��¼��Ϣ
	 * @param history
	 * @return
	 */
	public boolean addHistory(History history);
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
	public int delHistory(History history);
	/**
	 * ��ѯ������ʷ��¼��Ϣ
	 * @return
	 */
	public List<History> getAllHistoryByCondition(History history);
	
}
