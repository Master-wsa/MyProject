/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * 公司营业额实体类
 * @author AnJia
 *
 */
public class Turnover {
	private String endTime;
	private int totalMoney;
	
	/**
	 * 
	 */
	public Turnover() {
		super();
	}

	/**
	 * 有参构造
	 * @param endTime
	 * @param totalMoney
	 */
	public Turnover(String endTime, int totalMoney) {
		super();
		this.endTime = endTime;
		this.totalMoney = totalMoney;
	}

	/**
	 * 获得退房时间
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * 设置退房时间
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获得当天共赚金额
	 * @return the totalMoney
	 */
	public int getTotalMoney() {
		return totalMoney;
	}

	/**
	 * 设置当天共赚金额
	 * @param totalMoney the totalMoney to set
	 */
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
}
