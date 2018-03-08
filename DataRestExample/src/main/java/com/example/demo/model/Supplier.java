package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class Supplier {
	@Id
	@GeneratedValue
	private String supplier_id;
	
	@JsonProperty
	private String contact_name;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String address;
	
	@JsonProperty
	private String city;
	
	@JsonProperty
	private String state;
	
	@JsonProperty
	private String postal_code;
	
	@JsonProperty
	private String country;
	
	@JsonProperty
	private String contact_number;
	
	@JsonProperty
	private Date created_at;
	
	@JsonProperty
	private Date updated_at;
	
	@JsonProperty
	private boolean is_active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Categories categories;

	public Supplier() {
		super();

	}

	public Supplier(String supplier_id, String contact_name, String name, String address, String city, String state,
			String postal_code, String country, String contact_number, Date created_at, Date updated_at,
			boolean is_active, Categories categories) {
		super();
		this.supplier_id = supplier_id;
		this.contact_name = contact_name;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.country = country;
		this.contact_number = contact_number;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.is_active = is_active;
		this.categories = categories;
	}

}
