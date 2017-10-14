package com.netctoss.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 管理员实体类
 * @author anjia
 *
 */
public class Admin implements Serializable{
	private int adm_id;				//管理员ID
	private String adm_login;		//登录账号
	private String adm_pwd;			//密码
	private String adm_name;		//姓名
	private String adm_tel;			//电话号码
	private String adm_email;		//邮箱
	private Timestamp adm_date;		//授权日期
	private String adm_img;			//头像
	private List<Role> lr;			//角色集合
	private List<Powers> lp;		//权限集合
	private int pow_id;				//权限ID
	private int rol_id;				//角色ID
	private String rol_name;		//角色名字
	private String b1;				//备用字段
	private String b2;
	private String b3;
	private String b4;
	
	/**
	 * 无参构造
	 */
	public Admin() {
		super();
	}

	/**
	 * 有参构造
	 * @param adm_id
	 * @param adm_login
	 * @param adm_pwd
	 * @param adm_name
	 * @param adm_tel
	 * @param adm_email
	 * @param adm_date
	 * @param adm_img
	 * @param b1
	 * @param b2
	 * @param b3
	 * @param b4
	 */
	public Admin(int adm_id, String adm_login, String adm_pwd, String adm_name, String adm_tel, String adm_email,
			Timestamp adm_date, String adm_img, String b1, String b2, String b3, String b4) {
		super();
		this.adm_id = adm_id;
		this.adm_login = adm_login;
		this.adm_pwd = adm_pwd;
		this.adm_name = adm_name;
		this.adm_tel = adm_tel;
		this.adm_email = adm_email;
		this.adm_date = adm_date;
		this.adm_img = adm_img;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
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
	 * 获取登录账号
	 * @return the adm_login
	 */
	public String getAdm_login() {
		return adm_login;
	}

	/**
	 * 设置登录账号
	 * @param adm_login the adm_login to set
	 */
	public void setAdm_login(String adm_login) {
		this.adm_login = adm_login;
	}

	/**
	 * 获取密码
	 * @return the adm_pwd
	 */
	public String getAdm_pwd() {
		return adm_pwd;
	}

	/**
	 * 设置密码
	 * @param adm_pwd the adm_pwd to set
	 */
	public void setAdm_pwd(String adm_pwd) {
		this.adm_pwd = adm_pwd;
	}

	/**
	 * 获取管理员姓名
	 * @return the adm_name
	 */
	public String getAdm_name() {
		return adm_name;
	}

	/**
	 * 设置管理员姓名
	 * @param adm_name the adm_name to set
	 */
	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}

	/**
	 * 获取电话号码
	 * @return the adm_tel
	 */
	public String getAdm_tel() {
		return adm_tel;
	}

	/**
	 * 设置电话号码
	 * @param adm_tel the adm_tel to set
	 */
	public void setAdm_tel(String adm_tel) {
		this.adm_tel = adm_tel;
	}

	/**
	 * 获取邮箱
	 * @return the adm_email
	 */
	public String getAdm_email() {
		return adm_email;
	}

	/**
	 * 设置邮箱
	 * @param adm_email the adm_email to set
	 */
	public void setAdm_email(String adm_email) {
		this.adm_email = adm_email;
	}

	/**
	 * 获取授权日期
	 * @return the adm_date
	 */
	public Timestamp getAdm_date() {
		return adm_date;
	}

	/**
	 * 设置授权日期
	 * @param adm_date the adm_date to set
	 */
	public void setAdm_date(Timestamp adm_date) {
		this.adm_date = adm_date;
	}

	/**
	 * 获取头像
	 * @return the adm_img
	 */
	public String getAdm_img() {
		return adm_img;
	}

	/**
	 * 设置头像
	 * @param adm_img the adm_img to set
	 */
	public void setAdm_img(String adm_img) {
		this.adm_img = adm_img;
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
	 * @return the rol_id
	 */
	public int getRol_id() {
		return rol_id;
	}

	/**
	 * @param rol_id the rol_id to set
	 */
	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	/**
	 * 获取角色名字
	 * @return the rol_name
	 */
	public String getRol_name() {
		return rol_name;
	}

	/**
	 * 设置角色名字
	 * @param rol_name the rol_name to set
	 */
	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}

	/**
	 * 获取角色集合
	 * @return the lr
	 */
	public List<Role> getLr() {
		return lr;
	}

	/**
	 * 设置角色集合
	 * @param lr the lr to set
	 */
	public void setLr(List<Role> lr) {
		this.lr = lr;
	}

	/**
	 * 获取权限集合
	 * @return the lp
	 */
	public List<Powers> getLp() {
		return lp;
	}

	/**
	 * 设置权限集合
	 * @param lp the lp to set
	 */
	public void setLp(List<Powers> lp) {
		this.lp = lp;
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
