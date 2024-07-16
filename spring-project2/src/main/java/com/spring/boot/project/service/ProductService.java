package com.spring.boot.project.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.project.customeException.InfoMissingException;
import com.spring.boot.project.customeException.ProductNotFoundException;
import com.spring.boot.project.dao.ProductDao;
import com.spring.boot.project.dto.ProductDto;
import com.spring.boot.project.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao dao;

	public boolean save_product(ProductDto pd) throws InfoMissingException {
		Product product=new Product();
		 Boolean f=false;
		if( product!=null) {
			if(pd.getName()==null || pd.getName().isBlank()|| pd.getName().isEmpty()) {
				
				throw new InfoMissingException("Invalid product name");
			}else {
				product.setName(pd.getName());
			}
			product.setColor(pd.getColor());
			
			product.setPrice(pd.getPrice());
			product.setEx_date(pd.getEx_date());
			
		    f=dao.save_product(product);
			
		}
		if(f==true)
		{
			return f=true;
		}else {
			throw	new ProductNotFoundException("product not found"+pd);	
			
		}
		
	}
	
	
	public Product getProduct(int id) {
	return	dao.getProduct(id);
	}
}
