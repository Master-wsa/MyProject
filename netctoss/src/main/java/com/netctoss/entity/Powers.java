package com.netctoss.entity;

import java.io.Serializable;

public class Powers implements Serializable{
	private int pow_id;			//权限ID
	private String pow_name;	//权限名称
	private String pow_class;	//样式
	private String pow_url;		//链接
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	private String state;
	
	public Powers() {
		super();
	}

	public Powers(int pow_id, String pow_name, String pow_class, String pow_url, String b1, String b2, String b3,
			String b4) {
		super();
		this.pow_id = pow_id;
		this.pow_name = pow_name;
		this.pow_class = pow_class;
		this.pow_url = pow_url;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
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
	 * 获取权限名称
	 * @return the pow_name
	 */
	public String getPow_name() {
		return pow_name;
	}

	/**
	 * 设置权限名称
	 * @param pow_name the pow_name to set
	 */
	public void setPow_name(String pow_name) {
		this.pow_name = pow_name;
	}

	/**
	 * 获取样式
	 * @return the pow_class
	 */
	public String getPow_class() {
		return pow_class;
	}

	/**
	 * 设置样式
	 * @param pow_class the pow_class to set
	 */
	public void setPow_class(String pow_class) {
		this.pow_class = pow_class;
	}

	/**
	 * 获取链接
	 * @return the pow_url
	 */
	public String getPow_url() {
		return pow_url;
	}

	/**
	 * 设置链接
	 * @param pow_url the pow_url to set
	 */
	public void setPow_url(String pow_url) {
		this.pow_url = pow_url;
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
	 * 获取权限状态
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置权限状态
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
}
