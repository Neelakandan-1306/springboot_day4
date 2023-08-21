package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	
	@Id
	private int id;
	private String name;
	private String stream;
	private String mail;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(int id, String name, String stream,String mail) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.mail=mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
