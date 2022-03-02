package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colors")
public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id")
	private long colorid;

	@Column(name="name")
	private String name;
	
	public Color(){
		
		
	}
	public Color(long colorid, String name) {
		this.colorid=0;
		this.name=name;
	}
	
	public long getColorid() {
		return colorid;
	}
	public void setColorid(long colorid) {
		this.colorid = colorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
