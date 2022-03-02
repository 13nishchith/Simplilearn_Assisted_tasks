package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sportyshoes.entities.Product;
import com.sportyshoes.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/listprod")
	public String viewListProductPage(Model model) {
		List<Product> listProduct=productService.listAll();
		model.addAttribute("listProduct", listProduct);
		return "product_manage";
	}
	@RequestMapping("/newproduct")
	public String addNewProductPage(Model model) {
		Product product=new Product();
		model.addAttribute("product", product);
		return "new_product";
		
	}
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("product") Product product, Model md) 
	{   
		
		productService.save(product);
		List<Product>listProduct= productService.listAll();
		md.addAttribute("listProduct", listProduct);
		
		return"product_manage";
	
	}

	
	

}
