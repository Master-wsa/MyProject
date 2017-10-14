/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.History;

/**
 * 历史记录业务层
 * @author AnJia
 *
 */
public interface HistoryBuss {
	/**
	 * 添加历史记录信息
	 * @param history
	 * @return
	 */
	public boolean addHistory(History history);
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
	public int delHistory(History history);
	/**
	 * 查询所有历史记录信息
	 * @return
	 */
	public List<History> getAllHistoryByCondition(History history);
	
}
