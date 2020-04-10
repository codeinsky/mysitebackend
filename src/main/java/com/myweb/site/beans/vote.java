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
	private Boolean disliked;
	
	@Column 
	private Date date;
	
	@Column
	private String ipVoted;
	
	@Column 
	private boolean cookieVoted;
	

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
	
	public Boolean getDisliked() {
		return disliked;
	}

	public void setDisliked(Boolean disliked) {
		this.disliked = disliked;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	public String getIpVoted() {
		return ipVoted;
	}

	public void setIpVoted(String ipVoted) {
		this.ipVoted = ipVoted;
	}

	public boolean isCookieVoted() {
		return cookieVoted;
	}

	public void setCookieVoted(boolean cookieVoted) {
		this.cookieVoted = cookieVoted;
	}

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vote(int id, Boolean liked, Boolean disliked, Date date, String ipVoted, boolean cookieVoted) {
		super();
		this.id = id;
		this.liked = liked;
		this.disliked = disliked;
		this.date = date;
		this.ipVoted = ipVoted;
		this.cookieVoted = cookieVoted;
	}
	
}
