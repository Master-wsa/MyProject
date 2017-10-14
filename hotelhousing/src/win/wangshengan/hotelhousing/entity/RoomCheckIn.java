package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * ������סʵ����
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
	 * ������ס���вι���
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
	 * ��÷�����
	 * @return the rno
	 */
	public int getRno() {
		return rno;
	}


	/**
	 * ���÷�����
	 * @param rno the rno to set
	 */
	public void setRno(int rno) {
		this.rno = rno;
	}


	/**
	 * ��ÿͻ�����
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}


	/**
	 * ���ÿͻ�����
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}


	/**
	 * ��ÿͻ����֤��
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}


	/**
	 * ���ÿͻ����֤��
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}


	/**
	 * ����뷿ʱ��
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}


	/**
	 * �����뷿ʱ��
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}


	/**
	 * ����˷�ʱ��
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}


	/**
	 * �����˷�ʱ��
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	/**
	 * ���Ԥס״̬
	 * @return the bookState
	 */
	public int getBookState() {
		return bookState;
	}


	/**
	 * ����Ԥס״̬
	 * @param bookState the bookState to set
	 */
	public void setBookState(int bookState) {
		this.bookState = bookState;
	}
	
	/**
	 * ���Ԥס״̬
	 * @return the bookState
	 */
	public int getDepost() {
		return depost;
	}


	/**
	 * ����Ԥס״̬
	 * @param bookState the bookState to set
	 */
	public void setDepost(int depost) {
		this.depost = depost;
	}
	
}
