package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.AdmitDao;
import win.wangshengan.hotelhousing.entity.Admit;
import win.wangshengan.hotelhousing.util.JdbcUtil;

public class AdmitDaoImpl implements AdmitDao {
	Connection conn;
	PreparedStatement ps;
	@Override
	public int insertAdmit(Admit admit) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateAdmit(Admit admit) {
		// TODO Auto-generated method stub
		String sql = "update admits set adpsw=? where admitid=?";
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, admit.getAdpsw());
			ps.setInt(2, admit.getAdmitId());
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
	public int deleteAdmit(Admit admit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admit> selectAllAdmits() {
		// TODO Auto-generated method stub
		List<Admit> la = new ArrayList<Admit>();
		String sql = "select admitid,adpsw from Admits";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Admit admit = new Admit();
				admit.setAdmitId(rs.getInt("admitid"));
				admit.setAdpsw(rs.getString("adpsw"));
				la.add(admit);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return la;
		}
	}

	@Override
	public Admit selectAdmit(Admit admit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Admit selectAdmitByIdPsw(Admit admit){
		String sql = "select admitid,adpsw from Admits where admitid=? and adpsw=?";
		Connection conn = null;
		PreparedStatement ps = null;
		Admit ad = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,admit.getAdmitId());
			ps.setString(2, admit.getAdpsw());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ad = new Admit();
				ad.setAdmitId(rs.getInt(1));
				ad.setAdpsw(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return ad;
		}
	}

}
