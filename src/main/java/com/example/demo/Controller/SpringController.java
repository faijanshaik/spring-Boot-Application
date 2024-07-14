package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bikes;
import com.example.demo.service.BikeService;


@RestController
public class SpringController {
	
	@Autowired
	BikeService bikeService;
	
	@RequestMapping("/getBikes")
	public List<Bikes> getBikes() {
	    List<Bikes> bikes=bikeService.getBikes();
		return bikes;
	}

}
