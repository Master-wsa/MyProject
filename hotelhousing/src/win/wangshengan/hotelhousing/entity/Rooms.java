package win.wangshengan.hotelhousing.entity;

/**
 * rooms实体类
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
	 * rooms有参构造
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
	 * 获得房间型号
	 * @return the rtype
	 */
	public String getRtype() {
		return rtype;
	}
	/**
	 * 设置房间型号
	 * @param rtype the rtype to set
	 */
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	/**
	 * 获得房间状态
	 * @return the rstate
	 */
	public String getRstate() {
		return rstate;
	}
	/**
	 * 设置房间状态
	 * @param rstate the rstate to set
	 */
	public void setRstate(String rstate) {
		this.rstate = rstate;
	}
	/**
	 * 获得房间配置
	 * @return the rconfigue
	 */
	public String getRconfigue() {
		return rconfigue;
	}
	/**
	 * 设置房间配置
	 * @param rconfigue the rconfigue to set
	 */
	public void setRconfigue(String rconfigue) {
		this.rconfigue = rconfigue;
	}
	/**
	 * 获得房间价格
	 * @return the rvalue
	 */
	public int getRvalue() {
		return rvalue;
	}
	/**
	 * 设置房间价格
	 * @param rvalue the rvalue to set
	 */
	public void setRvalue(int rvalue) {
		this.rvalue = rvalue;
	}
	
	
}
