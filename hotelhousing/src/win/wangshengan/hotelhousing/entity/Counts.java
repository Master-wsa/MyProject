package win.wangshengan.hotelhousing.entity;

/**
 * �����ʵ��
 * @author AnJia
 *
 */
public class Counts {

	private String uname;
	private String userid;
	private int paid;
	private int todayConsume;
	private int totalConsume;
	
	/**
	 * 
	 */
	public Counts() {
		super();
	}

	/**
	 * ������вι���
	 * @param uname
	 * @param userid
	 * @param paid
	 * @param todayConsume
	 * @param totalConsume
	 */
	public Counts(String uname, String userid, int paid, int todayConsume,
			int totalConsume) {
		super();
		this.uname = uname;
		this.userid = userid;
		this.paid = paid;
		this.todayConsume = todayConsume;
		this.totalConsume = totalConsume;
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
	 * ��ÿͻ��Ѹ����
	 * @return the paid
	 */
	public int getPaid() {
		return paid;
	}

	/**
	 * ���ÿͻ��Ѹ����
	 * @param paid the paid to set
	 */
	public void setPaid(int paid) {
		this.paid = paid;
	}

	/**
	 * ��ÿͻ���������
	 * @return the todayConsume
	 */
	public int getTodayConsume() {
		return todayConsume;
	}

	/**
	 * ���ÿͻ���������
	 * @param todayConsume the todayConsume to set
	 */
	public void setTodayConsume(int todayConsume) {
		this.todayConsume = todayConsume;
	}

	/**
	 * ��ÿͻ��ܹ�����
	 * @return the totalConsume
	 */
	public int getTotalConsume() {
		return totalConsume;
	}

	/**
	 * ���ÿͻ��ܹ�����
	 * @param totalConsume the totalConsume to set
	 */
	public void setTotalConsume(int totalConsume) {
		this.totalConsume = totalConsume;
	}
	
	
}