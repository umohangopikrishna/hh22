package com.test.mysqlpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.mysqlpro.model.Product;
import com.test.mysqlpro.repository.Productrepo;
import com.test.mysqlpro.service.Productservice;

@RestController
public class Productcontroller {
	
	@Autowired
	private Productservice service;
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products)
	{
		return service.saveProducts(products);
	}
	@GetMapping("/getall")
	public  List<Product> getProducts(){
		return service.getProduct();
	}
	
	@GetMapping("/getProduct/{name}")
	public Product getbyid(@PathVariable String name)
	{
		return service.getProductbyname(name);
	}
	
	@GetMapping("/getProductid/{id}")
	public Product getbyid(@PathVariable int id)
	{
		return service.getProduct(id);
	}
	
	@PutMapping("/update")
	public Product updatedata(@RequestBody Product pro)
	{
		return service.updateProduct(pro);
	}
	@DeleteMapping("/delete/{id}")
	public String deltetedata(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}

}
