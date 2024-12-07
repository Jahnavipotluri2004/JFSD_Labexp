package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")

public class User {
	@Id
	@Column(name="user_id")
	private int id;
	@Column(name="user_name",nullable = false,length = 100)
	private String name;
	@Column(name="user_gender",nullable = false,length = 20)
	private String gender;
	@Column(name="user_age",nullable = false)
	private double age;
	@Column(name="user_contact",nullable = false,length = 20,unique = true)
	private String contact;
	@Column(name="user_location",nullable = false,length = 100)
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
