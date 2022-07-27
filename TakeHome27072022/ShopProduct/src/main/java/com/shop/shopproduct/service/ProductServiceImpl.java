package com.shop.shopproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.shopproduct.entity.Product;
import com.shop.shopproduct.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepo;
	
	@Override
	public List<Product> findAll() {
		
		return productrepo.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return productrepo.findById(id);
	}

	@Override
	public void saveOrUpdate(Product product) {
		productrepo.saveOrUpdate(product);
		
	}

	@Override
	public void deleteById(Integer id) {
		productrepo.deleteById(id);
		
	}

}
