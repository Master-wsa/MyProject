/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Turnover;

/**
 * 公司营业额业务层
 * @author AnJia
 *
 */
public interface TurnoverBuss {
	/**
	 * 添加营业额
	 * @param turnover
	 * @return
	 */
	public boolean addTurnover(Turnover turnover);
	/**
	 * 修改营业额
	 * @param turnover
	 * @return
	 */
	public boolean updateTurnover(Turnover turnover);
	/**
	 * 删除营业额
	 * @param turnover
	 * @return
	 */
	public int delTurnover(Turnover turnover);
	/**
	 * 查询所有营业额
	 * @param turnover
	 * @return
	 */
	public List<Turnover> getAllTurnover(Turnover turnover);
	/**
	 * 查询营业额
	 * @param turnover
	 * @return
	 */
	public Turnover getTurnover(Turnover turnover);
}
