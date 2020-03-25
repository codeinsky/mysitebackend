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
	private String cooment;
	
	@Column 
	private String details;

	public AboutMe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AboutMe(int id, String section, String cooment, String details) {
		super();
		this.id = id;
		this.section = section;
		this.cooment = cooment;
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
		return cooment;
	}

	public void setCooment(String cooment) {
		this.cooment = cooment;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "AboutMe [id=" + id + ", section=" + section + ", cooment=" + cooment + ", details=" + details + "]";
	}
	
	
	
	
	
	
}
