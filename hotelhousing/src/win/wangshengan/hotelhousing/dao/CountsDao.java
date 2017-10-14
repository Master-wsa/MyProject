/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Counts;

/**
 * ����Dao�ӿ�
 * @author AnJia
 *
 */
public interface CountsDao {

	/**
	 * ��ӽ�������
	 * @param counts
	 * @return
	 */
	public int insertCount(Counts counts);
	/**
	 * �޸Ľ�������
	 * @param counts
	 * @return
	 */
	public int updateCount(Counts counts);
	/**
	 * ɾ����������
	 * @param counts
	 * @return
	 */
	public int deleteCount(String id);
	/**
	 * ��ѯ���Խ�������
	 * @return
	 */
	public List<Counts> selectAllCounts();
	/**
	 * ��ѯ������������
	 * @param counts
	 * @return
	 */
	public Counts selectCount(Counts counts);
	/**
	 * ͨ��ID��ѯ��������
	 * @param id
	 * @return
	 */
	public Counts selectCountById(String id);
}
