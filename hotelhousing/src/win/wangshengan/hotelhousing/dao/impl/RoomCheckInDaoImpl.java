package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.RoomCheckInDao;
import win.wangshengan.hotelhousing.entity.RoomCheckIn;
import win.wangshengan.hotelhousing.util.JdbcUtil;

/**
 * 房间预住信息Dao实体类
 * @author AnJia
 *
 */
public class RoomCheckInDaoImpl implements RoomCheckInDao {

	Connection conn = null;
	PreparedStatement ps = null;
	@Override
	public int insertRoomCheckIn(RoomCheckIn roomci) {
		// TODO Auto-generated method stub
		String sql = "insert into roomcheckin values(?,?,?,?,?,?,?)";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roomci.getRno());
			ps.setString(2,roomci.getUname());
			ps.setString(3, roomci.getUserid());
			ps.setDate(4,roomci.getBeginTime());
			ps.setDate(5, roomci.getEndTime());
			ps.setInt(6, roomci.getBookState());
			ps.setInt(7, roomci.getDepost());
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
	public int updateRoomCheckIn(RoomCheckIn roomci) {
		// TODO Auto-generated method stub
		conn = JdbcUtil.getConnection();
		String sq = "update roomCheckin set bookstate=?";
		StringBuffer sql = new StringBuffer(sq);
		if(roomci.getDepost() != -1){
			sql.append(",depost=" + roomci.getDepost());
		}
		if(!new Date(1).equals(roomci.getEndTime())){
			sql.append(",endtime=to_date('"+roomci.getEndTime()+"','yyyy-MM-dd')");
		}
		sql.append(" where userid=?");
		int i = 0;
		try {
			ps = conn.prepareStatement(sql+"");
			ps.setInt(1, roomci.getBookState());
			ps.setString(2, roomci.getUserid());
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
	public int deleteRoomCheckIn(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from roomcheckin where userid=?";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
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
	public RoomCheckIn selectAllRoomCheckInByCondition(RoomCheckIn roomCheckIn) {
		// TODO Auto-generated method stub
		String sq = "select rno,uname,userid,begintime,endtime,bookstate,depost from roomcheckin where 1=1";
		conn = JdbcUtil.getConnection();
		StringBuffer sql = new StringBuffer(sq);
		RoomCheckIn roomCheck = null;
		if(!"".equals(roomCheckIn.getUname())){
			sql.append(" and uname='"+roomCheckIn.getUname()+"'");
		}
		if(!"".equals(roomCheckIn.getUserid())){
			sql.append(" and userid='"+roomCheckIn.getUserid()+"'");
		}
		if(roomCheckIn.getRno() != -1){
			sql.append(" and rno="+roomCheckIn.getRno()+"'");
		}
		try {
			ps = conn.prepareStatement(sql+"");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				roomCheck = new RoomCheckIn();
				roomCheck.setRno(rs.getInt("rno"));
				roomCheck.setUname(rs.getString("uname"));
				roomCheck.setUserid(rs.getString("userid"));
				roomCheck.setBeginTime(rs.getDate("begintime"));
				roomCheck.setEndTime(rs.getDate("endtime"));
				roomCheck.setBookState(rs.getInt("bookstate"));
				roomCheck.setDepost(rs.getInt("depost"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return roomCheck;
		}
	}

	@Override
	public RoomCheckIn selectAllRoomCheckInById(String id) {
		// TODO Auto-generated method stub
		String sql = "select rno,uname,userid,begintime,endtime,bookstate,depost from roomcheckin where userid=?";
		conn = JdbcUtil.getConnection();
		RoomCheckIn roomCheckIn = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				roomCheckIn = new RoomCheckIn();
				roomCheckIn.setRno(rs.getInt("rno"));
				roomCheckIn.setUname(rs.getString("uname"));
				roomCheckIn.setUserid(rs.getString("userid"));
				roomCheckIn.setBeginTime(rs.getDate("begintime"));
				roomCheckIn.setEndTime(rs.getDate("endtime"));
				roomCheckIn.setBookState(rs.getInt("bookstate"));
				roomCheckIn.setDepost(rs.getInt("depost"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return roomCheckIn;
		}
	}

	@Override
	public RoomCheckIn selectRoomCheckInByRno(int rno) {
		// TODO Auto-generated method stub
		String sql = "select rno,uname,userid,begintime,endtime from roomcheckin where rno=?";
		conn = JdbcUtil.getConnection();
		RoomCheckIn roomCheckIn = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rno);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				roomCheckIn = new RoomCheckIn();
				roomCheckIn.setRno(rs.getInt("rno"));
				roomCheckIn.setUname(rs.getString("uname"));
				roomCheckIn.setUserid(rs.getString("userid"));
				roomCheckIn.setBeginTime(rs.getDate("begintime"));
				roomCheckIn.setEndTime(rs.getDate("endtime"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return roomCheckIn;
		}
	}

}
