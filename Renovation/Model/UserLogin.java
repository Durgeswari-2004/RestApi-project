package com.ex.Renovation.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="UserLogin")
public class UserLogin {
	@Id
	@GeneratedValue
	@Column(name="mailId")
	private int emailId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="passWord")
	private String password;
	
	private long mobile_number;
	
	public UserLogin() {
		super();
	}
	public UserLogin(int emaiId, String userName, String password) {
		super();
		this.emailId = emaiId;
		this.userName = userName;
		this.password = password;
	}
	public int getEmaiId() {
		return emailId;
	}
	public void setEmaiId(int emaiId) {
		this.emailId = emaiId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
}