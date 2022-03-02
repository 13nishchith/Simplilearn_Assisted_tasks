package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="screensize")
public class Finance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="fid")
	private long finance_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ftype")
	private String ftype;
	
	public Finance() {
		
	}
	
	public Finance(long finance_id, String name,String ftype) {
		this.finance_id=finance_id;
		this.ftype=ftype;
		this.name=name;
	}
	public long getFinance_id() {
		return finance_id;
	}
	public void setFinance_id(long finance_id) {
		this.finance_id = finance_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	
}
