package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Rooms;

public interface RoomDao {

	/**
	 * 添加房间信息
	 * @param rooms
	 * @return
	 */
	public int insertRoom(Rooms rooms);
	/**
	 * 修改房间信息
	 * @param rooms
	 * @return
	 */
	public int updateRoom(Rooms rooms);
	/**
	 * 删除房间信息
	 * @param rooms
	 * @return
	 */
	public int deleteRoom(Rooms rooms);
	/**
	 * 通过房间号rno查询房间信息
	 * @param id
	 * @return
	 */
	public Rooms selectRoomsById(int rno);
	/**
	 * 查询所有房间信息
	 * @return
	 */
	public List<Rooms> selectAllRoomsByCondition(Rooms rooms);
	/**
	 * 查询房间型号信息
	 * @return
	 */
	public List<String> selectRoomRtype();
	/**
	 * 查询房间类型
	 * @return
	 */
	public List<String> selectRoomRState();
	/**
	 * 查询房间价格
	 * @return
	 */
	public List<Integer> selectRoomRvalue();
}
