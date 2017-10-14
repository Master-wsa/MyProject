package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.HistoryDao;
import win.wangshengan.hotelhousing.entity.History;
import win.wangshengan.hotelhousing.util.JdbcUtil;

public class HistoryDaoImpl implements HistoryDao {

	Connection conn = null;
	PreparedStatement ps = null;
	@Override
	public int insertHistory(History history) {
		// TODO Auto-generated method stub
		String sql = "insert into history values(?,?,?,?,?,?,?)";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, history.getRno());
			ps.setString(2, history.getUname());
			ps.setString(3, history.getUserid());
			ps.setDate(4, history.getBeginTime());
			ps.setDate(5, history.getEndTime());
			ps.setDate(6, history.getOperaDate());
			ps.setInt(7, history.getAdmin());
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
	public int updateHistory(History history) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteHistory(History history) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<History> selectAllHistoryByCondition(History history) {
		// TODO Auto-generated method stub
		List<History> lh = new ArrayList<History>();
		String sq = "select rno,uname,userid,begintime,endtime,operadate,admin from history where 1=1";
		StringBuffer sql = new StringBuffer(sq);
		conn = JdbcUtil.getConnection();
		Date date = new Date(1);
		if(history.getRno() != -1){
			sql.append(" and rno="+history.getRno());
		}
		if(!"".equals(history.getUname())){
			sql.append(" and uname='"+history.getUname()+"'");
		}
		if(!"".equals(history.getUserid())){
			sql.append(" and userid='"+history.getUserid()+"'");
		}
		if(!history.getBeginTime().equals(date)){
			sql.append(" and begintime='"+history.getBeginTime()+"'");
		}
		if(!history.getEndTime().equals(date)){
			sql.append(" and endtime='"+history.getEndTime()+"'");
		}
		try {
			ps = conn.prepareStatement(sql+"");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				History his = new History();
				his.setRno(rs.getInt("rno"));
				his.setUname(rs.getString("uname"));
				his.setUserid(rs.getString("userid"));
				his.setBeginTime(rs.getDate("begintime"));
				his.setEndTime(rs.getDate("endtime"));
				his.setOperaDate(rs.getDate("operadate"));
				his.setAdmin(rs.getInt("admin"));
				lh.add(his);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return lh;
		}
	}

}
