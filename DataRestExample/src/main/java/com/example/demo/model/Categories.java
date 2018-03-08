package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class Categories {
	@Id
	@GeneratedValue
	private int category_id;
	@Column(unique = true)
	@JsonProperty
	private String category_name;
	@JsonProperty
	private String category_description;
	@JsonProperty
	private int position;
	@JsonProperty
	private String image;
	@JsonProperty
	private String created_at;
	@JsonProperty
	private String updated_at;

	

}
