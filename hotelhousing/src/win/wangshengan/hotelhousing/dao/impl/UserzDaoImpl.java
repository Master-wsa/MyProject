package win.wangshengan.hotelhousing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import win.wangshengan.hotelhousing.dao.UserzDao;
import win.wangshengan.hotelhousing.entity.Userz;
import win.wangshengan.hotelhousing.util.JdbcUtil;

/**
 * 客户Dao实现类
 * @author AnJia
 *
 */
public class UserzDaoImpl implements UserzDao {

	Connection conn = null;
	PreparedStatement ps = null;
	/**
	 * 插入客户信息
	 */
	@Override
	public int insertUserz(Userz userz) {
		// TODO Auto-generated method stub
		String sql = "insert into Userz(uname,userid,uphone,upsw) values(?,?,?,?)";
		
		conn = JdbcUtil.getConnection();
		int i = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userz.getUname());
			ps.setString(2,userz.getUserid());
			ps.setLong(3,userz.getUphone());
			ps.setString(4, userz.getUpsw());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return i;
		}
	}

	/**
	 * 根据客户身份证号码修改客户信息
	 */
	@Override
	public int updateUserz(Userz userz) {
		// TODO Auto-generated method stub
		String sq = "update Userz set uname=?,uphone=?,upsw=? where userid=?";
		StringBuffer sql = new StringBuffer(sq);
		conn = JdbcUtil.getConnection();
		if(userz.getUvip() != -1){
			sql.append(" and uvip="+userz.getUvip());
		}
		int i = 0;
		try {
			ps = conn.prepareStatement(sql+"");
			ps.setString(1, userz.getUname());
			ps.setLong(2, userz.getUphone());
			ps.setString(3, userz.getUpsw());
			ps.setString(4, userz.getUserid());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return i;
		}
	}

	/**
	 * 删除客户信息
	 */
	@Override
	public int deleteUserz(Userz userz) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 查询所有客户信息
	 */
	@Override
	public List<Userz> selectAllUserz() {
		// TODO Auto-generated method stub
		List<Userz> lu = new ArrayList<Userz>();
		String sql = "select uname,userid,uphone,upsw from userz";
		conn = JdbcUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Userz user = new Userz();
				user.setUname(rs.getString("uname"));
				user.setUserid(rs.getString("userid"));
				user.setUphone(Long.valueOf(rs.getString("uphone")));
				user.setUpsw(rs.getString("upsw"));
				lu.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return lu;
		}
	}

	/**
	 * 通过客户身份证号查询客户信息
	 */
	@Override
	public Userz selectUserzById(String id) {
		// TODO Auto-generated method stub
		String sql = "select uname,userid,uphone,upsw,uvip from userz where userid=?";
		conn = JdbcUtil.getConnection();
		Userz user = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				user = new Userz();
				user.setUname(rs.getString("uname"));
				user.setUserid(rs.getString("userid"));
				user.setUphone(rs.getLong("uphone"));
				user.setUpsw(rs.getString("upsw"));
				user.setUvip(rs.getInt("uvip"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return user;
		}
	}

	@Override
	public Userz selectUserzByIdPsw(Userz userz) {
		// TODO Auto-generated method stub
		String sql = "select uname,userid,uphone,upsw from userz where userid=? and upsw=?";
		conn = JdbcUtil.getConnection();
		Userz user = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userz.getUserid());
			ps.setString(2,userz.getUpsw());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				user = new Userz();
				user.setUname(rs.getString("uname"));
				user.setUserid(rs.getString("userid"));
				user.setUphone(Long.valueOf(rs.getString("uphone")));
				user.setUpsw(rs.getString("upsw"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.close(ps, conn);
			return user;
		}
	}


}
