package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="phone_number")
public class PhoneNumber {
	
	@Id
	@GeneratedValue
	@Column(name="phone_id")
	private int phoneid;
	
	@Column(name="phone_type")
	private String phonetype;
	
	@Column(name="phone_number")
	private String phonenumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	List<Student> Student;
	
	public int getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}

	public String getPhonetype() {
		return phonetype;
	}

	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public List<Student> getStudent() {
		return Student;
	}

	public void setStudent(List<Student> student) {
		Student = student;
	}

	

}
