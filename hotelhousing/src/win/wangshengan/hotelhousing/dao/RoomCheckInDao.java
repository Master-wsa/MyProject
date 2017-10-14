/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.RoomCheckIn;

/**
 * 房间预住接口
 * @author AnJia
 *
 */
public interface RoomCheckInDao {

	/**
	 * 添加房间预住信息
	 * @param roomci
	 * @return
	 */
	public int insertRoomCheckIn(RoomCheckIn roomci);
	/**
	 * 修改房间预住信息
	 * @param roomci
	 * @return
	 */
	public int updateRoomCheckIn(RoomCheckIn roomci);
	/**
	 * 删除房间预住信息
	 * @param roomci
	 * @return
	 */
	public int deleteRoomCheckIn(String id);
	/**
	 * 查询所有房间预住信息
	 * @return
	 */
	public RoomCheckIn selectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn);
	/**
	 * 通过客户身份证号查询房间预住信息
	 * @return
	 */
	public RoomCheckIn selectAllRoomCheckInById(String id);
	/**
	 * 通过房间编号查询房间信息
	 * @param rno
	 * @return
	 */
	public RoomCheckIn selectRoomCheckInByRno(int rno);
}
