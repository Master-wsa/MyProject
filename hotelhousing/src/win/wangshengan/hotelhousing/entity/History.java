/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * ��ʷ��¼ʵ����
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
	 * ��ʷ��¼���вι���
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
	 * ��ȡ����ʱ��
	 * @return the operaDate
	 */
	public Date getOperaDate() {
		return operaDate;
	}

	/**
	 * ���ò���ʱ��
	 * @param operaDate the operaDate to set
	 */
	public void setOperaDate(Date operaDate) {
		this.operaDate = operaDate;
	}
	

	/**
	 * ��ù���Ա���
	 * @return the admin
	 */
	public int getAdmin() {
		return admin;
	}

	/**
	 * ���ù���Ա���
	 * @param admin the admin to set
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
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
	 * ��ÿͻ���סʱ��
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * ���ÿͻ���סʱ��
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * ��ÿͻ��˷�ʱ��
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * ���ÿͻ��˷�ʱ��
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
