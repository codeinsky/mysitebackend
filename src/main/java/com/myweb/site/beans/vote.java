package com.myweb.site.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="VOTE")
@XmlRootElement 
public class Vote {
	
	@GeneratedValue
	@Id 
	private int id;

	@Column 
	private Boolean liked;
	
	@Column 
	private Boolean unliked;
	
	@Column 
	private Date date;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getLiked() {
		return liked;
	}

	public void setLiked(Boolean liked) {
		this.liked = liked;
	}

	public Boolean getUnliked() {
		return unliked;
	}

	public void setUnliked(Boolean unliked) {
		this.unliked = unliked;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vote(int id, Boolean liked, Boolean unliked, Date date) {
		super();
		this.id = id;
		this.liked = liked;
		this.unliked = unliked;
		this.date = date;
	} 
	
	
	
	
	
}
