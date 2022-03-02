package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.ProductEntity;
import com.springrest.service.ProductService;

@RestController
@RequestMapping(path = "/web")
public class ProductController {
	
	@Autowired
	ProductService productservice;

	@RequestMapping("/allproduct")
	public List<ProductEntity> getAllProduct(){
		System.out.println("done");
		return productservice.getAllProduct();
		
		}
	
	@RequestMapping("/product/{id}")
	public ProductEntity getProduct(@PathVariable int id) {
		return productservice.getProduct(id);
	}
	@RequestMapping(method = RequestMethod.POST,value = "/product")
	public void addProduct(@RequestBody ProductEntity pe) {

		productservice.addProduct(pe);
	
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/product/{id}")
	public void updateProduct(@PathVariable int id, @RequestBody  ProductEntity pe) {
		productservice.updateProduct(id, pe);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/product/{id}")
	public void deleteProduct(@PathVariable  int id) {
		productservice.deleteProduct(id);

}
}
