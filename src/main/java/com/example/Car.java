package com.example;

public class Car {
	private Integer speed;
	private String color;
	
	public void run() {
		this.speed += 500;
	}
	
	public void brake() {
		this.speed = 0;
	}
	
	
	
	
	
	
	
	
	
	public void yellow() {
		this.color = "yellow";
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
