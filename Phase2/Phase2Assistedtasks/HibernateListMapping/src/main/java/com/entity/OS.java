package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="screensize")
public class OS {
	
@Id
@GeneratedValue(strategy = GenerationType.TABLE)
@Column(name="osid")
private long osid;

@Column(name="name")
private String name;

public OS(long osid,String name) {
	this.osid=osid;
	this.name=name;
}public OS() {
	
}

public long getOsid() {
	return osid;
}

public void setOsid(long osid) {
	this.osid = osid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
