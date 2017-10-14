/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Turnover;

/**
 * ��˾Ӫҵ��ҵ���
 * @author AnJia
 *
 */
public interface TurnoverBuss {
	/**
	 * ���Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public boolean addTurnover(Turnover turnover);
	/**
	 * �޸�Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public boolean updateTurnover(Turnover turnover);
	/**
	 * ɾ��Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public int delTurnover(Turnover turnover);
	/**
	 * ��ѯ����Ӫҵ��
	 * @param turnover
	 * @return
	 */
	public List<Turnover> getAllTurnover(Turnover turnover);
	/**
	 * ��ѯӪҵ��
	 * @param turnover
	 * @return
	 */
	public Turnover getTurnover(Turnover turnover);
}
