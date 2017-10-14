/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * 历史记录实体类
 * @author AnJia
 *
 */
public class History {
	private int rno;
	private String uname;
	private String userid;
	private Date beginTime;
	private Date endTime;
	private Date operaDate;
	private int admin;
	/**
	 * 
	 */
	public History() {
		super();
	}

	/**
	 * 历史记录表有参构造
	 * @param rno
	 * @param uname
	 * @param userid
	 * @param beginTime
	 * @param endTime
	 */
	public History(int rno, String uname, String userid, Date beginTime,
			Date endTime, Date operaDate ,int admin) {
		super();
		this.rno = rno;
		this.uname = uname;
		this.userid = userid;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.operaDate = operaDate;
		this.admin = admin;
	}


	/**
	 * 获取操作时间
	 * @return the operaDate
	 */
	public Date getOperaDate() {
		return operaDate;
	}

	/**
	 * 设置操作时间
	 * @param operaDate the operaDate to set
	 */
	public void setOperaDate(Date operaDate) {
		this.operaDate = operaDate;
	}
	

	/**
	 * 获得管理员编号
	 * @return the admin
	 */
	public int getAdmin() {
		return admin;
	}

	/**
	 * 设置管理员编号
	 * @param admin the admin to set
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
	}

	/**
	 * 获得房间编号
	 * @return the rno
	 */
	public int getRno() {
		return rno;
	}

	/**
	 * 设置房间编号
	 * @param rno the rno to set
	 */
	public void setRno(int rno) {
		this.rno = rno;
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
	 * 获得客户身份证号
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置客户身份证号
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获得客户入住时间
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * 设置客户入住时间
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * 获得客户退房时间
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置客户退房时间
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
