package com.spring.boot.project.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductDto {
	
	private int id;

	private String name;
	
	private String color;

	private double price;


	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate ex_date;

	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDto(int id, String name, String color, double price, LocalDate ex_date) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
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

	public LocalDate getEx_date() {
		return ex_date;
	}

	public void setEx_date(LocalDate ex_date) {
		this.ex_date = ex_date;
	}

	@Override
	public String toString() {
		return "Product_dto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", ex_date=" + ex_date
				+ "]";
	}
	
}
