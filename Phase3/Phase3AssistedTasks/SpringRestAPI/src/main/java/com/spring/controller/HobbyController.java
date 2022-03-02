package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.HobbyEntity;
import com.spring.service.HobbyService;

@RestController
@RequestMapping("/web")
public class HobbyController {

	@Autowired
	HobbyService hobbyservice;
	
	@RequestMapping("/hobby/{id}")
	public HobbyEntity getProduct(@PathVariable int id) {
		return hobbyservice.getProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/hobby")
	public void addHobby(@RequestBody  HobbyEntity he) {
		hobbyservice.addHobby(he);
	}


}
