package com.netctoss.entity;

import java.sql.Date;

public class Report {
	/*private Account account;//账务实体
	private Bill bill;*/
	private String ser_ip;
	private int acc_id;
	private String acc_login;
	private String acc_name;
	private String acc_idc;
	private String acc_tel;
	private Date bil_time;
	private int bil_alltime;
	private int sat;
	private int t1;
	private int t0;
	private int t2;
/*	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Bill getBill() {
		return bill;
	}*/
	public int getT1() {
		return t1;
	}
	public void setT1(int t1) {
		this.t1 = t1;
	}
	public int getT0() {
		return t0;
	}
	public void setT0(int t0) {
		this.t0 = t0;
	}
	public int getT2() {
		return t2;
	}
	public void setT2(int t2) {
		this.t2 = t2;
	}
	/*public void setBill(Bill bill) {
		this.bill = bill;
	}*/
	public String getSer_ip() {
		return ser_ip;
	}
	public void setSer_ip(String ser_ip) {
		this.ser_ip = ser_ip;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_login() {
		return acc_login;
	}
	public void setAcc_login(String acc_login) {
		this.acc_login = acc_login;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_idc() {
		return acc_idc;
	}
	public void setAcc_idc(String acc_idc) {
		this.acc_idc = acc_idc;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public String getAcc_tel() {
		return acc_tel;
	}
	public void setAcc_tel(String acc_tel) {
		this.acc_tel = acc_tel;
	}
	public Date getBil_time() {
		return bil_time;
	}
	public void setBil_time(Date bil_time) {
		this.bil_time = bil_time;
	}
	public int getBil_alltime() {
		return bil_alltime;
	}
	public void setBil_alltime(int bil_alltime) {
		this.bil_alltime = bil_alltime;
	}
	
}
