package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Rooms;

public interface RoomDao {

	/**
	 * ��ӷ�����Ϣ
	 * @param rooms
	 * @return
	 */
	public int insertRoom(Rooms rooms);
	/**
	 * �޸ķ�����Ϣ
	 * @param rooms
	 * @return
	 */
	public int updateRoom(Rooms rooms);
	/**
	 * ɾ��������Ϣ
	 * @param rooms
	 * @return
	 */
	public int deleteRoom(Rooms rooms);
	/**
	 * ͨ�������rno��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Rooms selectRoomsById(int rno);
	/**
	 * ��ѯ���з�����Ϣ
	 * @return
	 */
	public List<Rooms> selectAllRoomsByCondition(Rooms rooms);
	/**
	 * ��ѯ�����ͺ���Ϣ
	 * @return
	 */
	public List<String> selectRoomRtype();
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<String> selectRoomRState();
	/**
	 * ��ѯ����۸�
	 * @return
	 */
	public List<Integer> selectRoomRvalue();
}
