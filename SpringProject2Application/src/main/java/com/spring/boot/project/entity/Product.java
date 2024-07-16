package com.spring.boot.project.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.time.LocalDate;

@Entity
@Table(name = "Product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private String name;
	
	private String password;
	

	private String color;

	private double price;
	
	private String role;
	
	

//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate ex_date;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String color, double price, LocalDate ex_date) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.ex_date = ex_date;
	}

	public Product(int id, String name, String password, String color, double price, String role, LocalDate ex_date) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.color = color;
		this.price = price;
		this.role = role;
		this.ex_date = ex_date;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getEx_date() {
		return ex_date;
	}

	public void setEx_date(LocalDate ex_date) {
		this.ex_date = ex_date;
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", password=" + password + ", color=" + color + ", price="
				+ price + ", role=" + role + ", ex_date=" + ex_date + "]";
	}
	

}
