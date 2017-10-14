package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.TurnoverDao;
import win.wangshengan.hotelhousing.entity.Turnover;
import win.wangshengan.hotelhousing.util.JdbcUtil;

public class TurnoverDaoImpl implements TurnoverDao {
	Connection conn = null;
	PreparedStatement ps = null;
	@Override
	public int insertTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		String sql = "insert into turnover values(?,?)";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setDate(1, Date.valueOf(turnover.getEndTime()));
			ps.setInt(2, turnover.getTotalMoney());
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
	public int updateTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		String sql = "update turnover set everydayturnover=? where tdate=?";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setDate(2, Date.valueOf(turnover.getEndTime()));
			ps.setInt(1, turnover.getTotalMoney());
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
	public int deleteTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Turnover> selectAllTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		conn = JdbcUtil.getConnection();
		String sq = "select tdate,everydayturnover from turnover where 1=1";
		StringBuffer sql = new StringBuffer(sq);
		if(!"".equals(turnover.getEndTime())){
			sql.append(" and to_char(tdate,'yyyy-MM-dd') like '%"+turnover.getEndTime()+"%'");
		}
		sql.append(" order by tdate desc");
		List<Turnover> lt = new ArrayList<Turnover>();
		try {
			ps = conn.prepareStatement(sql+"");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Turnover turn = new Turnover();
				turn.setEndTime(rs.getString("tdate"));
				turn.setTotalMoney(rs.getInt("everydayturnover"));
				lt.add(turn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return lt;
		}
	}

	@Override
	public Turnover selectTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		conn = JdbcUtil.getConnection();
		Turnover turn = null;
		String sq = "select tdate,everydayturnover from turnover where 1=1";
		StringBuffer sql = new StringBuffer(sq);
		if(!"".equals(turnover.getEndTime())){
			sql.append(" and to_char(tdate,'yyyy-MM-dd') like '%"+turnover.getEndTime()+"%'");
		}
		sql.append(" order by tdate desc");
		try {
			ps = conn.prepareStatement(sql+"");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				turn = new Turnover();
				turn.setEndTime(rs.getString("tdate"));
				turn.setTotalMoney(rs.getInt("everydayturnover"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return turn;
		}
	}

}
