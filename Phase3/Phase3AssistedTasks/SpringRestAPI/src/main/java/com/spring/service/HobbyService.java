package com.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.HobbyEntity;
import com.spring.repository.HobbyRepository;

@Service
public class HobbyService {
	
	@Autowired
	HobbyRepository hobbyrepository;
	
	public HobbyEntity getProduct(Integer id) {
		return hobbyrepository.findById(id).get();
	}
	public void addHobby(HobbyEntity he) {
		hobbyrepository.save(he);
	}
	
}
