package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.RoomBuss;
import win.wangshengan.hotelhousing.dao.RoomDao;
import win.wangshengan.hotelhousing.dao.impl.RoomDaoImpl;
import win.wangshengan.hotelhousing.entity.Rooms;

public class RoomBussImpl implements RoomBuss {

	RoomDao roomDao = new RoomDaoImpl();
	@Override
	public int addRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		int i = roomDao.updateRoom(rooms);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public int delRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Rooms getRoomsById(int rno) {
		// TODO Auto-generated method stub
		return roomDao.selectRoomsById(rno);
	}

	@Override
	public List<Rooms> getAllRoomsByCondition(Rooms rooms) {
		// TODO Auto-generated method stub
		return roomDao.selectAllRoomsByCondition(rooms);
	}

	@Override
	public List<String> getRoomRtype() {
		// TODO Auto-generated method stub
		return roomDao.selectRoomRtype();
	}

	@Override
	public List<String> getRoomRState() {
		// TODO Auto-generated method stub
		return roomDao.selectRoomRState();
	}

	@Override
	public List<Integer> getRoomRvalue() {
		// TODO Auto-generated method stub
		return roomDao.selectRoomRvalue();
	}

	

}
