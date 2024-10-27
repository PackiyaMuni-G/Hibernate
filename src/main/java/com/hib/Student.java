package com.hib;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
private int rollno;
private String name;
private int marks;
public int getRollno() {
	return rollno;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
//@OneToMany(mappedBy = "student")
//private List<Laptop> laptop=new ArrayList<>();
@OneToMany(mappedBy = "student")
private List<Laptop> laptop=new ArrayList<>();
public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
}
