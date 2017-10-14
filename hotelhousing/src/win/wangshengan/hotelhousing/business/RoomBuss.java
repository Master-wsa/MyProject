package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Rooms;

public interface RoomBuss {
	/**
	 * 添加房间信息
	 * @param rooms
	 * @return
	 */
	public int addRoom(Rooms rooms);
	/**
	 * 修改房间信息
	 * @param rooms
	 * @return
	 */
	public boolean updateRoom(Rooms rooms);
	/**
	 * 删除房间信息
	 * @param rooms
	 * @return
	 */
	public int delRoom(Rooms rooms);
	/**
	 * 通过房间号rno查询房间信息
	 * @param id
	 * @return
	 */
	public Rooms getRoomsById(int rno);
	/**
	 * 查询所有房间信息
	 * @return
	 */
	
	public List<Rooms> getAllRoomsByCondition(Rooms rooms);
	/**
	 * 查询房间型号信息
	 * @return
	 */
	public List<String> getRoomRtype();
	/**
	 * 查询房间类型
	 * @return
	 */
	public List<String> getRoomRState();
	/**
	 * 查询房间价格
	 * @return
	 */
	public List<Integer> getRoomRvalue();
}
