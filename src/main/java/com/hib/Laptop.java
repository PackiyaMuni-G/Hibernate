package com.hib;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
private int lid;
//	@ManyToOne
//	private Student student;
	@ManyToMany
	private List<Student> student=new ArrayList<>();
public int getLid() {
	return lid;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
private String lname;
}