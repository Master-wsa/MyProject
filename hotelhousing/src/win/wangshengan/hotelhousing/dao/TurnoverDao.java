/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Turnover;

/**
 * ��˾Ӫҵ��dao��
 * @author AnJia
 *
 */
public interface TurnoverDao {

	/**
	 * ���Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public int insertTurnover(Turnover turnover);
	/**
	 * �޸�Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public int updateTurnover(Turnover turnover);
	/**
	 * ɾ��Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public int deleteTurnover(Turnover turnover);
	/**
	 * ��ѯ����Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public List<Turnover> selectAllTurnover(Turnover turnover);
	/**
	 * ��ѯӪҵ��
	 * @param turnover
	 * @return
	 */
	public Turnover selectTurnover(Turnover turnover);
}
