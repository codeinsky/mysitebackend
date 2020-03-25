package com.myweb.site.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="VISITOR")
@XmlRootElement 
public class Visitor {
	
	@GeneratedValue 
	@Id 
	private int id;
	
	@Column
	private Date date;
	
	@Column 
	private String ip;
	
	@Column 
	private String comment;

	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visitor(int id, Date date, String ip, String comment) {
		super();
		this.id = id;
		this.date = date;
		this.ip = ip;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Visitor [id=" + id + ", date=" + date + ", ip=" + ip + ", comment=" + comment + "]";
	}
	
	
	
	
	

}
