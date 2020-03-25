package com.myweb.site.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="ADMIN_CREDENTIALS")
@XmlRootElement
public class AdminLogIn {

	@GeneratedValue
	@Id
	private int id;
	
	@Column 
	private String email;
	
	@Column 
	private String userName;
	
	
	@Column 
	private String passWord; 
	
	
	@Column String phone;


	public AdminLogIn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdminLogIn(int id, String email, String userName, String passWord, String phone) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "AdminLogIn [id=" + id + ", email=" + email + ", userName=" + userName + ", passWord=" + passWord
				+ ", phone=" + phone + "]";
	}
	
	
	
	
	
}
