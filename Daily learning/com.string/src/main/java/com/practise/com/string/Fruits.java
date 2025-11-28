package com.practise.com.string;

public class Fruits {
	
	private String name;
	private String colour;
	private Double price;
	
	public Fruits(String name, String colour, Double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	
	

}
