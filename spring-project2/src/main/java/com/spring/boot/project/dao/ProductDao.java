package com.spring.boot.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.project.customeException.ProductNotFoundException;
import com.spring.boot.project.entity.Product;
import com.spring.boot.project.repositry.ProductRepo;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepo repo;
	
	
	// save data in database
	
	public boolean save_product(Product product) {
	Product p=	repo.save(product);
	if(p!=null) {
		return true;
	}
	return false;

	}
	
	public Product getProduct(int id)  {
		
		try {
			Product p=repo.findById(id).get();
			if(p!=null) {
				return p;
			}else {
				
				throw new ProductNotFoundException("Product missing");
			}
	
		} catch (Exception e) {
			
			throw new ProductNotFoundException("Sorry ! This product id is not found. "+id);
			
		}

		
		
	}
	

}
