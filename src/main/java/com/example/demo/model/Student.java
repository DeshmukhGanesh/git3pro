package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer studentId;
	
	private String studentName;
	
	private String studentemail;
	
	private Integer studentAge;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentemail=" + studentemail
				+ ", studentAge=" + studentAge + "]";
	}


	
}
