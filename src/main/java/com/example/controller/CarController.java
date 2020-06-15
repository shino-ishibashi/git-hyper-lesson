package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Car;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@ModelAttribute
	public Car setCar() {
		return new Car();
	}
	
	@RequestMapping("")
	public String index() {
		return "Car-run";
	}
	
	@RequestMapping("/run")
	public String run(Car car, Model model) {
		car.run();
		if(car.getSpeed() >= 1000) {
			car.burn();
		}
		model.addAttribute("speed", car.getSpeed());
		return "Car-result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "Car-result";
	}
}
