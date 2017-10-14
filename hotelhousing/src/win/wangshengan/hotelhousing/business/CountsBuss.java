/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Counts;

/**
 * �����ҵ��ӿ�
 * @author AnJia
 *
 */
public interface CountsBuss {
	/**
	 * ��ӽ�������
	 * @param counts
	 * @return
	 */
	public boolean addCount(Counts counts);
	/**
	 * �޸Ľ�������
	 * @param counts
	 * @return
	 */
	public boolean updateCount(Counts counts);
	/**
	 * ɾ����������
	 * @param counts
	 * @return
	 */
	public boolean delCount(String id);
	/**
	 * ��ѯ���Խ�������
	 * @return
	 */
	public List<Counts> getAllCounts();
	/**
	 * ��ѯ������������
	 * @param counts
	 * @return
	 */
	public Counts getCount(Counts counts);
	/**
	 * ͨ��ID��ѯ��������
	 * @param id
	 * @return
	 */
	public Counts getCountById(String id);
}
