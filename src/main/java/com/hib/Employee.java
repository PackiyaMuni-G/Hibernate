package com.hib;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", domain=" + domain
				+ "]";
	}
private String name;

   private int age;
   private 	Address address;
   public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
private String domain ;
}
