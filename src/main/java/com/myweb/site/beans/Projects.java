package com.myweb.site.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PROJECTS")
public class Projects {
	
	@GeneratedValue 
	@Id
	private int id;
	
	@Column 
	private String name;
	
	@Column
	private String system;
	
	@Column 
	private String comment;
	
	@Column 
	private String links;

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int id, String name, String system, String comment, String links) {
		super();
		this.id = id;
		this.name = name;
		this.system = system;
		this.comment = comment;
		this.links = links;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", name=" + name + ", system=" + system + ", comment=" + comment + ", links="
				+ links + "]";
	}
	
	
	
	
	

}
