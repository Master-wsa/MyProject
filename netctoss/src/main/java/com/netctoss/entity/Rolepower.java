package com.netctoss.entity;

public class Rolepower {
	private int rolpow_id;		//角色权限ID
	private int rol_id;			//角色ID
	private int pow_id;			//权限ID
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	
	public Rolepower() {
		super();
	}

	public Rolepower(int rolpow_id, int rol_id, int pow_id, String b1, String b2, String b3, String b4) {
		super();
		this.rolpow_id = rolpow_id;
		this.rol_id = rol_id;
		this.pow_id = pow_id;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
	}

	/**
	 * 获取角色权限ID
	 * @return the rolpow_id
	 */
	public int getRolpow_id() {
		return rolpow_id;
	}

	/**
	 * 设置角色权限ID
	 * @param rolpow_id the rolpow_id to set
	 */
	public void setRolpow_id(int rolpow_id) {
		this.rolpow_id = rolpow_id;
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
	 * 获取权限ID
	 * @return the pow_id
	 */
	public int getPow_id() {
		return pow_id;
	}

	/**
	 * 设置权限ID
	 * @param pow_id the pow_id to set
	 */
	public void setPow_id(int pow_id) {
		this.pow_id = pow_id;
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
