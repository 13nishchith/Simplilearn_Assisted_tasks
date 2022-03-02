package com.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.entity.ProductEntity;
import com.springrest.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrepository;

	public List<ProductEntity> getAllProduct(){
		return productrepository.findAll();
		}
	
	public ProductEntity getProduct(int id) {
		return productrepository.findById(id).get();
	}
	
	public void addProduct(ProductEntity pe) {
		productrepository.save(pe);
	}
	
	public void updateProduct(int id,ProductEntity pe) {
		if(productrepository.findById(id).isPresent()) {
			ProductEntity oldProductEntity=productrepository.findById(id).get();
			oldProductEntity.setName(pe.getName());
			oldProductEntity.setDescription(pe.getDescription());
			productrepository.save(oldProductEntity);
		}
		
		
	}
	public void deleteProduct(int id) {
		productrepository.deleteById(id);
	}
	
}
