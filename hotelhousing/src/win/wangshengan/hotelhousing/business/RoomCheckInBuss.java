/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.RoomCheckIn;

/**
 * 房间预住业务层
 * @author AnJia
 *
 */
public interface RoomCheckInBuss {
	/**
	 * 添加房间预住信息
	 * @param roomci
	 * @return
	 */
	public boolean addRoomCheckIn(RoomCheckIn roomci);
	/**
	 * 修改房间预住信息
	 * @param roomci
	 * @return
	 */
	public boolean updateRoomCheckIn(RoomCheckIn roomci);
	/**
	 * 删除房间预住信息
	 * @param roomci
	 * @return
	 */
	public boolean delRoomCheckIn(String id);
	/**
	 * 查询所有房间预住信息
	 * @return
	 */
	public RoomCheckIn getselectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn);
	/**
	 * 通过客户身份证号查询房间预住信息
	 * @return
	 */
	public RoomCheckIn getAllRoomCheckInById(String id);
	/**
	 * 通过房间编号查询房间信息
	 * @param rno
	 * @return
	 */
	public RoomCheckIn getRoomCheckInByRno(int rno);
}
