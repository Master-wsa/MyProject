package com.netctoss.entity;

public class Adminrole {
	private int admrol_id;		//管理员角色ID
	private int adm_id;			//管理员ID
	private int rol_id;			//角色ID
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	
	public Adminrole() {
		super();
	}

	public Adminrole(int admrol_id, int adm_id, int rol_id, String b1, String b2, String b3, String b4) {
		super();
		this.admrol_id = admrol_id;
		this.adm_id = adm_id;
		this.rol_id = rol_id;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
	}

	/**
	 * 获取管理员角色ID
	 * @return the admrol_id
	 */
	public int getAdmrol_id() {
		return admrol_id;
	}

	/**
	 * 设置管理员角色ID
	 * @param admrol_id the admrol_id to set
	 */
	public void setAdmrol_id(int admrol_id) {
		this.admrol_id = admrol_id;
	}

	/**
	 * 获取管理员ID
	 * @return the adm_id
	 */
	public int getAdm_id() {
		return adm_id;
	}

	/**
	 * 设置管理员ID
	 * @param adm_id the adm_id to set
	 */
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	/**
	 * 获取角色ID
	 * @return the rol_id
	 */
	public int getRol_id() {
		return rol_id;
	}

	/**
	 * 设置角色ID
	 * @param rol_id the rol_id to set
	 */
	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	/**
	 * @return the b1
	 */
	public String getB1() {
		return b1;
	}

	/**
	 * @param b1 the b1 to set
	 */
	public void setB1(String b1) {
		this.b1 = b1;
	}

	/**
	 * @return the b2
	 */
	public String getB2() {
		return b2;
	}

	/**
	 * @param b2 the b2 to set
	 */
	public void setB2(String b2) {
		this.b2 = b2;
	}

	/**
	 * @return the b3
	 */
	public String getB3() {
		return b3;
	}

	/**
	 * @param b3 the b3 to set
	 */
	public void setB3(String b3) {
		this.b3 = b3;
	}

	/**
	 * @return the b4
	 */
	public String getB4() {
		return b4;
	}

	/**
	 * @param b4 the b4 to set
	 */
	public void setB4(String b4) {
		this.b4 = b4;
	}
	
}
