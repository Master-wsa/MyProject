package com.netctoss.entity;

import java.util.List;

public class Role {
	private int rol_id;			//角色ID
	private String rol_name;	//角色名称
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	private List<Powers> list_powers;
	private String powers;
	
	public Role() {
		super();
	}
	
	public Role(int rol_id, String rol_name, String b1, String b2, String b3, String b4) {
		super();
		this.rol_id = rol_id;
		this.rol_name = rol_name;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
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
	 * 获取角色名称
	 * @return the rol_name
	 */
	public String getRol_name() {
		return rol_name;
	}
	/**
	 * 设置角色名称
	 * @param rol_name the rol_name to set
	 */
	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}
	/**
	 * 获取权限
	 * @return the powers
	 */
	public String getPowers() {
		return powers;
	}

	/**
	 * 设置权限
	 * @param powers the powers to set
	 */
	public void setPowers(String powers) {
		this.powers = powers;
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

	/**
	 * 获取权限集合
	 * @return
	 */
	public List<Powers> getList_powers() {
		return list_powers;
	}

	/**
	 * 设置权限集合
	 * @param list_powers
	 */
	public void setList_powers(List<Powers> list_powers) {
		this.list_powers = list_powers;
		String powers = "";
		for(int i=0;i<list_powers.size();i++){
			if(i != list_powers.size()-1){
				powers += list_powers.get(i).getPow_name()+"、";
			}else{
				powers += list_powers.get(i).getPow_name();
			}
		}
		setPowers(powers);
	}
}
