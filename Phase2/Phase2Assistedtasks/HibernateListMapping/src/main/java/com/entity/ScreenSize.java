package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="screensize")
public class ScreenSize {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="sid")
	private long screeid;
	
	@Column(name="size")
	private String size;
	
	public long getScreeid() {
		return screeid;
	}
	public void setScreeid(long screeid) {
		this.screeid = screeid;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public ScreenSize() {
		
	}
	public ScreenSize(long screenid,String size) {
		this.screeid=screenid;
		this.size=size;
	}

}
