package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.RoomBuss;
import win.wangshengan.hotelhousing.business.RoomCheckInBuss;
import win.wangshengan.hotelhousing.dao.RoomCheckInDao;
import win.wangshengan.hotelhousing.dao.RoomDao;
import win.wangshengan.hotelhousing.dao.impl.RoomCheckInDaoImpl;
import win.wangshengan.hotelhousing.entity.RoomCheckIn;

public class RoomCheckInBussImpl implements RoomCheckInBuss {

	RoomCheckInDao roomCheckInDao = new RoomCheckInDaoImpl();
	@Override
	public boolean addRoomCheckIn(RoomCheckIn roomci) {
		// TODO Auto-generated method stub
		int i = roomCheckInDao.insertRoomCheckIn(roomci);
		if(i>0)	return true;
		return false;
	}

	@Override
	public boolean updateRoomCheckIn(RoomCheckIn roomci) {
		// TODO Auto-generated method stub
		int i = roomCheckInDao.updateRoomCheckIn(roomci);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public boolean delRoomCheckIn(String id) {
		// TODO Auto-generated method stub
		int i = roomCheckInDao.deleteRoomCheckIn(id);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public RoomCheckIn getselectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn) {
		// TODO Auto-generated method stub
		return roomCheckInDao.selectAllRoomCheckInByCondition(roomCheckIn);
	}

	@Override
	public RoomCheckIn getAllRoomCheckInById(String id) {
		// TODO Auto-generated method stub
		return roomCheckInDao.selectAllRoomCheckInById(id);
	}

	@Override
	public RoomCheckIn getRoomCheckInByRno(int rno) {
		// TODO Auto-generated method stub
		return roomCheckInDao.selectRoomCheckInByRno(rno);
	}

}
