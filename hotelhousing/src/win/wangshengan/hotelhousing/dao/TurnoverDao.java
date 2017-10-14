/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Turnover;

/**
 * 公司营业额dao层
 * @author AnJia
 *
 */
public interface TurnoverDao {

	/**
	 * 添加营业额
	 * @param turnover
	 * @return
	 */
	public int insertTurnover(Turnover turnover);
	/**
	 * 修改营业额
	 * @param turnover
	 * @return
	 */
	public int updateTurnover(Turnover turnover);
	/**
	 * 删除营业额
	 * @param turnover
	 * @return
	 */
	public int deleteTurnover(Turnover turnover);
	/**
	 * 查询所有营业额
	 * @param turnover
	 * @return
	 */
	public List<Turnover> selectAllTurnover(Turnover turnover);
	/**
	 * 查询营业额
	 * @param turnover
	 * @return
	 */
	public Turnover selectTurnover(Turnover turnover);
}
