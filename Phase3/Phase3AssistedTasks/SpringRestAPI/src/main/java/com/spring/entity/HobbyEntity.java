package com.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HobbyEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",updatable=false,nullable=false)
	private Integer id;
	
	@Column
	private Integer personid;
	
	@Column
	private String name;

	public HobbyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HobbyEntity(int personid, String name) {
		super();
		this.personid = personid;
		this.name = name;
	}

	

	public Integer getPersonid() {
		return personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
