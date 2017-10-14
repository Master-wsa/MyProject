/**
 * 
 */
package win.wangshengan.hotelhousing.dao;

import java.util.List;

import win.wangshengan.hotelhousing.entity.RoomCheckIn;

/**
 * ����Ԥס�ӿ�
 * @author AnJia
 *
 */
public interface RoomCheckInDao {

	/**
	 * ��ӷ���Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public int insertRoomCheckIn(RoomCheckIn roomci);
	/**
	 * �޸ķ���Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public int updateRoomCheckIn(RoomCheckIn roomci);
	/**
	 * ɾ������Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public int deleteRoomCheckIn(String id);
	/**
	 * ��ѯ���з���Ԥס��Ϣ
	 * @return
	 */
	public RoomCheckIn selectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn);
	/**
	 * ͨ���ͻ����֤�Ų�ѯ����Ԥס��Ϣ
	 * @return
	 */
	public RoomCheckIn selectAllRoomCheckInById(String id);
	/**
	 * ͨ�������Ų�ѯ������Ϣ
	 * @param rno
	 * @return
	 */
	public RoomCheckIn selectRoomCheckInByRno(int rno);
}
