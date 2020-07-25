package com.test.mysqlpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mysqlpro.model.Product;
import com.test.mysqlpro.repository.Productrepo;



@Service
public class Productservice {
	@Autowired
	private Productrepo repo;
	public Product saveProduct(Product pro)
	{
		return repo.save(pro);
	}
	
	public List<Product> saveProducts(List<Product> pros)
	{
		return repo.saveAll(pros);
	}
	
	public Product getProduct(int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public List<Product> getProduct()
	{
		return repo.findAll();
	}
	
	public String deleteProduct(int id)
	{
		repo.deleteById(id);
		return ("deleted"+id);
	}
	
	public Product updateProduct(Product product)
	{
		Product exi=repo.findById(product.getId()).orElse(null);
		exi.setName(product.getName());
		exi.setPrice(product.getPrice());
		exi.setQuantity(product.getQuantity());
		return repo.save(exi);
		
	}
	
	public Product getProductbyname(String name)
	{
		return repo.findByName(name);
	}

}
