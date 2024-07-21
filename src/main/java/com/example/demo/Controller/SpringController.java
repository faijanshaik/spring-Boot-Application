package com.example.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bikes;
import com.example.demo.service.BikeService;

@RequestMapping("/api")
@RestController
public class SpringController {
	public String methodName;
	private static final Logger logger=LoggerFactory.getLogger(SpringController.class);
	
	@Autowired
	BikeService bikeService;
	
	@RequestMapping("/getBikes")
	public List<Bikes> getBikes() {
	    List<Bikes> bikes=bikeService.getBikes();
		return bikes;
	}
	
	@RequestMapping("/getBikes/{id}")
	public Bikes getBike(@PathVariable String id) {
		methodName=":getBike";
		logger.info("{}::ENTER",methodName);
		logger.info(id);
		logger.info("{}::EXIT",methodName);
		return bikeService.getBike(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/getBikes")
	public ResponseEntity<String>  addBikes(@RequestBody Bikes bikes) {
		try {
			bikeService.addBikes(bikes);
			return new ResponseEntity<>("Successfully added", HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>("Failed to add bikes", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
}
