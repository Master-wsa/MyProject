package win.wangshengan.hotelhousing.entity;

/**
 * 结算表实体
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
	 * 结算表有参构造
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
	 * 获得客户已付金额
	 * @return the paid
	 */
	public int getPaid() {
		return paid;
	}

	/**
	 * 设置客户已付金额
	 * @param paid the paid to set
	 */
	public void setPaid(int paid) {
		this.paid = paid;
	}

	/**
	 * 获得客户今日消费
	 * @return the todayConsume
	 */
	public int getTodayConsume() {
		return todayConsume;
	}

	/**
	 * 设置客户今日消费
	 * @param todayConsume the todayConsume to set
	 */
	public void setTodayConsume(int todayConsume) {
		this.todayConsume = todayConsume;
	}

	/**
	 * 获得客户总共消费
	 * @return the totalConsume
	 */
	public int getTotalConsume() {
		return totalConsume;
	}

	/**
	 * 设置客户总共消费
	 * @param totalConsume the totalConsume to set
	 */
	public void setTotalConsume(int totalConsume) {
		this.totalConsume = totalConsume;
	}
	
	
}