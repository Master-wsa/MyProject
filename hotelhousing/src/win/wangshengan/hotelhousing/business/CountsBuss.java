/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Counts;

/**
 * 结算表业务接口
 * @author AnJia
 *
 */
public interface CountsBuss {
	/**
	 * 添加结算数据
	 * @param counts
	 * @return
	 */
	public boolean addCount(Counts counts);
	/**
	 * 修改结算数据
	 * @param counts
	 * @return
	 */
	public boolean updateCount(Counts counts);
	/**
	 * 删除结算数据
	 * @param counts
	 * @return
	 */
	public boolean delCount(String id);
	/**
	 * 查询所以结算数据
	 * @return
	 */
	public List<Counts> getAllCounts();
	/**
	 * 查询单个结算数据
	 * @param counts
	 * @return
	 */
	public Counts getCount(Counts counts);
	/**
	 * 通过ID查询结算数据
	 * @param id
	 * @return
	 */
	public Counts getCountById(String id);
}
