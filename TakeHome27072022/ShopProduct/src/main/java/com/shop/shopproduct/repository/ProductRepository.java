package com.shop.shopproduct.repository;

import java.util.List;

import com.shop.shopproduct.entity.Product;

public interface ProductRepository {
	public List<Product> findAll();

	public Product findById(Integer id);
	public void saveOrUpdate(Product product);
	
	public void deleteById(Integer id);
}
