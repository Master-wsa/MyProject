package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import win.wangshengan.hotelhousing.dao.CountsDao;
import win.wangshengan.hotelhousing.entity.Counts;
import win.wangshengan.hotelhousing.util.JdbcUtil;

/**
 * 结算Dao实现类
 * @author AnJia
 *
 */
public class CountsDaoImpl implements CountsDao {

	Connection conn = null;
	PreparedStatement ps = null;
	@Override
	public int insertCount(Counts counts) {
		// TODO Auto-generated method stub
		String sql = "insert into counts values(?,?,?,?,?)";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, counts.getUname());
			ps.setString(2, counts.getUserid());
			ps.setInt(3, counts.getPaid());
			ps.setInt(4, counts.getTodayConsume());
			ps.setInt(5, counts.getTotalConsume());
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
	public int updateCount(Counts counts) {
		// TODO Auto-generated method stub
		String sql = "update counts set paid=? where userid=?";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, counts.getPaid());
			ps.setString(2, counts.getUserid());
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
	public int deleteCount(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from counts where userid=?";
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
	public List<Counts> selectAllCounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counts selectCount(Counts counts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counts selectCountById(String id) {
		// TODO Auto-generated method stub
		String sql = "select uname,userid,paid,todayconsume,totalconsume from counts where userid=?";
		conn = JdbcUtil.getConnection();
		Counts counts = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				counts = new Counts();
				counts.setUname(rs.getString("uname"));
				counts.setUserid(rs.getString("userid"));
				counts.setPaid(rs.getInt("paid"));
				counts.setTodayConsume(rs.getInt("todayconsume"));
				counts.setTotalConsume(rs.getInt("totalconsume"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return counts;
		}
	}

}
