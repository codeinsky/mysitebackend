package com.myweb.site.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="ABOUTME") 
@XmlRootElement 
public class AboutMe {

	@GeneratedValue 
	@Id 
	private int id; 
	
	@Column 
	private String section;
	
	@Column
	private String comment;
	
	@Column 
	private String details;

	public AboutMe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AboutMe(int id, String section, String comment, String details) {
		super();
		this.id = id;
		this.section = section;
		this.comment = comment;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCooment() {
		return comment;
	}

	public void setCooment(String comment) {
		this.comment = comment;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "AboutMe [id=" + id + ", section=" + section + ", comment=" + comment + ", details=" + details + "]";
	}
	
	
	
	
	
	
}
