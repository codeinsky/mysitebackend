package com.myweb.site.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="VOTE")
@XmlRootElement 
public class Vote {
	
	@Id 
	@GeneratedValue
	private int id;
	
	@Column
	private Boolean like;
	
	@Column
	private Boolean dislike;
	
	@Column
	private String comment;
	
	@Column 
	private Date date;

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vote(int id, Boolean like, Boolean dislike, String comment, Date date) {
		super();
		this.id = id;
		this.like = like;
		this.dislike = dislike;
		this.comment = comment;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getLike() {
		return like;
	}

	public void setLike(Boolean like) {
		this.like = like;
	}

	public Boolean getDislike() {
		return dislike;
	}

	public void setDislike(Boolean dislike) {
		this.dislike = dislike;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", like=" + like + ", dislike=" + dislike + ", comment=" + comment + ", date=" + date
				+ "]";
	}
	
	

}
