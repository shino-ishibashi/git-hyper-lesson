package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Car;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@RequestMapping("")
	public String index() {
		return "Car";
	}
	
	@RequestMapping("/run")
	public String run(Car car, Model model) {
		car.run();
		if(car.getSpeed() >= 1000) {
			car.burn();
		}
		model.addAttribute("speed", car.getSpeed());
		return "Car";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "Car-result";
	}
}
