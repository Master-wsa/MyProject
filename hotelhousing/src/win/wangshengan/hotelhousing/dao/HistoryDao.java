/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.History;

/**
 * 历史记录数据访问层
 * @author AnJia
 *
 */
public interface HistoryDao {
	/**
	 * 添加历史记录信息
	 * @param history
	 * @return
	 */
	public int insertHistory(History history);
	/**
	 * 修改历史记录信息
	 * @param history
	 * @return
	 */
	public int updateHistory(History history);
	/**
	 * 删除历史记录信息
	 * @param history
	 * @return
	 */
	public int deleteHistory(History history);
	/**
	 * 查询所有历史记录
	 * @return
	 */
	public List<History> selectAllHistoryByCondition(History history);
}
