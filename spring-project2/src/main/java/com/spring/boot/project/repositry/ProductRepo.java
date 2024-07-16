package com.spring.boot.project.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.project.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
