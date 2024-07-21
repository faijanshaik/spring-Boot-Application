package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Bikes;

@Service
public class BikeService {
	private String methodName;
	private static final Logger logger=LoggerFactory.getLogger(BikeService.class);
	
	private List<Bikes> bikes=new ArrayList<>(Arrays.asList(new Bikes("pulsur120","1,20,000","2023"),
        	new Bikes("splnder120","1,20,000","2024"),
        	new Bikes("yamaha MT-15","1,50,000","2022"),
        	new Bikes("Bjaja boxer","1,10,000","2023"),
        	new Bikes("Hero Xtreme","1,40,000","2024")));
	
	public List<Bikes> getBikes() {
		Bikes bike=new Bikes();
		return bikes;
	}
	
	public Bikes getBike(String id) {
		methodName=":getBike";
		logger.info("{}::ENTER",methodName);
		Bikes bike=bikes.stream().filter(b->b.getBikeName().equals(id)).findFirst().orElse(null);
		logger.info("bike:",bike);
		return bike;
	}

	public void addBikes(Bikes bikes2) {
		bikes.add(bikes2);
		
	}

}
