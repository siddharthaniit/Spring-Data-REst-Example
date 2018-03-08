package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;

import com.example.demo.util.Encrypt;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private int active;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@HandleBeforeCreate
	public void onBeforeSave(Register register)
	{
		String mDbytesToString = Encrypt.MDbytesToString(register.getPassword().getBytes());
		register.setPassword(mDbytesToString);
		System.out.println(mDbytesToString);
		
	}

}
