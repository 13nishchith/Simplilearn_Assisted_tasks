package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhoneNumber() {
		StringBuilder sb=new StringBuilder();
		if(PhoneNumber!=null) {
			for(PhoneNumber p:PhoneNumber) {
				sb.append(p.getPhonenumber()+",");
			}
			
		}
		return sb.toString();
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Id
	@GeneratedValue
	@Column(name="student_id")
	private int studentid;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	List<PhoneNumber> PhoneNumber;

}
