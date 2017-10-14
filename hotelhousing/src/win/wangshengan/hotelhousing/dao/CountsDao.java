/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Counts;

/**
 * 结算Dao接口
 * @author AnJia
 *
 */
public interface CountsDao {

	/**
	 * 添加结算数据
	 * @param counts
	 * @return
	 */
	public int insertCount(Counts counts);
	/**
	 * 修改结算数据
	 * @param counts
	 * @return
	 */
	public int updateCount(Counts counts);
	/**
	 * 删除结算数据
	 * @param counts
	 * @return
	 */
	public int deleteCount(String id);
	/**
	 * 查询所以结算数据
	 * @return
	 */
	public List<Counts> selectAllCounts();
	/**
	 * 查询单个结算数据
	 * @param counts
	 * @return
	 */
	public Counts selectCount(Counts counts);
	/**
	 * 通过ID查询结算数据
	 * @param id
	 * @return
	 */
	public Counts selectCountById(String id);
}
