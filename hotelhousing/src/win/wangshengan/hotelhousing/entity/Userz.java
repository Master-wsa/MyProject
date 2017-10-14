/**
 * 
 */
package win.wangshengan.hotelhousing.entity;

/**
 * �ͻ���Ϣʵ����
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
	 * Userzʵ������вι��췽��
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
	 * ��ÿͻ�����
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * ���ÿͻ�����
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * ��ÿͻ��绰����
	 * @return the uphone
	 */
	public long getUphone() {
		return uphone;
	}

	/**
	 * ���ÿͻ��绰����
	 * @param uphone the uphone to set
	 */
	public void setUphone(long uphone) {
		this.uphone = uphone;
	}

	/**
	 * ��ÿͻ�����
	 * @return the upsw
	 */
	public String getUpsw() {
		return upsw;
	}

	/**
	 * ���ÿͻ�����
	 * @param upsw the upsw to set
	 */
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}

	/**
	 * ��ÿͻ��Ƿ�ΪVIP�ͻ�
	 * @return the uvip
	 */
	public int getUvip() {
		return uvip;
	}

	/**
	 * ���ÿͻ�ΪVIP�ͻ�
	 * @param uvip the uvip to set
	 */
	public void setUvip(int uvip) {
		this.uvip = uvip;
	}
	
	
	
}
