package com.test.mysqlpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.mysqlpro.model.Product;

public interface Productrepo extends JpaRepository<Product,Integer> {
Product findByName(String name);
}
