package com.npci.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.npci.shop.entity.Category;



@CrossOrigin("http://localhost:4200/")
public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
