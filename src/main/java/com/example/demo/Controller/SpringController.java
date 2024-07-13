package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bikes;


@RestController
public class SpringController {
	
	@RequestMapping("/getBikes")
	public List<Bikes> getBikes() {
		//Bikes bykes=new Bikes();
		
		List<Bikes> bikes=Arrays.asList(new Bikes("pulsur120","1,20,000","2023"),
		                            	new Bikes("splnder120","1,20,000","2024"),
		                            	new Bikes("yamaha MT-15","1,50,000","2022"),
		                            	new Bikes("Bjaja boxer","1,10,000","2023"));
		return bikes;
	}

}
