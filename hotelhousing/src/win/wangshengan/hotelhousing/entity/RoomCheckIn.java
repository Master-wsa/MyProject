package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * 房间入住实体类
 * @author AnJia
 *
 */
public class RoomCheckIn {
	private int rno;
	private String uname;
	private String userid;
	private Date beginTime;
	private Date endTime;
	private int bookState;
	private int depost;
	
	/**
	 * 
	 */
	public RoomCheckIn() {
		super();
	}


	/**
	 * 房间入住类有参构造
	 * @param rno
	 * @param uname
	 * @param userid
	 * @param beginTime
	 * @param endTime
	 * @param bookState
	 */
	public RoomCheckIn(int rno, String uname, String userid, Date beginTime,
			Date endTime, int bookState, int depost) {
		super();
		this.rno = rno;
		this.uname = uname;
		this.userid = userid;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.bookState = bookState;
		this.depost = depost;
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
	 * 获得入房时间
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}


	/**
	 * 设置入房时间
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}


	/**
	 * 获得退房时间
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}


	/**
	 * 设置退房时间
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	/**
	 * 获得预住状态
	 * @return the bookState
	 */
	public int getBookState() {
		return bookState;
	}


	/**
	 * 设置预住状态
	 * @param bookState the bookState to set
	 */
	public void setBookState(int bookState) {
		this.bookState = bookState;
	}
	
	/**
	 * 获得预住状态
	 * @return the bookState
	 */
	public int getDepost() {
		return depost;
	}


	/**
	 * 设置预住状态
	 * @param bookState the bookState to set
	 */
	public void setDepost(int depost) {
		this.depost = depost;
	}
	
}
