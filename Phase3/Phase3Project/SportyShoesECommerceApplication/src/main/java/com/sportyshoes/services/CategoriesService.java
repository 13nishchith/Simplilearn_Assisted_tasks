package com.sportyshoes.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.entities.Categories;
import com.sportyshoes.repository.CategoriesRepository;

@Service
@Transactional
public class CategoriesService {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	public List<Categories>listAll(){
		return categoriesRepository.findAll();
	}
	public void save(Categories categories) {
	categoriesRepository.save(categories);
}
	public Categories get(long id) {
	return categoriesRepository.findById(id).get();
}
	public void delete(long id) {
	categoriesRepository.deleteById(id);
}
}
