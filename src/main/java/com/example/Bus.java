package com.example;

public class Bus extends Car{
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		this.setSpeed(this.getSpeed() + 300);
	}
}
