/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

import java.sql.Date;

/**
 * ��˾Ӫҵ��ʵ����
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
	 * �вι���
	 * @param endTime
	 * @param totalMoney
	 */
	public Turnover(String endTime, int totalMoney) {
		super();
		this.endTime = endTime;
		this.totalMoney = totalMoney;
	}

	/**
	 * ����˷�ʱ��
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * �����˷�ʱ��
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * ��õ��칲׬���
	 * @return the totalMoney
	 */
	public int getTotalMoney() {
		return totalMoney;
	}

	/**
	 * ���õ��칲׬���
	 * @param totalMoney the totalMoney to set
	 */
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
}
