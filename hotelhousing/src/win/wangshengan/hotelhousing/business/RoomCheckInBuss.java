/**
 * 
 */
package win.wangshengan.hotelhousing.business;

import java.util.List;

import win.wangshengan.hotelhousing.entity.RoomCheckIn;

/**
 * ����Ԥסҵ���
 * @author AnJia
 *
 */
public interface RoomCheckInBuss {
	/**
	 * ��ӷ���Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public boolean addRoomCheckIn(RoomCheckIn roomci);
	/**
	 * �޸ķ���Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public boolean updateRoomCheckIn(RoomCheckIn roomci);
	/**
	 * ɾ������Ԥס��Ϣ
	 * @param roomci
	 * @return
	 */
	public boolean delRoomCheckIn(String id);
	/**
	 * ��ѯ���з���Ԥס��Ϣ
	 * @return
	 */
	public RoomCheckIn getselectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn);
	/**
	 * ͨ���ͻ����֤�Ų�ѯ����Ԥס��Ϣ
	 * @return
	 */
	public RoomCheckIn getAllRoomCheckInById(String id);
	/**
	 * ͨ�������Ų�ѯ������Ϣ
	 * @param rno
	 * @return
	 */
	public RoomCheckIn getRoomCheckInByRno(int rno);
}
