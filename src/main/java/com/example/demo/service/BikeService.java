package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Bikes;

@Service
public class BikeService {
	
	private List<Bikes> bikes=Arrays.asList(new Bikes("pulsur120","1,20,000","2023"),
        	new Bikes("splnder120","1,20,000","2024"),
        	new Bikes("yamaha MT-15","1,50,000","2022"),
        	new Bikes("Bjaja boxer","1,10,000","2023"),
        	new Bikes("Hero Xtreme","1,40,000","2024"));
	
	public List<Bikes> getBikes() {
		
		return bikes;
	}

}
