package com.hib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Employee {
   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Id
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", domain=" + domain + "]";
	}
private String name;

   private int age;
   private String domain ;
}
