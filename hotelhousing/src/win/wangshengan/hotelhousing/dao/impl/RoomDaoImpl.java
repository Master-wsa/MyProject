package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.RoomDao;
import win.wangshengan.hotelhousing.entity.Rooms;
import win.wangshengan.hotelhousing.util.JdbcUtil;

public class RoomDaoImpl implements RoomDao {

	Connection conn = null;
	PreparedStatement ps = null;
	@Override
	public int insertRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		String sql = "update rooms set rstate=? where rno=?";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, rooms.getRstate());
			ps.setInt(2, rooms.getRno());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return i;
		}
	}

	@Override
	public int deleteRoom(Rooms rooms) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Rooms selectRoomsById(int rno) {
		// TODO Auto-generated method stub
		String sql = "select r.rno,r.rtype,r.rstate,rt.rconfigure,rt.rvalue from rooms r left outer join roomtype rt on r.rtype=rt.rtype where r.rno=?";
		conn = JdbcUtil.getConnection();
		Rooms rooms = new Rooms();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rno);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				rooms.setRno(rs.getInt("rno"));
				rooms.setRtype(rs.getString("rtype"));
				rooms.setRstate(rs.getString("rstate"));
				rooms.setRconfigue(rs.getString("rconfigure"));
				rooms.setRvalue(rs.getInt("rvalue"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return rooms;
		}
	}

	@Override
	public List<Rooms> selectAllRoomsByCondition(Rooms rooms) {
		// TODO Auto-generated method stub
		String sq = "select r.rno,r.rtype,r.rstate,rt.rconfigure,rt.rvalue from rooms r left outer join roomtype rt on r.rtype=rt.rtype where 1=1";
		StringBuffer sql = new StringBuffer(sq);
		List<Rooms> lr = new ArrayList<Rooms>();
		conn = JdbcUtil.getConnection();
		if(rooms.getRno() != -1){
			sql.append(" and r.rno="+rooms.getRno());
		}
		if(!"«Î—°‘Ò".equals(rooms.getRtype())){
			sql.append(" and r.rtype='"+rooms.getRtype()+"'");
		}
		if(!"«Î—°‘Ò".equals(rooms.getRstate())){
			sql.append(" and r.rstate='"+rooms.getRstate()+"'");
		}
		if(rooms.getRvalue() != -1){
			sql.append(" and rt.rvalue="+rooms.getRvalue());
		}
		try {
			ps = conn.prepareStatement(sql+"");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Rooms room = new Rooms();
				room.setRno(rs.getInt("rno"));
				room.setRtype(rs.getString("rtype"));
				room.setRstate(rs.getString("rstate"));
				room.setRconfigue(rs.getString("rconfigure"));
				room.setRvalue(rs.getInt("rvalue"));
				lr.add(room);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return lr;
		}
	}

	@Override
	public List<String> selectRoomRtype() {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		String sql = "select distinct rtype from rooms order by rtype";
		conn = JdbcUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String type = rs.getString("rtype");
				ls.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return ls;
		}
	}

	@Override
	public List<String> selectRoomRState() {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		String sql = "select distinct rstate from rooms order by rstate";
		conn = JdbcUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String state = rs.getString("rstate");
				ls.add(state);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return ls;
		}
	}

	@Override
	public List<Integer> selectRoomRvalue() {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		String sql = "select distinct rvalue from roomtype order by rvalue";
		conn = JdbcUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int value = rs.getInt("rvalue");
				li.add(value);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return li;
		}
	}

	

}
