package win.wangshengan.hotelhousing.entity;

/**
 * roomsʵ����
 * @author AnJia
 *
 */
public class Rooms {
	private int rno;
	private String rtype;
	private String rstate;
	private String rconfigue;
	private int rvalue;
	/**
	 * 
	 */
	public Rooms() {
		super();
	}
	/**
	 * rooms�вι���
	 * @param rno
	 * @param rtype
	 * @param rstate
	 * @param rconfigue
	 * @param rvalue
	 */
	public Rooms(int rno, String rtype, String rstate, String rconfigue,
			int rvalue) {
		super();
		this.rno = rno;
		this.rtype = rtype;
		this.rstate = rstate;
		this.rconfigue = rconfigue;
		this.rvalue = rvalue;
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
	 * ��÷����ͺ�
	 * @return the rtype
	 */
	public String getRtype() {
		return rtype;
	}
	/**
	 * ���÷����ͺ�
	 * @param rtype the rtype to set
	 */
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	/**
	 * ��÷���״̬
	 * @return the rstate
	 */
	public String getRstate() {
		return rstate;
	}
	/**
	 * ���÷���״̬
	 * @param rstate the rstate to set
	 */
	public void setRstate(String rstate) {
		this.rstate = rstate;
	}
	/**
	 * ��÷�������
	 * @return the rconfigue
	 */
	public String getRconfigue() {
		return rconfigue;
	}
	/**
	 * ���÷�������
	 * @param rconfigue the rconfigue to set
	 */
	public void setRconfigue(String rconfigue) {
		this.rconfigue = rconfigue;
	}
	/**
	 * ��÷���۸�
	 * @return the rvalue
	 */
	public int getRvalue() {
		return rvalue;
	}
	/**
	 * ���÷���۸�
	 * @param rvalue the rvalue to set
	 */
	public void setRvalue(int rvalue) {
		this.rvalue = rvalue;
	}
	
	
}
