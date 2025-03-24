package com.example.taberogu.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "restaurant")
@Data
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "image_name")
	private String imageName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "hours")
	private String hours;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "postal_code")
	private String postalcode;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone_number")
	private String phonenumber;
	
	@Column(name = "regular_holiday")
	private String regularholiday;
	
	
}
