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
		methodName=":getBikes";
		logger.info("{}::ENTER",methodName);
	    List<Bikes> bikes=bikeService.getBikes();
	    logger.info("Bikes :{}",bikes);
	    logger.info("{}::EXIT",methodName);
		return bikes;
	}
	
	@RequestMapping("/getBikes/{id}")
	public Bikes getBike(@PathVariable String id) {
		methodName=":getBike";
		logger.info("{}::ENTER",methodName);
		logger.info(id);
		logger.info("id :{}",id);
		logger.info("{}::EXIT",methodName);
		return bikeService.getBike(id);
	}
	
	// you can use @PostMapping("/addBikes") instead of @RequestMapping(method=RequestMethod.POST,value="/getBikes")
	@RequestMapping(method=RequestMethod.POST,value="/getBikes")
	public ResponseEntity<String>  addBikes(@RequestBody Bikes bikes) {
		methodName=":addBikes";
		logger.info("{}::ENTER",methodName);
		try {
			logger.info("invoking controller Service");
			bikeService.addBikes(bikes);
			logger.info("{}::EXIT",methodName);
			return new ResponseEntity<>("Successfully added", HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>("Failed to add bikes", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	  
}
