/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

/**
 * 客户信息实体类
 * @author AnJia
 *
 */
public class Userz {
	private String uname;
	private String userid;
	private long uphone;
	private String upsw;
	private int uvip = -1;
	
	public Userz() {
		super();
	}

	/**
	 * @param userid
	 * @param upsw
	 */
	public Userz(String userid, String upsw) {
		super();
		this.userid = userid;
		this.upsw = upsw;
	}

	/**
	 * Userz实体类的有参构造方法
	 * @param uname
	 * @param userid
	 * @param uphone
	 * @param upsw
	 */
	public Userz(String uname, String userid, long uphone, String upsw) {
		super();
		this.uname = uname;
		this.userid = userid;
		this.uphone = uphone;
		this.upsw = upsw;
	}
	

	/**
	 * @param uname
	 * @param userid
	 * @param uphone
	 * @param upsw
	 * @param uvip
	 */
	public Userz(String uname, String userid, long uphone, String upsw, int uvip) {
		super();
		this.uname = uname;
		this.userid = userid;
		this.uphone = uphone;
		this.upsw = upsw;
		this.uvip = uvip;
	}

	/**
	 * 获得客户姓名
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * 设置客户姓名
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * 获得客户姓名
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置客户姓名
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获得客户电话号码
	 * @return the uphone
	 */
	public long getUphone() {
		return uphone;
	}

	/**
	 * 设置客户电话号码
	 * @param uphone the uphone to set
	 */
	public void setUphone(long uphone) {
		this.uphone = uphone;
	}

	/**
	 * 获得客户密码
	 * @return the upsw
	 */
	public String getUpsw() {
		return upsw;
	}

	/**
	 * 设置客户密码
	 * @param upsw the upsw to set
	 */
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}

	/**
	 * 获得客户是否为VIP客户
	 * @return the uvip
	 */
	public int getUvip() {
		return uvip;
	}

	/**
	 * 设置客户为VIP客户
	 * @param uvip the uvip to set
	 */
	public void setUvip(int uvip) {
		this.uvip = uvip;
	}
	
	
	
}
