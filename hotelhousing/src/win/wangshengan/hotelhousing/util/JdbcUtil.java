package win.wangshengan.hotelhousing.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * jdbc工具类
 * @author AnJia
 *
 */
public class JdbcUtil {
	static String url = "jdbc:oracle:thin:@47.94.13.2:1521:orcl";
	static String user = "scott";
	static String password = "wang";
	/**
	 * 加载驱动
	 */
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库的连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			return conn;
		}
	}
	
	/**
	 * 关闭流
	 * @param ps
	 * @param conn
	 */
	public static void close(PreparedStatement ps,Connection conn){
		try {
			if(ps != null){
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
