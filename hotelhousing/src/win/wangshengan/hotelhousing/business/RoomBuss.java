package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.Rooms;

public interface RoomBuss {
	/**
	 * ��ӷ�����Ϣ
	 * @param rooms
	 * @return
	 */
	public int addRoom(Rooms rooms);
	/**
	 * �޸ķ�����Ϣ
	 * @param rooms
	 * @return
	 */
	public boolean updateRoom(Rooms rooms);
	/**
	 * ɾ��������Ϣ
	 * @param rooms
	 * @return
	 */
	public int delRoom(Rooms rooms);
	/**
	 * ͨ�������rno��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Rooms getRoomsById(int rno);
	/**
	 * ��ѯ���з�����Ϣ
	 * @return
	 */
	
	public List<Rooms> getAllRoomsByCondition(Rooms rooms);
	/**
	 * ��ѯ�����ͺ���Ϣ
	 * @return
	 */
	public List<String> getRoomRtype();
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<String> getRoomRState();
	/**
	 * ��ѯ����۸�
	 * @return
	 */
	public List<Integer> getRoomRvalue();
}
