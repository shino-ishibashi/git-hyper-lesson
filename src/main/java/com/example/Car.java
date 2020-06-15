package com.example;

public class Car {
	private Integer speed;
	private String color;
	
	public void run() {
		this.speed += 5;
	}
	
	
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
